package RestAssuredAutomation.RestAp;

import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.Properties;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.HashMap;
import org.testng.annotations.BeforeClass;
import static io.restassured.RestAssured.*;

//https://devapi-ecs.ripplestreet.com/event/events/discover/events/list?page=1&size=10&eventType=OPENEVENTS
public class GetAndPost {

	@Test(priority = 1)
	public void Get() throws IOException {
		given().pathParam("mypath", "/event/events/discover/events/list").queryParam("page", "1")
				.queryParam("size", "10").queryParam("eventType", "OPENEVENTS").when().get("//https://devapi-ecs.ripplestreet.com/{mypath}").then().statusCode(200);

	}

	@Test
	void test() {
		given().when().get(
				"https://devapi-ecs.ripplestreet.com/event/events/discover/events/list?page=1&size=10&eventType=OPENEVENTS")
				.then().statusCode(200).log().all();
	}

	@Test(priority = 2)
	public void Post() {
		HashMap<String, String> map = new HashMap<String, String>();
		map.put("job", "QA");
		map.put("name", "prashanth");
		given().contentType("application/json").body(map).when().post(
				"https://devapi-ecs.ripplestreet.com/event/events/discover/events/list?page=1&size=10&eventType=OPENEVENTS")
				.then().statusCode(405).log().all();

	}

	@Test(priority = 3)
	public void delete() {
		given().when().delete(
				"https://devapi-ecs.ripplestreet.com/event/events/discover/events/list?page=1&size=10&eventType=OPENEVENTS")
				.then().statusCode(405).log().all();
	}

}
