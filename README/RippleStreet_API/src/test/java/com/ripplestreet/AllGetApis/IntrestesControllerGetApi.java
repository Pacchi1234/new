package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.amazonAwsUtilities;

import io.restassured.RestAssured;

public class IntrestesControllerGetApi extends amazonAwsUtilities {
	@Test(groups="community-service")
	public void Allcategorieslist() {
		response=RestAssured.given().when().get("/community-service/interests");
		Testcase=34;

	}
	@Test(groups="community-service")
	public void getUserInterestByPersonId() {
		response=RestAssured.given().when().get("/community-service/interests/"+pid);
		Testcase=35;
	
	}

}
