package cn.myfeng.springboot.mapper;

import cn.myfeng.springboot.entity.UserInfo;

public interface UserInfoMapper {

    public UserInfo findByName(String name);
}
