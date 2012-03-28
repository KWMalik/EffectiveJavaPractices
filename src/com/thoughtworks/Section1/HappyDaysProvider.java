package com.thoughtworks.Section1;

public class HappyDaysProvider implements Provider {
    @Override
    public Service newService() {
        return new HappyDayService();
    }
}
