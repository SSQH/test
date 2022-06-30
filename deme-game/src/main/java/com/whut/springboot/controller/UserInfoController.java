package com.whut.springboot.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.whut.springboot.common.CodeMsg;
import com.whut.springboot.common.Result;
import com.whut.springboot.from.UserFrom;
import com.whut.springboot.mapper.UserInfoMapper;
import com.whut.springboot.model.UserInfo;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;



@RestController
@RequestMapping("/user")
public class UserInfoController {
    @Resource
    private UserInfoMapper userInfoMapper;

    @PostMapping("/register")
    public Object registerInfo(UserFrom userFrom){
        QueryWrapper<UserInfo> userInfoQueryWrapper = new QueryWrapper<>();
        userInfoQueryWrapper.eq("username",userFrom.getUsername());
        UserInfo userInfo = userInfoMapper.selectOne(userInfoQueryWrapper);
        if (userInfo==null ){
            UserInfo userInfo1 = new UserInfo();
            userInfo1.setUsername(userFrom.getUsername());
            userInfo1.setPassword(userFrom.getPassword());
            userInfo1.setCurWeight(0);
            userInfo1.setMaxWeight(60);
            userInfoMapper.insertSelective(userInfo1);
            return new Result();
        }else{
            return new Result(CodeMsg.ERROR);
        }
    }



    @PostMapping("/login")
    public Object login(UserFrom userFrom){
        QueryWrapper<UserInfo> userInfoQueryWrapper = new QueryWrapper<>();
        userInfoQueryWrapper.eq("username",userFrom.getUsername())
                .eq("password",userFrom.getPassword());
        UserInfo userInfo = userInfoMapper.selectOne(userInfoQueryWrapper);
        if (userInfo==null ){
            return new Result(CodeMsg.ERROR);
        }else{
            return new Result(userInfo);
        }
    }


    @PostMapping("/updateUserInfo")
    public Object updateUserInfo(UserInfo userFrom){
        userInfoMapper.updateByPrimaryKeySelective(userFrom);
        return new Result();
    }







}
