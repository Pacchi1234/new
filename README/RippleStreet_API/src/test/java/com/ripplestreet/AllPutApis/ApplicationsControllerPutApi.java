package com.ripplestreet.AllPutApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.putApiUtilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class ApplicationsControllerPutApi extends putApiUtilities {
	@Test
	public void updateApplications() {
		
		response = RestAssured.given().contentType(ContentType.JSON).body(PutBody).when().put("http://ecs-activity-alb-1514376471.us-east-1.elb.amazonaws.com/community-service/v1/event/"+eventId+"/application/"+applicationId+"?isSponsorSubscribed="+isSponsorSubscribed);
		
		

	}
}
