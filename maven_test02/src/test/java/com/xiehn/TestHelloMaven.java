package com.xiehn;

import org.junit.Assert;
import org.junit.Test;

public class TestHelloMaven {
    @Test
    public void testAdd(){
        System.out.println("======testAdd测试add方法======");
        HelloMaven hello=new HelloMaven();
        int res=hello.add(10,29);
        Assert.assertEquals(39,res);
    }

}
