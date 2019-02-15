package com.dmall.impl;

import com.dmall.GreetingService;

/**
 * Created by sinan.chen on 2/14/19.
 */
public class GreetingServiceImpl implements GreetingService {

    public String sayHello(String name) {
        return String.format("Hello %s", name);
    }
}
