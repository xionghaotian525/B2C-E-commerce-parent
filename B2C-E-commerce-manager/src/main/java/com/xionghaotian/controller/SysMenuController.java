package com.xionghaotian.controller;

import com.xionghaotian.entity.system.SysMenu;
import com.xionghaotian.service.SysMenuService;
import com.xionghaotian.vo.common.Result;
import com.xionghaotian.vo.common.ResultCodeEnum;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @ClassName SysMenuController
 * @Description 管理员端-权限管理-菜单管理-逻辑控制层
 * @Author XiongHaoTian
 * @Date 2024年06月11日 15:54
 * @Version 1.0
 */
@RestController
@RequestMapping(value="/admin/system/sysMenu")
public class SysMenuController {

    @Autowired
    private SysMenuService sysMenuService;

    @Operation(summary = "获取所有菜单接口")
    @GetMapping("/findNodes")
    public Result<List<SysMenu>> findNodes() {
        List<SysMenu> list = sysMenuService.findNodes();
        return Result.build(list , ResultCodeEnum.SUCCESS) ;
    }

}
