package com.juaracoding.apitest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.juaracoding.apitest.models.GroupItems;
import com.juaracoding.apitest.services.GroupItemsService;


public class GroupItemsTest {
    @Test()
    public void tc0001() throws InterruptedException {
        Thread.sleep(2000);
        GroupItemsService service = new GroupItemsService();
        GroupItems groupItemsTest1 = service.all("Token 47f44963872791c709318095f13632d5d6ab322d");
        Assert.assertEquals(groupItemsTest1.getStatusCode(), 200);
    }

    @Test()
    public void tc0002() throws InterruptedException {
        Thread.sleep(2000);
        GroupItemsService service = new GroupItemsService();
        GroupItems groupItemsTest1 = service.all("");
        Assert.assertEquals(groupItemsTest1.getStatusCode(), 401);
    }

    @Test()
    public void tc0003() throws InterruptedException {
        Thread.sleep(2000);
        GroupItemsService service = new GroupItemsService();
        GroupItems groupItemsTest1 = service.get("Token 47f44963872791c709318095f13632d5d6ab322d", 5);

        Assert.assertEquals(groupItemsTest1.getStatusCode(), 200);
    }
}
