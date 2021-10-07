package com.cyyaw.spider;

import com.cyyaw.spider.data.PageHandleData;
import com.cyyaw.spider.data.PageHandleDataStandard;
import com.cyyaw.spider.data.WebPageData;
import com.cyyaw.spider.run.RunSpider;
import com.cyyaw.spider.run.StandardSpider;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashMap;
import java.util.List;
import java.util.Map;


@SpringBootApplication
public class SpiderApplication implements ApplicationRunner {





    public static void main(String[] args) {
        SpringApplication.run(SpiderApplication.class);

    }


    @Override
    public void run(ApplicationArguments args) {
        System.out.println("=================== 启动完成 ==========================");

        RunSpider runSpider = new StandardSpider();


        new Thread(() -> {
            System.out.println("=================== 启动spider ==========================");

            // 线程池 ( 爬取数据 )
            new Thread(() -> {
                while (true) {
                    try {
                        Thread.sleep(10000L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("=======  爬取数据 ");

                    String url = "https://www.hao123.com/";
                    String httpData = runSpider.getHttpData(url);
                    Map<String, Object> map = new HashMap<>();
                    map.put("url", url);
                    map.put("data", httpData);
                    WebPageData.pageList.add(map);

                    System.out.println(httpData);
                }
            }).start();




            // 线程池 ( 处理数据 )
            new Thread(() -> {
                while (true) {
                    try {
                        Thread.sleep(100L);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.out.println("=======  处理数据 ");

                    // 获取数据
                    List<Map<String, Object>> pageList = WebPageData.pageList;
                    if(pageList.size()>0){
                        Map<String, Object> page = WebPageData.pageList.remove(0);
                        String data = page.get("data").toString();
                        PageHandleData pageHandleData = new PageHandleDataStandard(data);

                        // 获取页面title
                        pageHandleData.getPageTitle();

                        // 获取页面所有图片数据
                        pageHandleData.getTags("a");

                        // 获取页面所有 A 标签数据

                        //




                    }

                }
            }).start();


        }).start();

    }
}
