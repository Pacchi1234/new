package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class EventTemplateControllerGetApi extends genricUtilities {
	@Test
	public void findAllEventTemplate() {
		response=RestAssured.get("/event-campaign-manager/v1/event/getAllEventTemplates");
		Testcase=162;
		
	}

}
