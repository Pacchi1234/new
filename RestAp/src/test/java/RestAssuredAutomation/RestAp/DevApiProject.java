package RestAssuredAutomation.RestAp;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.json.simple.JSONObject;
import org.testng.Assert;
import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.ValidatableResponse;

import java.io.*;

public class DevApiProject {
	// baseURL=https://devapi-ecs.ripplestreet.com/event/events/discover/events/list?page=1&size=10&eventType=OPENEVENTS
	@Test(priority = 1)
	public void get() throws IOException {
		RestAssured.baseURI = "https://devapi-ecs.ripplestreet.com";
		ValidatableResponse ActualOutput = RestAssured.given().when()
				.get("/event/events/discover/events/list?page=1&size=10&eventType=OPENEVENTS").then().statusCode(200)
				.log().all();
		int statusCode = 200;
		Assert.assertEquals(200, statusCode);
		File file = new File(
				"C:\\Users\\Prashanthchigarer\\eclipse-workspace\\RestAp\\src\\test\\resources\\Output.xlsx");
		FileInputStream fis = new FileInputStream(file);
		System.out.println(file.exists());

		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Sheet1");
		int lst = sheet.getLastRowNum();
		// System.out.println(lst);
		XSSFRow row = sheet.getRow(1);
		XSSFCell cell = row.getCell(1);
		String ExpectedOutput = cell.getStringCellValue();
		System.out.println("Expected Output is " + ExpectedOutput);
		fis.close();

		if (ExpectedOutput.equals(ActualOutput)) {
			System.out.println("Testcase has been passed");
		} else {
			System.out.println("Expected and actual output is mismatching");
		}
	}

	@Test(priority = 2)
	public void post() { //
		https: // devapi-ecs.ripplestreet.com/event/events/getAllEventsByIds
		RestAssured.baseURI = "https://devapi-ecs.ripplestreet.com";
		JSONObject json = new JSONObject();
		json.put("eventIds", "[1247]");
		RestAssured.given().body(json.toJSONString()).when().post("/event/events/getAllEventsByIds").then()
				.statusCode(201).log().all();
		int statusCode = 201;
		Assert.assertEquals(201, statusCode);
	}

	@Test(priority = 3)
	public void put() {
		RestAssured.baseURI = "https://devapi-ecs.ripplestreet.com";
		JSONObject json = new JSONObject();
		json.put("eventId", "1257");
		json.put("personId", "9593101");
		ValidatableResponse response = RestAssured.given().body(json.toString())
				.header("Content-Type", "application/json").contentType(ContentType.JSON).accept(ContentType.JSON)
				.body(json.toJSONString()).when().put("/event/events/likeUnlikeEvent").then().statusCode(200).log()
				.all();
		int statusCode = 200;
		Assert.assertEquals(200, statusCode);

	}

	// {\"name\":\"John Doe\",\"email\":\"john.doe@example.com\"}
	@Test
	public void TestPut() {
		RestAssured.baseURI = "https://devapi-ecs.ripplestreet.com";
		String body = "{\"eventId\":\"1257\",\"personId\":\"9593101\"}";

		RestAssured.given().body(body).contentType("application/json").when().put("/event/events/likeUnlikeEvent")
				.then().statusCode(200).log().all();
	}

	@Test
	public void TestPost() {
		RestAssured.baseURI = "https://devapi-ecs.ripplestreet.com";
		String body = "{\"eventIds\":\"1247\"}";
		RestAssured.given().contentType("application.json").body(body).when().post("/event/events/getAllEventsByIds")
				.then().statusCode(201).log().all();
	}
	//https://devapi-ecs.ripplestreet.com/event/events/getAllEventsByIds
	//POST Operation
	public void getAllEventsByIds() {
		String user="eventId:"+eventId;
		
	}
	

}
