package com.juaracoding.apitest.services;


import com.juaracoding.apitest.models.Plans;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PlansService {
    private RequestSpecification requestSpecification;
    private Response response;
    private Plans plans;
    private final String BASE_URL = "http://127.0.0.1:8000";

    public PlansService() {
        RestAssured.baseURI = BASE_URL;
        requestSpecification = RestAssured.given();
        plans = new Plans();
    }

    public Plans all(String token) {
        requestSpecification.header("Authorization", token);
        response = requestSpecification.get("/budgets/plans/");
        plans.setResponse(response);
        plans.setJsonString();
        return plans;
    }

    public void create() {
    }

    public Plans get(String token, int id) {
        requestSpecification.header("Authorization", token);
        response = requestSpecification.get("/budgets/plans/" + id + "/");
        plans.setResponse(response);
        plans.setJsonString();
        return plans;
    }

    public void update(int id) {
    }

    public void remove(int id) {
    }
}
