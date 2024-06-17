# B2C-E-commerce项目API接口文档


**简介**:B2C-E-commerce项目API接口文档


**HOST**:http://localhost:8501


**联系人**:xionghaotian


**Version**:1.0


**接口路径**:/v3/api-docs/admin-api


[TOC]






# 管理员端-权限管理-用户管理


## 修改用户接口


**接口地址**:`/admin/system/sysUser/updateSysUser`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "userName": "",
  "password": "",
  "name": "",
  "phone": "",
  "avatar": "",
  "description": "",
  "status": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|sysUser|系统用户实体类|body|true|SysUser|SysUser|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;userName|用户名||false|string||
|&emsp;&emsp;password|密码||false|string||
|&emsp;&emsp;name|昵称||false|string||
|&emsp;&emsp;phone|手机号码||false|string||
|&emsp;&emsp;avatar|图像||false|string||
|&emsp;&emsp;description|描述||false|string||
|&emsp;&emsp;status|状态（1：正常 0：停用）||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 添加用户接口


**接口地址**:`/admin/system/sysUser/saveSysUser`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "userName": "",
  "password": "",
  "name": "",
  "phone": "",
  "avatar": "",
  "description": "",
  "status": 0
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|sysUser|系统用户实体类|body|true|SysUser|SysUser|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;userName|用户名||false|string||
|&emsp;&emsp;password|密码||false|string||
|&emsp;&emsp;name|昵称||false|string||
|&emsp;&emsp;phone|手机号码||false|string||
|&emsp;&emsp;avatar|图像||false|string||
|&emsp;&emsp;description|描述||false|string||
|&emsp;&emsp;status|状态（1：正常 0：停用）||false|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 保存为用户分配的角色数据接口


**接口地址**:`/admin/system/sysUser/doAssign`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "userId": 0,
  "roleIdList": []
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|assignRoleDto|请求参数实体类|body|true|AssignRoleDto|AssignRoleDto|
|&emsp;&emsp;userId|用户id||false|integer(int64)||
|&emsp;&emsp;roleIdList|角色id的List集合||false|array|integer(int64)|


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 分页查询获取用户列表接口(搜索功能)


**接口地址**:`/admin/system/sysUser/findByPage/{pageNum}/{pageSize}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|sysUserDto|请求参数实体类|query|true|SysUserDto|SysUserDto|
|&emsp;&emsp;keyword|搜索关键字||false|string||
|&emsp;&emsp;createTimeBegin|开始时间||false|string||
|&emsp;&emsp;createTimeEnd|结束时间||false|string||
|pageNum||path|true|integer(int32)||
|pageSize||path|true|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultPageInfoSysUser|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data||PageInfoSysUser|PageInfoSysUser|
|&emsp;&emsp;total||integer(int64)||
|&emsp;&emsp;list|系统用户实体类|array|SysUser|
|&emsp;&emsp;&emsp;&emsp;id|唯一标识|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;updateTime|修改时间|string||
|&emsp;&emsp;&emsp;&emsp;isDeleted|是否删除|integer||
|&emsp;&emsp;&emsp;&emsp;userName|用户名|string||
|&emsp;&emsp;&emsp;&emsp;password|密码|string||
|&emsp;&emsp;&emsp;&emsp;name|昵称|string||
|&emsp;&emsp;&emsp;&emsp;phone|手机号码|string||
|&emsp;&emsp;&emsp;&emsp;avatar|图像|string||
|&emsp;&emsp;&emsp;&emsp;description|描述|string||
|&emsp;&emsp;&emsp;&emsp;status|状态（1：正常 0：停用）|integer||
|&emsp;&emsp;pageNum||integer(int32)||
|&emsp;&emsp;pageSize||integer(int32)||
|&emsp;&emsp;size||integer(int32)||
|&emsp;&emsp;startRow||integer(int64)||
|&emsp;&emsp;endRow||integer(int64)||
|&emsp;&emsp;pages||integer(int32)||
|&emsp;&emsp;prePage||integer(int32)||
|&emsp;&emsp;nextPage||integer(int32)||
|&emsp;&emsp;isFirstPage||boolean||
|&emsp;&emsp;isLastPage||boolean||
|&emsp;&emsp;hasPreviousPage||boolean||
|&emsp;&emsp;hasNextPage||boolean||
|&emsp;&emsp;navigatePages||integer(int32)||
|&emsp;&emsp;navigatepageNums||array|integer(int32)|
|&emsp;&emsp;navigateFirstPage||integer(int32)||
|&emsp;&emsp;navigateLastPage||integer(int32)||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {
		"total": 0,
		"list": [
			{
				"id": 0,
				"createTime": "",
				"updateTime": "",
				"isDeleted": 0,
				"userName": "",
				"password": "",
				"name": "",
				"phone": "",
				"avatar": "",
				"description": "",
				"status": 0
			}
		],
		"pageNum": 0,
		"pageSize": 0,
		"size": 0,
		"startRow": 0,
		"endRow": 0,
		"pages": 0,
		"prePage": 0,
		"nextPage": 0,
		"isFirstPage": true,
		"isLastPage": true,
		"hasPreviousPage": true,
		"hasNextPage": true,
		"navigatePages": 0,
		"navigatepageNums": [],
		"navigateFirstPage": 0,
		"navigateLastPage": 0
	}
}
```


## 删除用户接口


