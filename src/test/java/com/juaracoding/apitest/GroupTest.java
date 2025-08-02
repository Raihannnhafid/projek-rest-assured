package com.juaracoding.apitest;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.juaracoding.apitest.models.Group;
import com.juaracoding.apitest.services.GroupService;

public class GroupTest {
    @Test()
    public void tc0001() throws InterruptedException {
        Thread.sleep(2000);
        GroupService service = new GroupService();
        Group groupTest1 = service.all("Token 47f44963872791c709318095f13632d5d6ab322d");
        Assert.assertEquals(groupTest1.getStatusCode(), 200);
    }

    @Test()
    public void tc0002() throws InterruptedException {
        Thread.sleep(2000);
        GroupService service = new GroupService();
        Group groupTest1 = service.all("");
        Assert.assertEquals(groupTest1.getStatusCode(), 401);
    }

    @Test()
    public void tc0003() throws InterruptedException {
        Thread.sleep(2000);
        GroupService service = new GroupService();
        Group group = service.get("Token 47f44963872791c709318095f13632d5d6ab322d", 5);

        Assert.assertEquals(group.getStatusCode(), 200);
    }

    // @Test()
    // public void tc0002() {
    // // RestAssured.baseURI = BASE_URL;
    // RestAssured.given()
    // .when()
    // .get("/products/2")
    // .then()
    // .statusCode(200)
    // .statusLine("HTTP/1.1 200 OK")
    // .body("category", CoreMatchers.equalTo("Metal"))
    // .body("price", CoreMatchers.equalTo("523.49"));
    // }
}
