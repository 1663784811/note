package com.cyyaw.spider.data;

import java.util.List;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;


public class WebPageData {

    public static volatile List<Map<String,Object>> pageList = new CopyOnWriteArrayList();
}
