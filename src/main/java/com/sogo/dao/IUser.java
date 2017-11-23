package com.sogo.dao;

import com.sogo.model.User;
import org.apache.ibatis.annotations.Select;

/**
 * Created by lijinlin on 2017/11/23.
 */
public interface IUser {
    @Select("select * from user where id= #{id}")
    public User getUserByID(int id);
}
