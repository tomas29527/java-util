package com.service;

import com.you.dao.UserInfoPojoMapper;
import com.you.entity.dto.UserInfoPojo;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserInfoPojoService {

    @Resource
    private UserInfoPojoMapper userInfoPojoMapper;

    public int insert(UserInfoPojo pojo){
        return userInfoPojoMapper.insert(pojo);
    }

    public int insertList(List< UserInfoPojo> pojos){
        return userInfoPojoMapper.insertList(pojos);
    }

    public List<UserInfoPojo> select(UserInfoPojo pojo){
        return userInfoPojoMapper.select(pojo);
    }

    public int update(UserInfoPojo pojo){
        return userInfoPojoMapper.update(pojo);
    }

}
