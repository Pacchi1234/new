package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class TargetsControllerGetApi  extends genricUtilities{
	@Test(groups="event-campaign-manager")
	public void getAlltargets() {
		response=RestAssured.get("/event-campaign-manager/v1/targets");
		Testcase=182;
	}

}