**接口地址**:`/admin/system/sysUser/deleteById/{userId}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|userId||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


# 管理员端-权限管理-角色管理


## 修改系统角色接口


**接口地址**:`/admin/system/sysRole/updateSysRole`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "roleName": "",
  "roleCode": "",
  "description": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|sysRole|角色实体类|body|true|SysRole|SysRole|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;roleName|角色名称||false|string||
|&emsp;&emsp;roleCode|角色编码||false|string||
|&emsp;&emsp;description|描述||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 新增系统角色接口


**接口地址**:`/admin/system/sysRole/saveSysRole`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "roleName": "",
  "roleCode": "",
  "description": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|sysRole|角色实体类|body|true|SysRole|SysRole|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;roleName|角色名称||false|string||
|&emsp;&emsp;roleCode|角色编码||false|string||
|&emsp;&emsp;description|描述||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 分页查询获取角色列表接口(搜索功能)


**接口地址**:`/admin/system/sysRole/findByPage/{pageNum}/{pageSize}`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "roleName": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|pageNum||path|true|integer(int32)||
|pageSize||path|true|integer(int32)||
|sysRoleDto|请求参数实体类|body|true|SysRoleDto|SysRoleDto|
|&emsp;&emsp;roleName|角色名称||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultPageInfoSysRole|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data||PageInfoSysRole|PageInfoSysRole|
|&emsp;&emsp;total||integer(int64)||
|&emsp;&emsp;list|角色实体类|array|SysRole|
|&emsp;&emsp;&emsp;&emsp;id|唯一标识|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;updateTime|修改时间|string||
|&emsp;&emsp;&emsp;&emsp;isDeleted|是否删除|integer||
|&emsp;&emsp;&emsp;&emsp;roleName|角色名称|string||
|&emsp;&emsp;&emsp;&emsp;roleCode|角色编码|string||
|&emsp;&emsp;&emsp;&emsp;description|描述|string||
|&emsp;&emsp;pageNum||integer(int32)||
|&emsp;&emsp;pageSize||integer(int32)||
|&emsp;&emsp;size||integer(int32)||
|&emsp;&emsp;startRow||integer(int64)||
|&emsp;&emsp;endRow||integer(int64)||
|&emsp;&emsp;pages||integer(int32)||
|&emsp;&emsp;prePage||integer(int32)||
|&emsp;&emsp;nextPage||integer(int32)||
|&emsp;&emsp;isFirstPage||boolean||
|&emsp;&emsp;isLastPage||boolean||
|&emsp;&emsp;hasPreviousPage||boolean||
|&emsp;&emsp;hasNextPage||boolean||
|&emsp;&emsp;navigatePages||integer(int32)||
|&emsp;&emsp;navigatepageNums||array|integer(int32)|
|&emsp;&emsp;navigateFirstPage||integer(int32)||
|&emsp;&emsp;navigateLastPage||integer(int32)||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {
		"total": 0,
		"list": [
			{
				"id": 0,
				"createTime": "",
				"updateTime": "",
				"isDeleted": 0,
				"roleName": "",
				"roleCode": "",
				"description": ""
			}
		],
		"pageNum": 0,
		"pageSize": 0,
		"size": 0,
		"startRow": 0,
		"endRow": 0,
		"pages": 0,
		"prePage": 0,
		"nextPage": 0,
		"isFirstPage": true,
		"isLastPage": true,
		"hasPreviousPage": true,
		"hasNextPage": true,
		"navigatePages": 0,
		"navigatepageNums": [],
		"navigateFirstPage": 0,
		"navigateLastPage": 0
	}
}
```


## 获取所有角色接口


**接口地址**:`/admin/system/sysRole/findAllRoles/{userId}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|userId||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultMapStringObject|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 删除系统角色接口


**接口地址**:`/admin/system/sysRole/deleteById/{roleId}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|roleId||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


# 管理员端-权限管理-菜单管理


## 修改系统菜单接口


**接口地址**:`/admin/system/sysMenu/updateById`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "parentId": 0,
  "title": "",
  "component": "",
  "sortValue": 0,
  "status": 0,
  "children": [
    {
      "id": 0,
      "createTime": "",
      "updateTime": "",
      "isDeleted": 0,
      "parentId": 0,
      "title": "",
      "component": "",
      "sortValue": 0,
      "status": 0,
      "children": []
    }
  ]
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|sysMenu|系统菜单实体类|body|true|SysMenu|SysMenu|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;parentId|父节点id||false|integer(int64)||
|&emsp;&emsp;title|节点标题||false|string||
|&emsp;&emsp;component|组件名称||false|string||
|&emsp;&emsp;sortValue|排序值||false|integer(int32)||
|&emsp;&emsp;status|状态(0:禁止,1:正常)||false|integer(int32)||
|&emsp;&emsp;children|子节点||false|array|SysMenu|


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 添加系统菜单接口


**接口地址**:`/admin/system/sysMenu/save`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "parentId": 0,
  "title": "",
  "component": "",
  "sortValue": 0,
  "status": 0,
  "children": [
    {
      "id": 0,
      "createTime": "",
      "updateTime": "",
      "isDeleted": 0,
      "parentId": 0,
      "title": "",
      "component": "",
      "sortValue": 0,
      "status": 0,
      "children": []
    }
  ]
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|sysMenu|系统菜单实体类|body|true|SysMenu|SysMenu|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;parentId|父节点id||false|integer(int64)||
|&emsp;&emsp;title|节点标题||false|string||
|&emsp;&emsp;component|组件名称||false|string||
|&emsp;&emsp;sortValue|排序值||false|integer(int32)||
|&emsp;&emsp;status|状态(0:禁止,1:正常)||false|integer(int32)||
|&emsp;&emsp;children|子节点||false|array|SysMenu|


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 获取所有菜单接口


**接口地址**:`/admin/system/sysMenu/findNodes`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultListSysMenu|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|array|SysMenu|
|&emsp;&emsp;id|唯一标识|integer(int64)||
|&emsp;&emsp;createTime|创建时间|string(date-time)||
|&emsp;&emsp;updateTime|修改时间|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除|integer(int32)||
|&emsp;&emsp;parentId|父节点id|integer(int64)||
|&emsp;&emsp;title|节点标题|string||
|&emsp;&emsp;component|组件名称|string||
|&emsp;&emsp;sortValue|排序值|integer(int32)||
|&emsp;&emsp;status|状态(0:禁止,1:正常)|integer(int32)||
|&emsp;&emsp;children|子节点|array|SysMenu|


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": [
		{
			"id": 0,
			"createTime": "",
			"updateTime": "",
			"isDeleted": 0,
			"parentId": 0,
			"title": "",
			"component": "",
			"sortValue": 0,
			"status": 0,
			"children": []
		}
	]
}
```


## 删除系统菜单接口


**接口地址**:`/admin/system/sysMenu/removeById/{id}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


