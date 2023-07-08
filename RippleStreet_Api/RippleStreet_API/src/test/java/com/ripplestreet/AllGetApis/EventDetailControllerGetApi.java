package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class EventDetailControllerGetApi extends genricUtilities {
	@Test(groups="event-campaign-manager")
	public void getBasicEventDetailByEventID() {
		response = RestAssured.get("/event-campaign-manager/v1/basicDetail/" + eventId);
		Testcase = 157;
	}

	@Test(groups="event-campaign-manager")
	public void findAllmileStonesByEvent() {
		response = RestAssured.given().queryParams("pageSize", size)
				.get("event-campaign-manager/v1/event/" + eventId + "/listMilestonesByEvent");
		Testcase = 158;

	}

	@Test(groups="event-campaign-manager")
	public void findMileStoneById() {
		response = RestAssured.get("/event-campaign-manager/v1/event/" + eventId + "/milestone/" + milestoneId);
		Testcase = 159;

	}

	@Test(groups="event-campaign-manager")
	public void getListoftargetsByEventId() {
		response = RestAssured.get("/event-campaign-manager/v1/event/" + eventId + "/target/list");
		Testcase = 160;

	}

	@Test(groups="event-campaign-manager")
	public void findAllMilestonesTypeByEventtypes() {
		response= RestAssured.given().param("eventType", eventType)
				.get("/event-campaign-manager/v1/milestoneTypes/{eventType}/list");
		Testcase = 161;

	}
}
