package com.spring.demo.vo;

import java.lang.reflect.Proxy;

public class VoTest {

    public static void main(String[] args) {
        System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles","true");
        VoTest test = new VoTest();
        Class<?>[] clazzs = {VoService.class};
        VoService service =  (VoService) Proxy.newProxyInstance(test.getClass().getClassLoader(),clazzs,new VoHanader());
        service.run();
    }
}
