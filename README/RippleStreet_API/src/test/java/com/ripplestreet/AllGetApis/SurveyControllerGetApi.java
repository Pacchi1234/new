package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class SurveyControllerGetApi extends genricUtilities {
	@Test(groups="event-campaign-manager")
	public void getSurveyStatusByEventIdAndPid() {
		response = RestAssured.get("/event-campaign-manager/v1/event/" + eventId + "/person/" + pid);
		Testcase = 179;
	}

	@Test(groups="event-campaign-manager")
	public void getAllLinksByEventId() {
		response = RestAssured.given().queryParams("pageNo", page, "pageSize", size)
				.get("/event-campaign-manager/v1/event/" + eventId + "/survey/list");
		Testcase = 180;
	}

	@Test(groups="event-campaign-manager")
	public void getSurveyListByEventIdAndPid() {
		response = RestAssured.given().queryParams("type", surveyType)
				.get("/event-campaign-manager/v1/event/"+eventId+"/person/"+pid+"/surveyList");
		Testcase = 181;
	}

}
