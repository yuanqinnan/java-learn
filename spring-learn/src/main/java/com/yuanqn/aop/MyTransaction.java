package com.yuanqn.aop;

/**
 * Description: springLearn
 * <p>
 * Created by yuanqn on 2019/3/10 18:23
 */
//事务类
public class MyTransaction {

    //开启事务
    public void before() {
        System.out.println("开启事务");
    }

    //提交事务
    public void after() {
        System.out.println("提交事务");
    }
}
