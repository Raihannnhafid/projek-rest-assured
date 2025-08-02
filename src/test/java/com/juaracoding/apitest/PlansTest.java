package com.juaracoding.apitest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.juaracoding.apitest.models.Plans;
import com.juaracoding.apitest.services.PlansService;

public class PlansTest {
    @Test()
    public void tc0001() throws InterruptedException {
        Thread.sleep(2000);
        PlansService service = new PlansService();
        Plans plansTest1 = service.all("Token 47f44963872791c709318095f13632d5d6ab322d");
        Assert.assertEquals(plansTest1.getStatusCode(), 200);
    }

     @Test()
    public void tc0002() throws InterruptedException {
        Thread.sleep(2000);
        PlansService service = new PlansService();
        Plans plansTest1 = service.all("");
        Assert.assertEquals(plansTest1.getStatusCode(), 401);
    }

    @Test(enabled = false)
    public void tc0003() throws InterruptedException {
        Thread.sleep(2000);
        PlansService service = new PlansService();
        Plans plans = service.get("Token 47f44963872791c709318095f13632d5d6ab322d", 5);

        Assert.assertEquals(plans.getStatusCode(), 200);
    }
}
