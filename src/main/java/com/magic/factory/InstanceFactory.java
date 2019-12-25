package com.magic.factory;

import com.magic.service.IAccountService;
import com.magic.service.impl.AccountServiceImpl;

/**
 * @Description
 * 模拟一个工厂类（该类可能存在于jar包中，
 * 我们无法通过修改源码的方式来提供默认构造函数）
 * @Author Chelsea
 * @Date 2019/12/25 12:50
 */
public class InstanceFactory {
    public IAccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
