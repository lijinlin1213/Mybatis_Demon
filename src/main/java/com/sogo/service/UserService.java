package com.sogo.service;

import com.sogo.dao.IUser;
import com.sogo.dao.UserDao;
import com.sogo.model.User;
import com.sogo.util.MybatisUtil;
import org.apache.ibatis.session.SqlSession;

/**
 * Created by lijinlin on 2017/11/23.
 */
public class UserService {
    public static void  main(String[] args){
       // UserDaoImpl dao=new UserDaoImpl();
        //User user=new User(1,"wugang","123456");
        //dao.insertUser(user);
        SqlSession sqlSession= MybatisUtil.getSqlSession();
        UserDao userDao=sqlSession.getMapper(UserDao.class);
        System.out.println(userDao.getUser(1));
    }
}
