package com.xionghaotian.controller;

import com.xionghaotian.dto.system.AssignMenuDto;
import com.xionghaotian.service.SysRoleMenuService;
import com.xionghaotian.vo.common.Result;
import com.xionghaotian.vo.common.ResultCodeEnum;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

/**
 * @ClassName SysRoleMenuController
 * @Description 管理员端-权限管理-角色管理-分配菜单-逻辑控制层
 * @Author XiongHaoTian
 * @Date 2024年06月12日 10:08
 * @Version 1.0
 */
@Tag(name = "管理员端-权限管理-角色管理-分配菜单")
@RestController
@RequestMapping(value = "/admin/system/sysRoleMenu")
public class SysRoleMenuController {

    @Autowired
    private SysRoleMenuService sysRoleMenuService ;

    @Operation(summary = "根据角色ID查询角色菜单")
    @GetMapping(value = "/findSysRoleMenuByRoleId/{roleId}")
    public Result<Map<String , Object>> findSysRoleMenuByRoleId(@PathVariable(value = "roleId") Long roleId) {
        Map<String , Object> sysRoleMenuList = sysRoleMenuService.findSysRoleMenuByRoleId(roleId) ;
        return Result.build(sysRoleMenuList , ResultCodeEnum.SUCCESS) ;
    }

    @Operation(summary = "保存角色菜单信息")
    @PostMapping("/doAssign")
    public Result doAssign(@RequestBody AssignMenuDto assignMenuDto) {
        sysRoleMenuService.doAssign(assignMenuDto);
        return Result.build(null , ResultCodeEnum.SUCCESS) ;
    }

}
