package com.whut.springboot.service;

import com.whut.springboot.mapper.UserInfoMapper;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class UserInfoService {

    @Resource
    private UserInfoMapper userInfoMapper;





}
