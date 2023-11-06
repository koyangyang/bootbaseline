package csu.yang.bbladmin.controller;

import csu.yang.bbluser.entity.User;
import csu.yang.bbluser.service.UserService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xin.altitude.cms.common.entity.AjaxResult;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;
    @ApiOperation(value = "用户登录接口", notes = "返回AjaxResult")
    @PostMapping("/login")
    public AjaxResult loginByUser(@RequestBody User user) {
        User r_user = userService.getUserByDetail(user);
        if(r_user != null){
            return AjaxResult.success(r_user);
        }else{
            return AjaxResult.error("用户名或密码错误");
        }
    }
    @ApiOperation(value = "查找指定user_id用户接口", notes = "返回AjaxResult")
    @GetMapping("/{id}")
    public AjaxResult getUserById(@PathVariable Integer id){
        User r_user = userService.getById(id);
        if(r_user != null){
            return AjaxResult.success(r_user);
        }else{
            return AjaxResult.error("用户不存在");
        }
    }
}
