package com.cyyaw.spider.run;


import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;
import org.springframework.util.ObjectUtils;

import java.io.IOException;

/**
 * 标准爬虫
 */
public class StandardSpider implements RunSpider{


    public String getHttpData(String url) {
        if(!ObjectUtils.isEmpty(url)){
            try {
                Document document = Jsoup.connect(url).get();
                return document.html();
            } catch (IOException e) {
            }
        }
        return null;
    }


}
