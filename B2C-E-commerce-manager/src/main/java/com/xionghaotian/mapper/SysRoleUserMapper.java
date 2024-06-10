package com.xionghaotian.mapper;

import org.apache.ibatis.annotations.Mapper;
import org.springframework.data.repository.query.Param;

/**
 * @ClassName SysRoleUserMapper
 * @Description 权限管理-用户管理-分配角色-保存为用户分配的角色信息mapper接口
 * @Author XiongHaoTian
 * @Date 2024年06月10日 14:26
 * @Version 1.0
 */
@Mapper
public interface SysRoleUserMapper {
    public abstract void doAssign(@Param("userId") Long userId,
                                  @Param("roleId") Long roleId);		// 添加关联关系
    public abstract void deleteByUserId(Long userId);				// 根据用户的id删除数据
}
