package com.xionghaotian.mapper;

import com.xionghaotian.dto.system.SysUserDto;
import com.xionghaotian.entity.system.SysUser;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @ClassName SysUserMapper
 * @Description SysUserMapper持久层
 * @Author XiongHaoTian
 * @Date 2024年05月19日 21:22
 * @Version 1.0
 */

@Mapper
public interface SysUserMapper {
    /**
     * 根据用户名查询用户数据
     * @param userName
     * @return
     */
    public abstract SysUser selectByUserName(String userName) ;


    /**
     * 根据条件分页查询系统用户。
     *
     * 本函数是一个抽象方法，具体实现由子类提供。它的目的是为了在系统中根据提供的条件，
     * 以分页的方式查询系统用户的信息。通过SysUserDto对象传递查询条件和分页信息。
     *
     * @param sysUserDto 数据传输对象，包含查询条件和分页信息。可能包括用户名、状态等条件，
     *                   以及页码、每页数量等分页信息。
     * @return 返回一个系统用户列表，这个列表是根据查询条件和分页信息筛选出来的。列表中的每个元素
     *         都是SysUser类型的对象，代表一个系统用户。
     */
    public abstract List<SysUser> findByPage(SysUserDto sysUserDto);

    /**
     * 添加系统用户。
     *
     * 本函数是一个抽象方法，具体实现由子类提供。它的目的是为了保存一个系统用户。
     *
     * @param sysUser 要保存的系统用户。
     */
    public abstract void saveSysUser(SysUser sysUser);

    /**
     * 更新（修改）系统用户。
     *
     * 本函数是一个抽象方法，具体实现由子类提供。它的目的是为了更新一个系统用户。
     *
     * @param sysUser 要更新的系统用户。
     */
    public abstract void updateSysUser(SysUser sysUser);
}