# 管理员端-商品管理-商品规格管理


## 修改商品规格接口


**接口地址**:`/admin/product/productSpec/updateById`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "specName": "",
  "specValue": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|productSpec|商品规格实体类|body|true|ProductSpec|ProductSpec|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;specName|规格名称||false|string||
|&emsp;&emsp;specValue|规格值||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 添加商品规格接口


**接口地址**:`/admin/product/productSpec/save`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "specName": "",
  "specValue": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|productSpec|商品规格实体类|body|true|ProductSpec|ProductSpec|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;specName|规格名称||false|string||
|&emsp;&emsp;specValue|规格值||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 分页查询商品规格接口


**接口地址**:`/admin/product/productSpec/{page}/{limit}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|page||path|true|integer(int32)||
|limit||path|true|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultPageInfoProductSpec|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data||PageInfoProductSpec|PageInfoProductSpec|
|&emsp;&emsp;total||integer(int64)||
|&emsp;&emsp;list|商品规格实体类|array|ProductSpec|
|&emsp;&emsp;&emsp;&emsp;id|唯一标识|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;updateTime|修改时间|string||
|&emsp;&emsp;&emsp;&emsp;isDeleted|是否删除|integer||
|&emsp;&emsp;&emsp;&emsp;specName|规格名称|string||
|&emsp;&emsp;&emsp;&emsp;specValue|规格值|string||
|&emsp;&emsp;pageNum||integer(int32)||
|&emsp;&emsp;pageSize||integer(int32)||
|&emsp;&emsp;size||integer(int32)||
|&emsp;&emsp;startRow||integer(int64)||
|&emsp;&emsp;endRow||integer(int64)||
|&emsp;&emsp;pages||integer(int32)||
|&emsp;&emsp;prePage||integer(int32)||
|&emsp;&emsp;nextPage||integer(int32)||
|&emsp;&emsp;isFirstPage||boolean||
|&emsp;&emsp;isLastPage||boolean||
|&emsp;&emsp;hasPreviousPage||boolean||
|&emsp;&emsp;hasNextPage||boolean||
|&emsp;&emsp;navigatePages||integer(int32)||
|&emsp;&emsp;navigatepageNums||array|integer(int32)|
|&emsp;&emsp;navigateFirstPage||integer(int32)||
|&emsp;&emsp;navigateLastPage||integer(int32)||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {
		"total": 0,
		"list": [
			{
				"id": 0,
				"createTime": "",
				"updateTime": "",
				"isDeleted": 0,
				"specName": "",
				"specValue": ""
			}
		],
		"pageNum": 0,
		"pageSize": 0,
		"size": 0,
		"startRow": 0,
		"endRow": 0,
		"pages": 0,
		"prePage": 0,
		"nextPage": 0,
		"isFirstPage": true,
		"isLastPage": true,
		"hasPreviousPage": true,
		"hasNextPage": true,
		"navigatePages": 0,
		"navigatepageNums": [],
		"navigateFirstPage": 0,
		"navigateLastPage": 0
	}
}
```


## 查询商品规格接口


**接口地址**:`/admin/product/productSpec/findAll`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 删除商品规格接口


