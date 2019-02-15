package com.dmall.provider;


import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by sinan.chen on 2/14/19.
 */
public class Provider {

    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[] {"provider.xml"});
        context.start();
        System.in.read(); // 按任意键退出
    }
}
