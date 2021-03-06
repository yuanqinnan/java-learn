package com.yuanqn.mapper;

import com.yuanqn.model.User;
import com.yuanqn.pojo.QueryVo;

import java.util.List;

/**
 * Description: javalearn
 * <p>
 * Created by yuanqn on 2019/3/17 10:19
 */
public interface UserMapper {

    //查询用户
    User queryUserById(int id);

    //查询用户列表
    List<User> selectUserAll();

    //模糊查询
    List<User> selectLikeUserName(String username);

    //新增
    void saveUser(User user);

    List<User> queryByQo(QueryVo queryVo);

    int queryUserCount();

    List<User> queryUserByWhere(User user);

    void dynamicSetTest(User user);

    List<User> selectUserByChoose(User user);

    List<User> queryUserByIds(QueryVo queryVo);

    List<User> queryUserOrder();
}
