package com.thoughtworks.Section1;

public class DefaultProvider implements Provider {

    @Override
    public Service newService() {
        return new HelloWorldService();
    }
}