**接口地址**:`/admin/product/productSpec/deleteById/{id}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


# 管理员端-商品管理-商品列表管理


## 保存修改数据接口


**接口地址**:`/admin/product/product/updateById`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "name": "",
  "brandId": 0,
  "category1Id": 0,
  "category2Id": 0,
  "category3Id": 0,
  "unitName": "",
  "sliderUrls": "",
  "specValue": "",
  "status": 0,
  "auditStatus": 0,
  "auditMessage": "",
  "brandName": "",
  "category1Name": "",
  "category2Name": "",
  "category3Name": "",
  "productSkuList": [
    {
      "id": 0,
      "createTime": "",
      "updateTime": "",
      "isDeleted": 0,
      "skuCode": "",
      "skuName": "",
      "productId": 0,
      "thumbImg": "",
      "salePrice": 0,
      "marketPrice": 0,
      "costPrice": 0,
      "stockNum": 0,
      "saleNum": 0,
      "skuSpec": "",
      "weight": "",
      "volume": "",
      "status": 0
    }
  ],
  "detailsImageUrls": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|product|请求参数实体类|body|true|Product|Product|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;name|商品名称||false|string||
|&emsp;&emsp;brandId|品牌id||false|integer(int64)||
|&emsp;&emsp;category1Id|一级分类id||false|integer(int64)||
|&emsp;&emsp;category2Id|二级分类id||false|integer(int64)||
|&emsp;&emsp;category3Id|三级分类id||false|integer(int64)||
|&emsp;&emsp;unitName|计量单位||false|string||
|&emsp;&emsp;sliderUrls|轮播图url||false|string||
|&emsp;&emsp;specValue|商品规格值json串||false|string||
|&emsp;&emsp;status|线上状态：0-初始值，1-上架，-1-自主下架||false|integer(int32)||
|&emsp;&emsp;auditStatus|审核状态||false|integer(int32)||
|&emsp;&emsp;auditMessage|审核信息||false|string||
|&emsp;&emsp;brandName|品牌名称||false|string||
|&emsp;&emsp;category1Name|一级分类名称||false|string||
|&emsp;&emsp;category2Name|二级分类名称||false|string||
|&emsp;&emsp;category3Name|三级分类名称||false|string||
|&emsp;&emsp;productSkuList|ProductSku||false|array|ProductSku|
|&emsp;&emsp;&emsp;&emsp;id|唯一标识||false|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间||false|string||
|&emsp;&emsp;&emsp;&emsp;updateTime|修改时间||false|string||
|&emsp;&emsp;&emsp;&emsp;isDeleted|是否删除||false|integer||
|&emsp;&emsp;&emsp;&emsp;skuCode|商品编号||false|string||
|&emsp;&emsp;&emsp;&emsp;skuName|skuName||false|string||
|&emsp;&emsp;&emsp;&emsp;productId|商品ID||false|integer||
|&emsp;&emsp;&emsp;&emsp;thumbImg|缩略图路径||false|string||
|&emsp;&emsp;&emsp;&emsp;salePrice|售价||false|number||
|&emsp;&emsp;&emsp;&emsp;marketPrice|市场价||false|number||
|&emsp;&emsp;&emsp;&emsp;costPrice|成本价||false|number||
|&emsp;&emsp;&emsp;&emsp;stockNum|库存数||false|integer||
|&emsp;&emsp;&emsp;&emsp;saleNum|销量||false|integer||
|&emsp;&emsp;&emsp;&emsp;skuSpec|sku规格信息json||false|string||
|&emsp;&emsp;&emsp;&emsp;weight|重量||false|string||
|&emsp;&emsp;&emsp;&emsp;volume|体积||false|string||
|&emsp;&emsp;&emsp;&emsp;status|线上状态：0-初始值，1-上架，-1-自主下架||false|integer||
|&emsp;&emsp;detailsImageUrls|图片详情列表||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 保存商品信息接口


**接口地址**:`/admin/product/product/save`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "name": "",
  "brandId": 0,
  "category1Id": 0,
  "category2Id": 0,
  "category3Id": 0,
  "unitName": "",
  "sliderUrls": "",
  "specValue": "",
  "status": 0,
  "auditStatus": 0,
  "auditMessage": "",
  "brandName": "",
  "category1Name": "",
  "category2Name": "",
  "category3Name": "",
  "productSkuList": [
    {
      "id": 0,
      "createTime": "",
      "updateTime": "",
      "isDeleted": 0,
      "skuCode": "",
      "skuName": "",
      "productId": 0,
      "thumbImg": "",
      "salePrice": 0,
      "marketPrice": 0,
      "costPrice": 0,
      "stockNum": 0,
      "saleNum": 0,
      "skuSpec": "",
      "weight": "",
      "volume": "",
      "status": 0
    }
  ],
  "detailsImageUrls": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|product|请求参数实体类|body|true|Product|Product|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;name|商品名称||false|string||
|&emsp;&emsp;brandId|品牌id||false|integer(int64)||
|&emsp;&emsp;category1Id|一级分类id||false|integer(int64)||
|&emsp;&emsp;category2Id|二级分类id||false|integer(int64)||
|&emsp;&emsp;category3Id|三级分类id||false|integer(int64)||
|&emsp;&emsp;unitName|计量单位||false|string||
|&emsp;&emsp;sliderUrls|轮播图url||false|string||
|&emsp;&emsp;specValue|商品规格值json串||false|string||
|&emsp;&emsp;status|线上状态：0-初始值，1-上架，-1-自主下架||false|integer(int32)||
|&emsp;&emsp;auditStatus|审核状态||false|integer(int32)||
|&emsp;&emsp;auditMessage|审核信息||false|string||
|&emsp;&emsp;brandName|品牌名称||false|string||
|&emsp;&emsp;category1Name|一级分类名称||false|string||
|&emsp;&emsp;category2Name|二级分类名称||false|string||
|&emsp;&emsp;category3Name|三级分类名称||false|string||
|&emsp;&emsp;productSkuList|ProductSku||false|array|ProductSku|
|&emsp;&emsp;&emsp;&emsp;id|唯一标识||false|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间||false|string||
|&emsp;&emsp;&emsp;&emsp;updateTime|修改时间||false|string||
|&emsp;&emsp;&emsp;&emsp;isDeleted|是否删除||false|integer||
|&emsp;&emsp;&emsp;&emsp;skuCode|商品编号||false|string||
|&emsp;&emsp;&emsp;&emsp;skuName|skuName||false|string||
|&emsp;&emsp;&emsp;&emsp;productId|商品ID||false|integer||
|&emsp;&emsp;&emsp;&emsp;thumbImg|缩略图路径||false|string||
|&emsp;&emsp;&emsp;&emsp;salePrice|售价||false|number||
|&emsp;&emsp;&emsp;&emsp;marketPrice|市场价||false|number||
|&emsp;&emsp;&emsp;&emsp;costPrice|成本价||false|number||
|&emsp;&emsp;&emsp;&emsp;stockNum|库存数||false|integer||
|&emsp;&emsp;&emsp;&emsp;saleNum|销量||false|integer||
|&emsp;&emsp;&emsp;&emsp;skuSpec|sku规格信息json||false|string||
|&emsp;&emsp;&emsp;&emsp;weight|重量||false|string||
|&emsp;&emsp;&emsp;&emsp;volume|体积||false|string||
|&emsp;&emsp;&emsp;&emsp;status|线上状态：0-初始值，1-上架，-1-自主下架||false|integer||
|&emsp;&emsp;detailsImageUrls|图片详情列表||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 分页查询商品列表


**接口地址**:`/admin/product/product/{page}/{limit}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|page||path|true|integer(int32)||
|limit||path|true|integer(int32)||
|productDto|商品搜索条件实体类|query|true|ProductDto|ProductDto|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;brandId|品牌id||false|integer(int64)||
|&emsp;&emsp;category1Id|一级分类id||false|integer(int64)||
|&emsp;&emsp;category2Id|二级分类id||false|integer(int64)||
|&emsp;&emsp;category3Id|三级分类id||false|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultPageInfoProduct|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data||PageInfoProduct|PageInfoProduct|
|&emsp;&emsp;total||integer(int64)||
|&emsp;&emsp;list|请求参数实体类|array|Product|
|&emsp;&emsp;&emsp;&emsp;id|唯一标识|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;updateTime|修改时间|string||
|&emsp;&emsp;&emsp;&emsp;isDeleted|是否删除|integer||
|&emsp;&emsp;&emsp;&emsp;name|商品名称|string||
|&emsp;&emsp;&emsp;&emsp;brandId|品牌id|integer||
|&emsp;&emsp;&emsp;&emsp;category1Id|一级分类id|integer||
|&emsp;&emsp;&emsp;&emsp;category2Id|二级分类id|integer||
|&emsp;&emsp;&emsp;&emsp;category3Id|三级分类id|integer||
|&emsp;&emsp;&emsp;&emsp;unitName|计量单位|string||
|&emsp;&emsp;&emsp;&emsp;sliderUrls|轮播图url|string||
|&emsp;&emsp;&emsp;&emsp;specValue|商品规格值json串|string||
|&emsp;&emsp;&emsp;&emsp;status|线上状态：0-初始值，1-上架，-1-自主下架|integer||
|&emsp;&emsp;&emsp;&emsp;auditStatus|审核状态|integer||
|&emsp;&emsp;&emsp;&emsp;auditMessage|审核信息|string||
|&emsp;&emsp;&emsp;&emsp;brandName|品牌名称|string||
|&emsp;&emsp;&emsp;&emsp;category1Name|一级分类名称|string||
|&emsp;&emsp;&emsp;&emsp;category2Name|二级分类名称|string||
|&emsp;&emsp;&emsp;&emsp;category3Name|三级分类名称|string||
|&emsp;&emsp;&emsp;&emsp;productSkuList|ProductSku|array|ProductSku|
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;id|唯一标识|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;updateTime|修改时间|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;isDeleted|是否删除|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;skuCode|商品编号|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;skuName|skuName|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;productId|商品ID|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;thumbImg|缩略图路径|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;salePrice|售价|number||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;marketPrice|市场价|number||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;costPrice|成本价|number||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;stockNum|库存数|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;saleNum|销量|integer||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;skuSpec|sku规格信息json|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;weight|重量|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;volume|体积|string||
|&emsp;&emsp;&emsp;&emsp;&emsp;&emsp;status|线上状态：0-初始值，1-上架，-1-自主下架|integer||
|&emsp;&emsp;&emsp;&emsp;detailsImageUrls|图片详情列表|string||
|&emsp;&emsp;pageNum||integer(int32)||
|&emsp;&emsp;pageSize||integer(int32)||
|&emsp;&emsp;size||integer(int32)||
|&emsp;&emsp;startRow||integer(int64)||
|&emsp;&emsp;endRow||integer(int64)||
|&emsp;&emsp;pages||integer(int32)||
|&emsp;&emsp;prePage||integer(int32)||
|&emsp;&emsp;nextPage||integer(int32)||
|&emsp;&emsp;isFirstPage||boolean||
|&emsp;&emsp;isLastPage||boolean||
|&emsp;&emsp;hasPreviousPage||boolean||
|&emsp;&emsp;hasNextPage||boolean||
|&emsp;&emsp;navigatePages||integer(int32)||
|&emsp;&emsp;navigatepageNums||array|integer(int32)|
|&emsp;&emsp;navigateFirstPage||integer(int32)||
|&emsp;&emsp;navigateLastPage||integer(int32)||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {
		"total": 0,
		"list": [
			{
				"id": 0,
				"createTime": "",
				"updateTime": "",
				"isDeleted": 0,
				"name": "",
				"brandId": 0,
				"category1Id": 0,
				"category2Id": 0,
				"category3Id": 0,
				"unitName": "",
				"sliderUrls": "",
				"specValue": "",
				"status": 0,
				"auditStatus": 0,
				"auditMessage": "",
				"brandName": "",
				"category1Name": "",
				"category2Name": "",
				"category3Name": "",
				"productSkuList": [
					{
						"id": 0,
						"createTime": "",
						"updateTime": "",
						"isDeleted": 0,
						"skuCode": "",
						"skuName": "",
						"productId": 0,
						"thumbImg": "",
						"salePrice": 0,
						"marketPrice": 0,
						"costPrice": 0,
						"stockNum": 0,
						"saleNum": 0,
						"skuSpec": "",
						"weight": "",
						"volume": "",
						"status": 0
					}
				],
				"detailsImageUrls": ""
			}
		],
		"pageNum": 0,
		"pageSize": 0,
		"size": 0,
		"startRow": 0,
		"endRow": 0,
		"pages": 0,
		"prePage": 0,
		"nextPage": 0,
		"isFirstPage": true,
		"isLastPage": true,
		"hasPreviousPage": true,
		"hasNextPage": true,
		"navigatePages": 0,
		"navigatepageNums": [],
		"navigateFirstPage": 0,
		"navigateLastPage": 0
	}
}
```


## 修改商品上下架状态接口


**接口地址**:`/admin/product/product/updateStatus/{id}/{status}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|integer(int64)||
|status||path|true|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 修改商品审核状态接口


