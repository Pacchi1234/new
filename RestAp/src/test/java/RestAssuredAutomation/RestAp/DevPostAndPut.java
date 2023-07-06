package RestAssuredAutomation.RestAp;

import org.testng.annotations.Test;
import org.json.simple.JSONObject;
import java.util.*;

import io.restassured.RestAssured;
import io.restassured.RestAssured.*;
import io.restassured.http.ContentType;

public class DevPostAndPut {
	// https://devapi-ecs.ripplestreet.com/event/events/getAllEventsByIds
	@Test
	public void post() {
		RestAssured.baseURI = "https://devapi-ecs.ripplestreet.com";
		JSONObject json = new JSONObject();
		json.put("eventIds", "1247");
		// System.out.println(object.toString());
		RestAssured.given().header("Content-Type", "application/json").contentType(ContentType.JSON)
				.accept(ContentType.JSON).body(json.toString()).when().post("/event/events/getAllEventsByIds").then()
				.statusCode(400).log().all();

	}

	@Test
	public void put() {
		// base URL it is constant
		RestAssured.baseURI = "https://devapi-ecs.ripplestreet.com";
		JSONObject json = new JSONObject();
		json.put("eventId", "1257");
		json.put("personId", "9593101");
		// pass endPoints URL with respective methods like PUT,POST,PATCH and DELETE
		RestAssured.given().header("Content-Type", "application/json").contentType(ContentType.JSON)
				.accept(ContentType.JSON).body(json.toString()).when().put("/event/events/likeUnlikeEvent").then()
				.statusCode(200).log().all();

	}

	public void Delete() {

	}

}
