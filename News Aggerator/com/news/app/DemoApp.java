package com.news.app;

import com.news.model.FakeNews;
import com.news.formatter.NewsVisualizer;
import com.news.processor.ContentCreator;

public class DemoApp {
    public static void main(String[] args) {
        System.out.println("--- Starting Package Demo ---\n");

        ContentCreator creator = new ContentCreator();
        FakeNews myNews = creator.createSillyStory();

        NewsVisualizer visualizer = new NewsVisualizer();
        visualizer.printWithBorder(myNews);

        System.out.println("\n--- Demo Completed Successfully ---");
    }
}