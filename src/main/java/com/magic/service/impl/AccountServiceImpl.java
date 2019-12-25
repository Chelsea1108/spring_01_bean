package com.magic.service.impl;/**
 * @Description
 * @Author Chelsea
 * @Date 2019/12/24 21:41
 */

import com.magic.service.IAccountService;

/**
 * @Description 账户业务层实现类
 * @Author Chelsea
 * @Date 2019/12/24 21:41
 */
public class AccountServiceImpl implements IAccountService {

//    IAccountDao iAccountDao = new AccountDaoImpl();

    public AccountServiceImpl(){
        System.out.println("对象创建了");
    }

    public void saveAccount(){
        System.out.println("service中的saveAccount执行了");
    }
}
