package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class RewardDeliveryControllerGetApi extends genricUtilities {
	@Test(groups = "reward-service")
	public void getDeliverySystemAttributeValue() {
		response = RestAssured.get("/reward-service/v1/attributes/" + deliveryType);
		Testcase = 117;

	}

	@Test(groups = "reward-service")
	public void getRewardDeleveries() {
		response = RestAssured.given().queryParams("eventId", eventId, "pageNo", page, "personId", pid, "size", size)
				.get("/reward-service/v1/reward/deliveries");
		Testcase = 118;
	}

	@Test(groups = "reward-service")
	public void getRewardDeleverie() {
		response = RestAssured.given().queryParams("pageNo", page, "size", size)
				.get("/reward-service/v1/reward/deliveries/" + eventId);
		Testcase = 119;
	}

	@Test(groups = "reward-service")
	public void getAllRewardDeliveriesByPersonId() {
		response = RestAssured.given().queryParams("pageNo", page, "pageSize", size)
				.get("/reward-service/v1/reward/delivery/" + pid);
		Testcase=120;

	}
}
