package com.alex.homework_;

import java.util.ArrayList;
import java.util.Collections;

public class homework01 {
    public static void main(String[] args) {
        News news = new News("新冠确诊病例超千万，数百万印度教信徒远赴恒河圣浴引民众担忧");
        News news1 = new News("男子突然想起两个月前掉的鱼还在网兜中，捞起一看赶紧放生");
        ArrayList arrayList = new ArrayList();
        arrayList.add(news);
        arrayList.add(news1);
        Collections.reverse(arrayList);

        for (Object o :
                arrayList) {
            News news2  = (News) o;
            if (news2.getTitle().length()>15){
                news2.setTitle(news2.getTitle().substring(0,16)+"...");
            }
            System.out.println(news2.getTitle());
    }
}
static class News{
    private String title;
    private String content;

    public News(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "\nNews{" +
                "title='" + title + '\'' +
                '}';
    }
}}
