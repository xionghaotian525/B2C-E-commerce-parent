package com.xionghaotian.service.impl;

import com.alibaba.excel.EasyExcel;
import com.xionghaotian.entity.product.Category;
import com.xionghaotian.exception.GuiguException;
import com.xionghaotian.listener.ExcelListener;
import com.xionghaotian.mapper.CategoryMapper;
import com.xionghaotian.service.CategoryService;
import com.xionghaotian.vo.common.ResultCodeEnum;
import com.xionghaotian.vo.product.CategoryExcelVo;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.commons.collections.CollectionUtils;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;


import java.io.IOException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName CategoryServiceImpl
 * @Description 管理员端-商品管理-分类管理-服务层接口实现类
 * @Author XiongHaoTian
 * @Date 2024年06月13日 12:26
 * @Version 1.0
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    private CategoryMapper categoryMapper;

    //该函数根据给定的父分类id查询所有子分类数据，并遍历子分类集合，统计每个子分类下子分类的数量，设置是否有子分类的标记，最后返回子分类列表
    @Override
    public List<Category> findByParentId(Long parentId) {
        // 根据分类id查询它下面的所有的子分类数据
        List<Category> categoryList = categoryMapper.selectByParentId(parentId);
        if(!CollectionUtils.isEmpty(categoryList)) {

            // 遍历分类的集合，获取每一个分类数据
            categoryList.forEach(item -> {

                // 查询该分类下子分类的数量
                int count = categoryMapper.countByParentId(item.getId());
                if(count > 0) {
                    item.setHasChildren(true);
                } else {
                    item.setHasChildren(false);
                }

            });
        }
        return categoryList;
    }

    //该函数用于导出数据库中的分类数据为Excel文件。具体实现步骤如下：
    //设置响应结果类型为Excel格式。
    //设置响应头信息，包括文件名和下载方式。
    //从数据库中查询分类数据。
    //将Category对象转换为CategoryExcelVo对象，使用BeanUtils的copyProperties方法进行属性拷贝。
    //使用EasyExcel框架将转换后的数据写出到浏览器端，以供用户下载。
    @Override
    public void exportData(HttpServletResponse response) {

        try {

            // 设置响应结果类型
            response.setContentType("application/vnd.ms-excel");
            response.setCharacterEncoding("utf-8");

            // 这里URLEncoder.encode可以防止中文乱码 当然和easyexcel没有关系
            String fileName = URLEncoder.encode("分类数据", "UTF-8");
            response.setHeader("Content-disposition", "attachment;filename=" + fileName + ".xlsx");
            //response.setHeader("Access-Control-Expose-Headers", "Content-Disposition");

            // 查询数据库中的数据
            List<Category> categoryList = categoryMapper.selectAll();
            List<CategoryExcelVo> categoryExcelVoList = new ArrayList<>(categoryList.size());

            // 将从数据库中查询到的Category对象转换成CategoryExcelVo对象
            for(Category category : categoryList) {
                CategoryExcelVo categoryExcelVo = new CategoryExcelVo();
                BeanUtils.copyProperties(category, categoryExcelVo, CategoryExcelVo.class);
                categoryExcelVoList.add(categoryExcelVo);
            }

            // 写出数据到浏览器端
            EasyExcel.write(response.getOutputStream(), CategoryExcelVo.class).sheet("分类数据").doWrite(categoryExcelVoList);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    //导入Excel数据
    //创建一个监听器对象excelListener，该监听器会将读取到的Excel数据转换为CategoryExcelVo对象，并通过categoryMapper进行数据库操作。
    //调用EasyExcel.read()方法读取Excel数据，传入参数为文件输入流file.getInputStream()、Excel数据转换对象CategoryExcelVo.class和监听器对象excelListener。
    //调用sheet().doRead()方法指定读取第一个sheet并开始读取Excel数据。
    //如果出现IOException异常，则抛出自定义异常GuiguException，异常码为DATA_ERROR。
    @Override
    public void importData(MultipartFile file) {
        try {
            //创建监听器对象，传递mapper对象
            ExcelListener<CategoryExcelVo> excelListener = new ExcelListener<>(categoryMapper);
            //调用read方法读取excel数据
            EasyExcel.read(file.getInputStream(),
                    CategoryExcelVo.class,
                    excelListener).sheet().doRead();
        } catch (IOException e) {
            throw new GuiguException(ResultCodeEnum.DATA_ERROR);
        }
    }
}
