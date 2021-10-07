package com.cyyaw.test;

import com.cyyaw.spider.run.RunSpider;
import com.cyyaw.spider.run.StandardSpider;
import org.junit.jupiter.api.Test;

public class TestHttp {

   private RunSpider  runSpider = new StandardSpider();



    @Test
    public void test001(){


        String httpData = runSpider.getHttpData("https://www.hao123.com/");


        System.out.println(httpData);

    }

}
