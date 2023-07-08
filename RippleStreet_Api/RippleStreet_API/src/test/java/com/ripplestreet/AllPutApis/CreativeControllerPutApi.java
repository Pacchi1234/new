package com.ripplestreet.AllPutApis;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import com.ripplestreet.genricUtilities.putApiUtilities;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;

public class CreativeControllerPutApi extends putApiUtilities {
	public void updateBannerIdandEventId() throws IOException {
		Testcase = 44;
		File file = new File(devApiPath);
		FileInputStream fis = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet(ExcelSheetPageName2);
		XSSFRow row2 = sheet.getRow(Testcase);
		XSSFCell cell2 = row2.getCell(2);
		PutBody = cell2.getStringCellValue();
		System.out.println(PutBody);

		response = RestAssured.given().contentType(ContentType.JSON).body(PutBody).when()
				.put("/event-campaign-manager/v1/creative/event/" + eventId + "/banner/" + bannerId);

	}

	@Test
	public void updateFavors() throws Exception {
		Testcase = 45;
		File file = new File(devApiPath);
		FileInputStream fis = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet(ExcelSheetPageName2);
		XSSFRow row2 = sheet.getRow(Testcase);
		XSSFCell cell2 = row2.getCell(2);
		PutBody = cell2.getStringCellValue();
		System.out.println(PutBody);

		response = RestAssured.given().contentType(ContentType.JSON).body(PutBody).when()
				.put("/event-campaign-manager/v1/creative/event/" + eventId + "/favors/" + favorId);

	}

	@Test
	public void reOrganizeFavors() throws Exception {
		Testcase = 46;
		File file = new File(devApiPath);
		FileInputStream fis = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet(ExcelSheetPageName2);
		XSSFRow row2 = sheet.getRow(Testcase);
		XSSFCell cell2 = row2.getCell(2);
		PutBody = cell2.getStringCellValue();
		System.out.println(PutBody);

		response = RestAssured.given().contentType(ContentType.JSON).body(PutBody).when()
				.put("/event-campaign-manager/v1/creative/event/" + eventId + "/reorganizeFavors");

	}

	@Test
	public void UpdateHeroPlayListItems() throws Exception {
		Testcase = 47;
		File file = new File(devApiPath);
		FileInputStream fis = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);

		XSSFSheet sheet = workbook.getSheet(ExcelSheetPageName2);
		XSSFRow row2 = sheet.getRow(Testcase);
		XSSFCell cell2 = row2.getCell(2);
		PutBody = cell2.getStringCellValue();
		System.out.println(PutBody);
		response = RestAssured.given().contentType(ContentType.JSON).body(PutBody).when()
				.put("/event-campaign-manager/v1/creative/heroPlaylistItems/" + playlistId);

	}

	@Test
	public void ReOrganizeHeroPlayListItems() throws Exception {
		Testcase = 48;
		File file = new File(devApiPath);
		FileInputStream fis = new FileInputStream(file);
		@SuppressWarnings("resource")
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(ExcelSheetPageName2);
		XSSFRow row2 = sheet.getRow(Testcase);
		XSSFCell cell2 = row2.getCell(2);
		PutBody = cell2.getStringCellValue();
		System.out.println(PutBody);

		response = RestAssured.given().contentType(ContentType.JSON).body(PutBody).when()
				.put("/event-campaign-manager/v1/creative/reorganizeHeroPlaylistItems");

	}
}
