package com.dmall;

import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sinan.chen on 2/14/19.
 */
public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"consumer.xml"});
        context.start();
        GreetingService demoService = (GreetingService)context.getBean("demoService"); // 获取远程服务代理
        String hello = demoService.sayHello("world"); // 执行远程方法
        System.out.println( hello ); // 显示调用结果
    }
}
