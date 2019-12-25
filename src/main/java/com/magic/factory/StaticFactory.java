package com.magic.factory;/**
 * @Description
 * @Author Chelsea
 * @Date 2019/12/25 13:00
 */

import com.magic.service.IAccountService;
import com.magic.service.impl.AccountServiceImpl;

/**
 * @Description jar包中class文件
 * @Author Chelsea
 * @Date 2019/12/25 13:00
 */
public class StaticFactory {
    public static IAccountService getAccountService(){
        return new AccountServiceImpl();
    }
}
