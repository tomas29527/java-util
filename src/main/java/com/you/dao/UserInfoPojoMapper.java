package com.you.dao;

import com.you.entity.dto.UserInfoPojo;

import java.util.List;

public interface UserInfoPojoMapper {

    int insert( UserInfoPojo pojo);

    int insertList( List< UserInfoPojo> pojo);

    List<UserInfoPojo> select( UserInfoPojo pojo);

    int update( UserInfoPojo pojo);

}