**接口地址**:`/admin/product/product/updateAuditStatus/{id}/{auditStatus}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|integer(int64)||
|auditStatus||path|true|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 根据id查询商品信息接口


**接口地址**:`/admin/product/product/getById/{id}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultProduct|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data||Product|Product|
|&emsp;&emsp;id|唯一标识|integer(int64)||
|&emsp;&emsp;createTime|创建时间|string(date-time)||
|&emsp;&emsp;updateTime|修改时间|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除|integer(int32)||
|&emsp;&emsp;name|商品名称|string||
|&emsp;&emsp;brandId|品牌id|integer(int64)||
|&emsp;&emsp;category1Id|一级分类id|integer(int64)||
|&emsp;&emsp;category2Id|二级分类id|integer(int64)||
|&emsp;&emsp;category3Id|三级分类id|integer(int64)||
|&emsp;&emsp;unitName|计量单位|string||
|&emsp;&emsp;sliderUrls|轮播图url|string||
|&emsp;&emsp;specValue|商品规格值json串|string||
|&emsp;&emsp;status|线上状态：0-初始值，1-上架，-1-自主下架|integer(int32)||
|&emsp;&emsp;auditStatus|审核状态|integer(int32)||
|&emsp;&emsp;auditMessage|审核信息|string||
|&emsp;&emsp;brandName|品牌名称|string||
|&emsp;&emsp;category1Name|一级分类名称|string||
|&emsp;&emsp;category2Name|二级分类名称|string||
|&emsp;&emsp;category3Name|三级分类名称|string||
|&emsp;&emsp;productSkuList|ProductSku|array|ProductSku|
|&emsp;&emsp;&emsp;&emsp;id|唯一标识|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;updateTime|修改时间|string||
|&emsp;&emsp;&emsp;&emsp;isDeleted|是否删除|integer||
|&emsp;&emsp;&emsp;&emsp;skuCode|商品编号|string||
|&emsp;&emsp;&emsp;&emsp;skuName|skuName|string||
|&emsp;&emsp;&emsp;&emsp;productId|商品ID|integer||
|&emsp;&emsp;&emsp;&emsp;thumbImg|缩略图路径|string||
|&emsp;&emsp;&emsp;&emsp;salePrice|售价|number||
|&emsp;&emsp;&emsp;&emsp;marketPrice|市场价|number||
|&emsp;&emsp;&emsp;&emsp;costPrice|成本价|number||
|&emsp;&emsp;&emsp;&emsp;stockNum|库存数|integer||
|&emsp;&emsp;&emsp;&emsp;saleNum|销量|integer||
|&emsp;&emsp;&emsp;&emsp;skuSpec|sku规格信息json|string||
|&emsp;&emsp;&emsp;&emsp;weight|重量|string||
|&emsp;&emsp;&emsp;&emsp;volume|体积|string||
|&emsp;&emsp;&emsp;&emsp;status|线上状态：0-初始值，1-上架，-1-自主下架|integer||
|&emsp;&emsp;detailsImageUrls|图片详情列表|string||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {
		"id": 0,
		"createTime": "",
		"updateTime": "",
		"isDeleted": 0,
		"name": "",
		"brandId": 0,
		"category1Id": 0,
		"category2Id": 0,
		"category3Id": 0,
		"unitName": "",
		"sliderUrls": "",
		"specValue": "",
		"status": 0,
		"auditStatus": 0,
		"auditMessage": "",
		"brandName": "",
		"category1Name": "",
		"category2Name": "",
		"category3Name": "",
		"productSkuList": [
			{
				"id": 0,
				"createTime": "",
				"updateTime": "",
				"isDeleted": 0,
				"skuCode": "",
				"skuName": "",
				"productId": 0,
				"thumbImg": "",
				"salePrice": 0,
				"marketPrice": 0,
				"costPrice": 0,
				"stockNum": 0,
				"saleNum": 0,
				"skuSpec": "",
				"weight": "",
				"volume": "",
				"status": 0
			}
		],
		"detailsImageUrls": ""
	}
}
```


## 删除商品信息接口


**接口地址**:`/admin/product/product/deleteById/{id}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id|商品id|path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


