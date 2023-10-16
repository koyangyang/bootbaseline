package csu.yang.bbladmin.controller;

import csu.yang.bbladmin.entity.User;
import csu.yang.bbladmin.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import xin.altitude.cms.common.entity.AjaxResult;

@RestController
@RequestMapping("/api/user")
public class UserController {
    @Autowired
    private UserService userService;
    @PostMapping("/login")
    public AjaxResult login(@RequestBody User user) {
        User r_user = userService.getUserByDetail(user);
        //如果结果不为空且唯一
        if(r_user != null){
            return AjaxResult.success(r_user);
        }else{
            return AjaxResult.error("用户名或密码错误");
        }
    }
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
