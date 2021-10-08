package com.cyyaw.test;

import com.cyyaw.spider.run.RunSpider;
import com.cyyaw.spider.run.StandardSpider;
import org.junit.jupiter.api.Test;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class TestHttp {

   private RunSpider  runSpider = new StandardSpider();



    @Test
    public void test001(){


        String httpData = runSpider.getHttpData("https://www.hao123.com/");


        System.out.println(httpData);

    }

    @Test
    public void test002(){

        String pattern = "^((http://)|(https://))?([a-zA-Z0-9]([a-zA-Z0-9\\-]{0,61}[a-zA-Z0-9])?\\.)+[a-zA-Z]{2,6}(/)";
        Pattern p = Pattern.compile(pattern);
        String line = "https://xxx.yyy.cn/ghuiui";
        Matcher m = p.matcher(line);

        if(m.find()){
            //匹配结果
            System.out.println("=" + m.group());
        }
        //替换
        System.out.println(line.replaceAll(pattern, ""));

    }

}
