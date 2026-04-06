package com.news.app;

// Importing from our custom packages
import com.news.model.FakeNews;
import com.news.formatter.NewsVisualizer;
import com.news.processor.ContentCreator;

public class DemoApp {
    public static void main(String[] args) {
        System.out.println("--- Starting Package Demo ---\n");

        // 1. Use the processor to get data
        ContentCreator creator = new ContentCreator();
        FakeNews myNews = creator.createSillyStory();

        // 2. Use the formatter to print it
        NewsVisualizer visualizer = new NewsVisualizer();
        visualizer.printWithBorder(myNews);

        System.out.println("\n--- Demo Completed Successfully ---");
    }
}