# 管理员端-商品管理-分类品牌管理


## 修改分类品牌接口


**接口地址**:`/admin/product/categoryBrand/updateById`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "brandId": 0,
  "categoryId": 0,
  "categoryName": "",
  "brandName": "",
  "logo": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|categoryBrand|分类品牌实体类|body|true|CategoryBrand|CategoryBrand|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;brandId|品牌id||false|integer(int64)||
|&emsp;&emsp;categoryId|分类id||false|integer(int64)||
|&emsp;&emsp;categoryName|分类名称||false|string||
|&emsp;&emsp;brandName|品牌名称||false|string||
|&emsp;&emsp;logo|品牌logo||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 添加分类品牌接口


**接口地址**:`/admin/product/categoryBrand/save`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "brandId": 0,
  "categoryId": 0,
  "categoryName": "",
  "brandName": "",
  "logo": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|categoryBrand|分类品牌实体类|body|true|CategoryBrand|CategoryBrand|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;brandId|品牌id||false|integer(int64)||
|&emsp;&emsp;categoryId|分类id||false|integer(int64)||
|&emsp;&emsp;categoryName|分类名称||false|string||
|&emsp;&emsp;brandName|品牌名称||false|string||
|&emsp;&emsp;logo|品牌logo||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 分页查询分类品牌接口


**接口地址**:`/admin/product/categoryBrand/{page}/{limit}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|page||path|true|integer(int32)||
|limit||path|true|integer(int32)||
|CategoryBrandDto|搜索条件实体类|query|true|CategoryBrandDto|CategoryBrandDto|
|&emsp;&emsp;brandId|品牌id||false|integer(int64)||
|&emsp;&emsp;categoryId|分类id||false|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultPageInfoCategoryBrand|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data||PageInfoCategoryBrand|PageInfoCategoryBrand|
|&emsp;&emsp;total||integer(int64)||
|&emsp;&emsp;list|分类品牌实体类|array|CategoryBrand|
|&emsp;&emsp;&emsp;&emsp;id|唯一标识|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;updateTime|修改时间|string||
|&emsp;&emsp;&emsp;&emsp;isDeleted|是否删除|integer||
|&emsp;&emsp;&emsp;&emsp;brandId|品牌id|integer||
|&emsp;&emsp;&emsp;&emsp;categoryId|分类id|integer||
|&emsp;&emsp;&emsp;&emsp;categoryName|分类名称|string||
|&emsp;&emsp;&emsp;&emsp;brandName|品牌名称|string||
|&emsp;&emsp;&emsp;&emsp;logo|品牌logo|string||
|&emsp;&emsp;pageNum||integer(int32)||
|&emsp;&emsp;pageSize||integer(int32)||
|&emsp;&emsp;size||integer(int32)||
|&emsp;&emsp;startRow||integer(int64)||
|&emsp;&emsp;endRow||integer(int64)||
|&emsp;&emsp;pages||integer(int32)||
|&emsp;&emsp;prePage||integer(int32)||
|&emsp;&emsp;nextPage||integer(int32)||
|&emsp;&emsp;isFirstPage||boolean||
|&emsp;&emsp;isLastPage||boolean||
|&emsp;&emsp;hasPreviousPage||boolean||
|&emsp;&emsp;hasNextPage||boolean||
|&emsp;&emsp;navigatePages||integer(int32)||
|&emsp;&emsp;navigatepageNums||array|integer(int32)|
|&emsp;&emsp;navigateFirstPage||integer(int32)||
|&emsp;&emsp;navigateLastPage||integer(int32)||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {
		"total": 0,
		"list": [
			{
				"id": 0,
				"createTime": "",
				"updateTime": "",
				"isDeleted": 0,
				"brandId": 0,
				"categoryId": 0,
				"categoryName": "",
				"brandName": "",
				"logo": ""
			}
		],
		"pageNum": 0,
		"pageSize": 0,
		"size": 0,
		"startRow": 0,
		"endRow": 0,
		"pages": 0,
		"prePage": 0,
		"nextPage": 0,
		"isFirstPage": true,
		"isLastPage": true,
		"hasPreviousPage": true,
		"hasNextPage": true,
		"navigatePages": 0,
		"navigatepageNums": [],
		"navigateFirstPage": 0,
		"navigateLastPage": 0
	}
}
```


