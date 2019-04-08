package com.AnalyzeSystem.controller;

import com.AnalyzeSystem.model.UserInfo;
import com.AnalyzeSystem.service.UserInfoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;


/**
 * SpringMVC的控制器controller，相当于web项目中的servlet
 * 拦截/响应一个请求，并给出请求的处理方法
 */

/*
   @RequestMapping("/test")
   public class TestController
   {
        @RequestMapping("/m01")
        public String m01()
        {
             return "m01";
        }
   }
   如果在类上配置了@RequestMapping,则整个url访问路径为
   http://localhost:8080/项目名/test/m01.do
 */

@Controller
@RequestMapping("/user")
public class UserInfoController {

    @Autowired
    private UserInfoService userInfoService; //自动寻找合适的service的bean（UserInfoServiceImpl）并注入

    /**
     * 用户登入
     * @param userInfo
     * @return
     */
    @RequestMapping("/login")
    public String login(UserInfo userInfo, Model model)
    {
        String msg = "";
        //根据登入名字判断此用户是否存在
        UserInfo user = userInfoService.selectUserByName(userInfo.getName());

        if(user == null)
        {
            msg = "用户不存在！";
        }
        else
        {
            if(user.getPassword().equals(userInfo.getPassword()))
            {
                //验证成功
                model.addAttribute("userInfo",user);
                return "/main";
            }
            else
            {
                msg = "密码错误";
            }
        }
        model.addAttribute("msg",msg);
        return "/login";
    }


}
