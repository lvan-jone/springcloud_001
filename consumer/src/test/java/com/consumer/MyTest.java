package com.consumer;

import com.consumer.service.impl.UImpl;
import org.junit.jupiter.api.Test;

import java.lang.reflect.Method;

public class MyTest {
    @Test
    public void test() throws Exception {
        UImpl u = new UImpl();
        Method proxyPrivateMethod = UImpl.class
                .getDeclaredMethod("ss", String.class);
        //将私有方法设置为可访问
        proxyPrivateMethod.setAccessible(true);
        //调用私有方法
        String s = (String) proxyPrivateMethod.invoke(u, "String");
        System.out.println(s);


//        PrivateMethod myClass = new PrivateMethod();
//        //通过反射获取私有方法
//        Method proxyPrivateMethod = PrivateMethod.class
//                .getDeclaredMethod("privateMethod", String.class, int.class);
//        //将私有方法设置为可访问
//        proxyPrivateMethod.setAccessible(true);
//        //调用私有方法
//        String s= (String) proxyPrivateMethod.invoke(myClass, "String", 1);
//        System.out.println(s);
    }

}
