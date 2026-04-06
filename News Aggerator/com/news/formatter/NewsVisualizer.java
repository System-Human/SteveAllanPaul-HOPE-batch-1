package com.news.formatter;

import com.news.model.FakeNews;

public class NewsVisualizer {
    public void printWithBorder(FakeNews news) {
        System.out.println("************************************");
        System.out.println(" BREAKING NEWS: " + news.content);
        System.out.println("************************************");
    }
}