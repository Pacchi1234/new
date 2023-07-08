package RestAssuredAutomation.RestAp;

import org.testng.annotations.Test;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.json.simple.JSONObject;

public class requresInApi {

	@Test(priority = 1)
	public void get() {
		RestAssured.baseURI = "https://reqres.in/api/users";
		RestAssured.given().param("id", "2").when().get().then().statusCode(200).log().all();
	}

	@Test(priority = 2)
	public void post() {
		JSONObject json = new JSONObject();
		json.put("name", "prashanth");
		json.put("job", "QA");
		json.put("id", "100");

		RestAssured.baseURI = "https://reqres.in/api/users";
		RestAssured.given().contentType(ContentType.JSON).body(json.toString()).when().post().then().statusCode(201).log().all();
				
	}

	@Test(priority = 3)
	public void delete() {
		RestAssured.baseURI = "https://reqres.in/api/users";
		RestAssured.given().param("id", "100").when().delete().then().statusCode(204).log().all();

	}

	@SuppressWarnings("unchecked")
	@Test(priority = 4)
	public void Patch() {
		JSONObject json = new JSONObject();
		json.put("job", "Quality Analyst");
		RestAssured.baseURI = "https://reqres.in/api/users/id=2";
		RestAssured.given().contentType(ContentType.JSON).body(json.toString()).when().patch().then().statusCode(200)
				.log().all();

	}

}
