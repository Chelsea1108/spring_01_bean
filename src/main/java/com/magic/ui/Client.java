package com.magic.ui;/**
 * @Description 模拟视图层
 * @Author Chelsea
 * @Date 2019/12/24 21:45
 */

import com.magic.service.IAccountService;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;


/**
 * @Description 获取spring的IOC容器，并根据id获取对象
 * @Author Chelsea
 * @Date 2019/12/24 21:45
 */
public class Client {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        //1.获取核心容器对象
//        IAccountService iAccountService =new AccountServiceImpl();
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("bean.xml");
//        ApplicationContext applicationContext = new FileSystemXmlApplicationContext("全路径");
        //2.根据id获取bean
        IAccountService accountService = (IAccountService) applicationContext.getBean("accountService");
        accountService.saveAccount();


        //=========beanFactory=======
//        ClassPathResource resource = new ClassPathResource("bean.xml");
//        BeanFactory factory = new XmlBeanFactory(resource);//过时的方法
//        IAccountService accountService = (IAccountService) factory.getBean("accountService");
//        accountService.saveAccount();

    }
}
