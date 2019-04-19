package com.springmvc.controller;

import com.springmvc.service.TeamService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

/**
 * @Auther: Administrator
 * @Date: 2019/4/17 16:14
 * @Description:
 */
@Controller
//@RequestMapping("/team")
public class TeamController {
    private static Logger logger = LoggerFactory.getLogger(TeamController.class);
    @Resource
    private TeamService teamService;
    @RequestMapping(value="/print")
    public String print(Model model, HttpServletRequest request){
        logger.info("----------->start");
        System.out.println("99999");
        model.addAttribute("test","哈哈");
        return "index";
    }
}
