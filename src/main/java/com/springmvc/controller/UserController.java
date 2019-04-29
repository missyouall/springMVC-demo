package com.springmvc.controller;

import com.springmvc.entity.User;
import com.springmvc.service.UserService;
import org.apache.commons.lang.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

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
    public ModelAndView checkUser(HttpServletRequest request){
        String userName = request.getParameter("userName");
        String passWord = request.getParameter("passWord");
        ModelAndView model = new ModelAndView();
        if(StringUtils.isBlank(userName)){
            model.setViewName("user/loginFailed");
            model.addObject("errorInfo","用户名不能为空");
            return model;
        }
        User queryUser = new User();
        queryUser.setUserName(userName);
        queryUser.setPassword(passWord);
        User resultUser = userService.selectByExample(queryUser);
        if(resultUser!=null){
            model.setViewName("user/loginSuccess");
            model.addObject("resultUser",resultUser);
            return model;
        }else{
            model.setViewName("user/loginFailed");
            model.addObject("errorInfo","用户名或密码错误");
            return model;
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
