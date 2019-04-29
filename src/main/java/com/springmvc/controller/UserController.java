package com.springmvc.controller;

import com.springmvc.entity.User;
import com.springmvc.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: Administrator
 * @Date: 2019/4/23 8:52
 * @Description:
 */
@Controller
@RequestMapping("/user")
public class UserController {
    @Autowired
    UserService userService;
    @RequestMapping("/loginCheck")
    public String checkUser(HttpServletRequest request,Model model){
        String usreName = request.getParameter("userName");
        User queryUser = new User();
        queryUser.setUserName(usreName);
        User resultUser = userService.selectByExample(queryUser);
        if(resultUser!=null){
            return "user/loginSuccess";
        }else{
            return "user/loginFailed";
        }
    }
    @RequestMapping("/queryUser")
    public String queryUser(HttpServletRequest request){
        userService.get(1);
        return "user/querySuccess";
    }

    @RequestMapping("/addUser")
    public String addUser(Model model){
        return null;
    }

}
