package com.sds.practice.domain.service;

import com.sds.practice.domain.entity.UserEntity;
import com.sds.practice.domain.entity.WebUserEntity;
import com.sds.practice.domain.repository.BaseDao;
import com.sds.practice.domain.repository.mysql.UserDao;
import com.sds.practice.domain.repository.mysql.WebUserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.io.Serializable;

/**
 * @Project : best-practice-project
 * @Package Name : com.sds.practice.domain.service
 * @Description : TODO
 * @Author : tanchang
 * @Create Date : 2018年07月26日 下午2:25
 * @ModificationHistory Who   When     What
 * ------------    --------------    ---------------------------------
 */
@Service
public class UserService extends BaseService<UserEntity,Serializable>{

    @Autowired
    private UserDao userDao;

    @Autowired
    private WebUserDao webUserDao;

    @Override
    public BaseDao<UserEntity, Serializable> dao() {
        return userDao;
    }


    public WebUserEntity saveWebUser(WebUserEntity webUserEntity){
        return webUserDao.save(webUserEntity);
    }
}
