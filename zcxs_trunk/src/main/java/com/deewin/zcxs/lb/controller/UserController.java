package com.deewin.zcxs.lb.controller;

import com.deewin.zcxs.lb.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * @author ：liubo
 * @description：TODO
 * @date ：2023/3/23 17:04
 */

@RestController
@RequestMapping("/user")
@CrossOrigin
public class UserController {
   /* @Autowired
    private IUserService userService;*/

    @PostMapping("/login")
    public Object loginUser(User user) {
        Map<String,Object> result = new HashMap<String, Object>();
        System.err.println(user);
        if("admin".equals(user.getUserName()) && "123456".equals(user.getPwd())) {
            result.put("code", 200);
            result.put("msg", "登录成功");
            result.put("token", "adminxxxx");
            return result;
        }


        result.put("code", 500);
        result.put("msg", "登录失败");
        return result;
    }
}
