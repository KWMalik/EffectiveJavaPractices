package com.thoughtworks.Section1;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class ServicesTest {
    @Test
    public void should_return_default_service_when_no_parameter() {
        Provider provider = new DefaultProvider();

        Services.registerDefaultProvider(provider);
        Service defaultService = Services.newInstance();

        assertEquals("Hello gays!", defaultService.provideService());
    }

    @Test
    public void should_return_exist_service_when_this_service_provider_have_registered() {
        Provider provider = new HappyDaysProvider();

        Services.registerProvider("<HappyDay>", provider);
        Service happyDayService = Services.newInstance("<HappyDay>");

        assertEquals("Happy Day!", happyDayService.provideService());
    }
}
