package com.cyyaw.spider.controller;


import com.cyyaw.spider.data.WebPageData;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IndexController {


    @RequestMapping(value = {"", "index"})
    public String index(){
        return "index";
    }


    @RequestMapping("setUrl")
    public String setUrl(String url){
        if(!ObjectUtils.isEmpty(url)){
            WebPageData.pageUrl.add(url);
        }
        return "ok";
    }

}
