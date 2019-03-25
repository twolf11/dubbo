package com.lcy.dubbo.basic.Dao.impl;

import com.lcy.dubbo.basic.Dao.UserDao;
import com.lcy.dubbo.basic.mapper.UserMapper;
import com.lcy.dubbo.basic.model.UserMo;
import com.lcy.dubbo.cache.RedisKey;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.CachePut;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.stereotype.Service;

@Service
public class UserDaoImpl implements UserDao {

    @Autowired
    private UserMapper userMapper;


    @CacheEvict(value = RedisKey.USER_MSG_ID_KEY, key = "#userId")
    @Override
    public int delUserById(String userId) {
        return userMapper.delUserById(userId);
    }

    @CachePut(value = RedisKey.USER_MSG_ID_KEY, key = "#userMo.userId")
    @Override
    public int addUser(UserMo userMo) {
        return userMapper.addUser(userMo);
    }

    @Cacheable(value = RedisKey.USER_MSG_ID_KEY, key = "#userId")
    @Override
    public UserMo getUserById(String userId) {
        UserMo userMo = userMapper.getUserById(userId);
        return userMo;
    }

    @Cacheable(value = RedisKey.USER_MSG_CODE_KEY, key = "#usercode")
    @Override
    public UserMo getUserByUsercode(String usercode){
        UserMo userMo = userMapper.getUserByUsercode(usercode);
        return userMo;
    }

    @Cacheable(value = RedisKey.USER_MSG_ID_KEY, key = "#userMo.userId")
    @Override
    public int updateUserById(UserMo userMo) {
        return userMapper.updateUserById(userMo);
    }
}
