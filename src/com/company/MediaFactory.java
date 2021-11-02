package com.company;

public class MediaFactory implements MainFactory {

    @Override
    public Developer getDeveloper() {
        return new JavaDeveloper();
    }

    @Override
    public Tester getTester() {
        return new QATester();
    }

    @Override
    public ContentProvider getContentProvider() {
        return new TelecomProvider();
    }
}
