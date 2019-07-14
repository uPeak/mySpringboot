package cn.myfeng.springboot.service;

import cn.myfeng.springboot.entity.UserInfo;
import cn.myfeng.springboot.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoService {
    @Resource
    private UserInfoMapper userMapper = null;

    public UserInfo findByName(String name){
        UserInfo userinfo = userMapper.findByName(name);
        if(userinfo==null){
            userinfo = new UserInfo("unknown","未找到用户");
        }
        System.out.println(userinfo.toString());
        return userinfo;
    }
}