## 根据分类id查询品牌列表接口


**接口地址**:`/admin/product/categoryBrand/findBrandByCategoryId/{categoryId}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|categoryId||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 删除分类品牌接口


**接口地址**:`/admin/product/categoryBrand/deleteById/{id}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


# 管理员端-商品管理-品牌管理


## 修改品牌接口


**接口地址**:`/admin/product/brand/updateById`


**请求方式**:`PUT`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "name": "",
  "logo": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|brand|品牌实体类|body|true|Brand|Brand|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;name|品牌名称||false|string||
|&emsp;&emsp;logo|品牌logo||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 添加品牌接口


**接口地址**:`/admin/product/brand/saveBrand`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "id": 0,
  "createTime": "",
  "updateTime": "",
  "isDeleted": 0,
  "name": "",
  "logo": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|brand|品牌实体类|body|true|Brand|Brand|
|&emsp;&emsp;id|唯一标识||false|integer(int64)||
|&emsp;&emsp;createTime|创建时间||false|string(date-time)||
|&emsp;&emsp;updateTime|修改时间||false|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除||false|integer(int32)||
|&emsp;&emsp;name|品牌名称||false|string||
|&emsp;&emsp;logo|品牌logo||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 分页查询品牌列表接口


**接口地址**:`/admin/product/brand/findByPage/{pageNum}/{pageSize}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|pageNum||path|true|integer(int32)||
|pageSize||path|true|integer(int32)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultPageInfoBrand|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data||PageInfoBrand|PageInfoBrand|
|&emsp;&emsp;total||integer(int64)||
|&emsp;&emsp;list|品牌实体类|array|Brand|
|&emsp;&emsp;&emsp;&emsp;id|唯一标识|integer||
|&emsp;&emsp;&emsp;&emsp;createTime|创建时间|string||
|&emsp;&emsp;&emsp;&emsp;updateTime|修改时间|string||
|&emsp;&emsp;&emsp;&emsp;isDeleted|是否删除|integer||
|&emsp;&emsp;&emsp;&emsp;name|品牌名称|string||
|&emsp;&emsp;&emsp;&emsp;logo|品牌logo|string||
|&emsp;&emsp;pageNum||integer(int32)||
|&emsp;&emsp;pageSize||integer(int32)||
|&emsp;&emsp;size||integer(int32)||
|&emsp;&emsp;startRow||integer(int64)||
|&emsp;&emsp;endRow||integer(int64)||
|&emsp;&emsp;pages||integer(int32)||
|&emsp;&emsp;prePage||integer(int32)||
|&emsp;&emsp;nextPage||integer(int32)||
|&emsp;&emsp;isFirstPage||boolean||
|&emsp;&emsp;isLastPage||boolean||
|&emsp;&emsp;hasPreviousPage||boolean||
|&emsp;&emsp;hasNextPage||boolean||
|&emsp;&emsp;navigatePages||integer(int32)||
|&emsp;&emsp;navigatepageNums||array|integer(int32)|
|&emsp;&emsp;navigateFirstPage||integer(int32)||
|&emsp;&emsp;navigateLastPage||integer(int32)||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {
		"total": 0,
		"list": [
			{
				"id": 0,
				"createTime": "",
				"updateTime": "",
				"isDeleted": 0,
				"name": "",
				"logo": ""
			}
		],
		"pageNum": 0,
		"pageSize": 0,
		"size": 0,
		"startRow": 0,
		"endRow": 0,
		"pages": 0,
		"prePage": 0,
		"nextPage": 0,
		"isFirstPage": true,
		"isLastPage": true,
		"hasPreviousPage": true,
		"hasNextPage": true,
		"navigatePages": 0,
		"navigatepageNums": [],
		"navigateFirstPage": 0,
		"navigateLastPage": 0
	}
}
```


## 查询所有品牌接口


**接口地址**:`/admin/product/brand/findAll`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 删除品牌接口


**接口地址**:`/admin/product/brand/deleteById/{id}`


**请求方式**:`DELETE`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|id||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


# 管理员端-权限管理-角色管理-分配菜单


## 保存角色菜单信息


**接口地址**:`/admin/system/sysRoleMenu/doAssign`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "roleId": 0,
  "menuIdList": []
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|assignMenuDto|请求参数实体类|body|true|AssignMenuDto|AssignMenuDto|
|&emsp;&emsp;roleId|角色id||false|integer(int64)||
|&emsp;&emsp;menuIdList|选中的菜单id的集合||false|array|object|


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 根据角色ID查询角色菜单


**接口地址**:`/admin/system/sysRoleMenu/findSysRoleMenuByRoleId/{roleId}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|roleId||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultMapStringObject|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


# 管理员端-用户接口


## 登录接口


**接口地址**:`/admin/system/index/login`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求示例**:


```javascript
{
  "userName": "",
  "password": "",
  "captcha": "",
  "codeKey": ""
}
```


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|loginDto|用户登录请求参数|body|true|LoginDto|LoginDto|
|&emsp;&emsp;userName|用户名||false|string||
|&emsp;&emsp;password|密码||false|string||
|&emsp;&emsp;captcha|提交验证码||false|string||
|&emsp;&emsp;codeKey|验证码key||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultLoginVo|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data||LoginVo|LoginVo|
|&emsp;&emsp;token|令牌|string||
|&emsp;&emsp;refresh_token|刷新令牌,可以为空|string||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {
		"token": "",
		"refresh_token": ""
	}
}
```


