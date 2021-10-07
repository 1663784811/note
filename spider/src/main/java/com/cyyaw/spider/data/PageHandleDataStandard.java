package com.cyyaw.spider.data;

import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class PageHandleDataStandard implements PageHandleData{

    private Document webPage;

    public PageHandleDataStandard(String page){
       this.webPage = Jsoup.parse(page);
    }


    @Override
    public String getPageTitle() {
        return webPage.title();
    }

    @Override
    public void getTags(String tag) {

        Elements elements = webPage.getElementsByTag(tag);

        for (int i = 0; i < elements.size(); i++) {
            Element element = elements.get(i);
            element.attributes();

        }


    }

}
