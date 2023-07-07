package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;
import com.ripplestreet.genricUtilities.genricUtilities;
import io.restassured.RestAssured;

public class UgcControllerGetApi extends genricUtilities {
	@Test(groups="activityugcreview")
	public void getUgcDetailsByTaskId() {
		response = RestAssured.given().when().get("/activityugcreview/client_api/getUgcDetailsById/" + ugcId);
		Testcase = 49;

	}

	@Test(groups="activityugcreview")
	public void downloadAsset() {
		response = RestAssured.given().when().get("/activityugcreview/client_api/downloadAsset?assetId=" + assetId);
		Testcase = 50;
		// getting output as image formate

	}

	@Test(groups="activityugcreview")
	public void downloadAssetByURL() {
		response = RestAssured.given().when()
				.get("/activityugcreview/client_api/downloadAssetByURL?assetId=" + assetId);
		Testcase = 51;
	}

	@Test(groups="activityugcreview")
	public void getImageRecognitionResponse() {
		response = RestAssured.given().when()
				.get("/activityugcreview/client_api/getImageRecognition?eventId=" + eventId);
		Testcase = 52;
	}

	@Test(groups="activityugcreview")
	public void getUgcDetailsById() {
		response = RestAssured.given().when().get("/activityugcreview/client_api/getUgcDetailsById/" + eventId);
		Testcase = 53;

	}

	@Test(groups="activityugcreview",enabled=false)
	public void getUserAsset() {
		response = RestAssured.given().when().get("/activityugcreview/client_api/getUserAsset?eventId=" + eventId);
		Testcase = 54;
		// output is 500 internal server error

	}

}