## 动态菜单


**接口地址**:`/admin/system/index/menus`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 用户退出功能接口


**接口地址**:`/admin/system/index/logout`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|token||header|true|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 获取用户信息接口


**接口地址**:`/admin/system/index/getUserInfo`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultSysUser|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data||SysUser|SysUser|
|&emsp;&emsp;id|唯一标识|integer(int64)||
|&emsp;&emsp;createTime|创建时间|string(date-time)||
|&emsp;&emsp;updateTime|修改时间|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除|integer(int32)||
|&emsp;&emsp;userName|用户名|string||
|&emsp;&emsp;password|密码|string||
|&emsp;&emsp;name|昵称|string||
|&emsp;&emsp;phone|手机号码|string||
|&emsp;&emsp;avatar|图像|string||
|&emsp;&emsp;description|描述|string||
|&emsp;&emsp;status|状态（1：正常 0：停用）|integer(int32)||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {
		"id": 0,
		"createTime": "",
		"updateTime": "",
		"isDeleted": 0,
		"userName": "",
		"password": "",
		"name": "",
		"phone": "",
		"avatar": "",
		"description": "",
		"status": 0
	}
}
```


## 生成图片验证码


**接口地址**:`/admin/system/index/generateValidateCode`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultValidateCodeVo|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data||ValidateCodeVo|ValidateCodeVo|
|&emsp;&emsp;codeKey|验证码key|string||
|&emsp;&emsp;codeValue|验证码value|string||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {
		"codeKey": "",
		"codeValue": ""
	}
}
```


# 文件上传接口


## fileUploadService


**接口地址**:`/admin/system/fileUpload`


**请求方式**:`POST`


**请求数据类型**:`application/x-www-form-urlencoded,application/json`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|file||query|true|file||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultString|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|string||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": ""
}
```


# 管理员端-商品管理-分类管理


## 导入商品分类数据


**接口地址**:`/admin/product/category/importData`


**请求方式**:`POST`


**请求数据类型**:`multipart/form-data`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|file||query|true|file||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|Result|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|object||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {}
}
```


## 根据parentId获取下级节点


**接口地址**:`/admin/product/category/findByParentId/{parentId}`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|parentId||path|true|integer(int64)||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultListCategory|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|array|Category|
|&emsp;&emsp;id|唯一标识|integer(int64)||
|&emsp;&emsp;createTime|创建时间|string(date-time)||
|&emsp;&emsp;updateTime|修改时间|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除|integer(int32)||
|&emsp;&emsp;name|分类名称|string||
|&emsp;&emsp;imageUrl|分类图片url|string||
|&emsp;&emsp;parentId|父节点id|integer(int64)||
|&emsp;&emsp;status|分类状态: 是否显示[0-不显示，1显示]|integer(int32)||
|&emsp;&emsp;orderNum|排序字段|integer(int32)||
|&emsp;&emsp;hasChildren|是否存在子节点|boolean||
|&emsp;&emsp;children|子节点List集合|array|Category|


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": [
		{
			"id": 0,
			"createTime": "",
			"updateTime": "",
			"isDeleted": 0,
			"name": "",
			"imageUrl": "",
			"parentId": 0,
			"status": 0,
			"orderNum": 0,
			"hasChildren": true,
			"children": [
				{
					"id": 0,
					"createTime": "",
					"updateTime": "",
					"isDeleted": 0,
					"name": "",
					"imageUrl": "",
					"parentId": 0,
					"status": 0,
					"orderNum": 0,
					"hasChildren": true,
					"children": [
						{}
					]
				}
			]
		}
	]
}
```


## 导出商品分类数据


**接口地址**:`/admin/product/category/exportData`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK||


**响应参数**:


暂无


**响应示例**:
```javascript

```


# 管理员端-商品管理-商品列表管理-添加商品功能-查询商品单元数据接口


## 查询商品单元数据接口


**接口地址**:`/admin/product/productUnit/findAll`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


暂无


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultListProductUnit|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data|业务数据|array|ProductUnit|
|&emsp;&emsp;id|唯一标识|integer(int64)||
|&emsp;&emsp;createTime|创建时间|string(date-time)||
|&emsp;&emsp;updateTime|修改时间|string(date-time)||
|&emsp;&emsp;isDeleted|是否删除|integer(int32)||
|&emsp;&emsp;name|名称|string||


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": [
		{
			"id": 0,
			"createTime": "",
			"updateTime": "",
			"isDeleted": 0,
			"name": ""
		}
	]
}
```


# 管理员端-订单管理-订单统计


## 查询订单统计数据接口


**接口地址**:`/admin/order/orderInfo/getOrderStatisticsData`


**请求方式**:`GET`


**请求数据类型**:`application/x-www-form-urlencoded`


**响应数据类型**:`*/*`


**接口描述**:


**请求参数**:


| 参数名称 | 参数说明 | 请求类型    | 是否必须 | 数据类型 | schema |
| -------- | -------- | ----- | -------- | -------- | ------ |
|orderStatisticsDto|搜索条件实体类|query|true|OrderStatisticsDto|OrderStatisticsDto|
|&emsp;&emsp;createTimeBegin|开始时间||false|string||
|&emsp;&emsp;createTimeEnd|结束时间||false|string||


**响应状态**:


| 状态码 | 说明 | schema |
| -------- | -------- | ----- | 
|200|OK|ResultOrderStatisticsVo|


**响应参数**:


| 参数名称 | 参数说明 | 类型 | schema |
| -------- | -------- | ----- |----- | 
|code|业务状态码|integer(int32)|integer(int32)|
|message|响应消息|string||
|data||OrderStatisticsVo|OrderStatisticsVo|
|&emsp;&emsp;dateList|日期数据集合|array|string|
|&emsp;&emsp;amountList|总金额数据集合|array|number|


**响应示例**:
```javascript
{
	"code": 0,
	"message": "",
	"data": {
		"dateList": [],
		"amountList": []
	}
}
```