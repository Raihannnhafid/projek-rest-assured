package com.juaracoding.apitest.services;

import com.juaracoding.apitest.models.GroupItems;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GroupItemsService {
    private RequestSpecification requestSpecification;
    private Response response;
    private GroupItems groupItems;
    private final String BASE_URL = "http://127.0.0.1:8000";

    public GroupItemsService() {
        RestAssured.baseURI = BASE_URL;
        requestSpecification = RestAssured.given();
        groupItems = new GroupItems();
    }

    public GroupItems all(String token) {
        requestSpecification.header("Authorization", token);
        response = requestSpecification.get("/catalogs/groups/");
        groupItems.setResponse(response);
        groupItems.setJsonString();
        return groupItems;
    }

    public void create() {
    }

    public GroupItems get(String token, int id) {
        requestSpecification.header("Authorization", token);
        response = requestSpecification.get("/catalogs/groups/" + id + "/");
        groupItems.setResponse(response);
        groupItems.setJsonString();
        return groupItems;
    }

    public void update(int id) {
    }

    public void remove(int id) {
    }
}
