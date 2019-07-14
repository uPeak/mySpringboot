package cn.myfeng.springboot.controller;

import cn.myfeng.springboot.entity.UserInfo;
import cn.myfeng.springboot.service.UserInfoService;
import com.sun.org.glassfish.external.statistics.annotations.Reset;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.annotation.Resources;

@Controller
public class MyController {

    @Value("${developer.name}")
    private String name;
    @Value("${developer.info}")
    private String info;

    @Resource
    private MyConfig myConf;

    @Resource
    private UserInfoService userService = null;

    @RequestMapping("/developer")
    @ResponseBody
    public String developer(){
        String body = name + " : " + info;
        body += "\n\n" + myConf.getName() + " : " + myConf.getInfo();

        return body;
    }

    @RequestMapping("/user/{name}")
    @ResponseBody
    public UserInfo findByName(@PathVariable("name") String name){
        UserInfo user = userService.findByName(name);
        return user;
    }
}
