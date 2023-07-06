package RestAssuredAutomation.RestAp;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;

public class Test_01 {
	@Test
	void test() {
		Response response = RestAssured.get(
				"https://devapi-ecs.ripplestreet.com/event/events/discover/events/list?page=1&size=10&eventType=OPENEVENTS");
		System.out.println(response.getStatusCode());
		System.out.println(response.getStatusLine());
		System.out.println(response.getBody().asString());
		
		int statusCode = 200;
		Assert.assertEquals(statusCode, 200);
	}

}
