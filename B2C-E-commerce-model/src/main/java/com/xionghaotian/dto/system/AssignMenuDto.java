package com.xionghaotian.dto.system;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;
import java.util.Map;

@Data
@Schema(description = "请求参数实体类")
public class AssignMenuDto {

    @Schema(description = "角色id")
    private Long roleId;			// 角色id

    @Schema(description = "选中的菜单id的集合")
    private List<Map<String , Number>> menuIdList;
    // 选中的菜单id的集合; Map的键表示菜单的id，值表示是否为半开; 0否，1是
    //List<Map<String , Number>>中
    //第一列 key : id   value : 菜单id 值
    //第一列 key ：isHalf   value : 0 或者 1
    //菜单都选择就是0（全开），否则就是1（半开）
}