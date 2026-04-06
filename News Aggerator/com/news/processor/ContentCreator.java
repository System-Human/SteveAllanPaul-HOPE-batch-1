package com.news.processor;

import com.news.model.FakeNews;

public class ContentCreator {
    public FakeNews createSillyStory() {
        return new FakeNews("Local cat elected as Mayor of New York!");
    }
}