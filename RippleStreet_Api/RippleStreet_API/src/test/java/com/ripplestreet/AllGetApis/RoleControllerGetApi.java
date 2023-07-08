package com.ripplestreet.AllGetApis;

import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.genricUtilities;

import io.restassured.RestAssured;

public class RoleControllerGetApi extends genricUtilities {
	@Test(groups="event-campaign-manager")
	public void getLlistOfPeopleByRoleID() {
		response=RestAssured.get("/event-campaign-manager/v1/roles/"+roleId+"/people");
		Testcase=174;
		
	}
	@Test(groups="event-campaign-manager")
	public void getListOfRoles() {
		response=RestAssured.get("/event-campaign-manager/v1/roles/list");
		Testcase=175;
		
	}

}
