package com.cyyaw.spider.run;

public class UrlFilters {

    private String urlArr[] ={
            "baidu.com",
            "taobao.com",
            "qq.com"
    };


    public boolean filter(String url){
        for (String stopUrl: urlArr) {
            if (url.indexOf(stopUrl)>0) {
                return false;
            }
        }
        return true;
    }


}
