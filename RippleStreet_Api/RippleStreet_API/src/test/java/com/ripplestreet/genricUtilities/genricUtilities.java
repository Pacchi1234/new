package com.ripplestreet.genricUtilities;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import junit.framework.Assert;
import org.testng.asserts.SoftAssert;
public class genricUtilities {
	public static String baseURI = ConfigFileReader.getInstance().getBaseURI();
	public static String eventId = ConfigFileReader.getInstance().getEventId();
	public String page = ConfigFileReader.getInstance().getPage();
	public static String size = ConfigFileReader.getInstance().getSize();
	public String activitiesName = ConfigFileReader.getInstance().getActivitiesName();
	public String pid = ConfigFileReader.getInstance().getPid();
	public String slug = ConfigFileReader.getInstance().getSlugValue();
	public String productId = ConfigFileReader.getInstance().getProductId();
	public String eventName = ConfigFileReader.getInstance().getByEventName();
	public static String devApiPath = ConfigFileReader.getInstance().getdevApiPath();
	public String packCount = ConfigFileReader.getInstance().getpackCount();
	public String feedItemId = ConfigFileReader.getInstance().getfeedItemId();
	public static String ExcelSheetPageName = ConfigFileReader.getInstance().getExcelSheetPageName();
	public String feedType = ConfigFileReader.getInstance().getfeedType();
	public String discussion_id = ConfigFileReader.getInstance().getdiscussion_id();
	public String model = ConfigFileReader.getInstance().getmodel();
	public String comment = ConfigFileReader.getInstance().getcomment();
	public String ipAddress = ConfigFileReader.getInstance().getipAddress();
	public String ugctaskId = ConfigFileReader.getInstance().getugcTaskId();
	public String ugcId = ConfigFileReader.getInstance().ugcId();
	public String assetId = ConfigFileReader.getInstance().getAssetId();
	public String reviewId = ConfigFileReader.getInstance().getreviewId();
	public String activityId = ConfigFileReader.getInstance().getactivityId();
	public String activitygroupId = ConfigFileReader.getInstance().getactivitygroupId();
	public String taskId = ConfigFileReader.getInstance().gettaskId();
	public String status = ConfigFileReader.getInstance().getstatus();
	public String segmentId = ConfigFileReader.getInstance().getsegmentId();
	public String segmentName = ConfigFileReader.getInstance().getsegmentName();
	public String folderId = ConfigFileReader.getInstance().getFolderId();
	public String segmentationtriggerId = ConfigFileReader.getInstance().getsegmentationtriggerId();
	public String tableName = ConfigFileReader.getInstance().gettableName();
	public String operation = ConfigFileReader.getInstance().getoperation();
	public String gamificationActivityId = ConfigFileReader.getInstance().getgamificationActivityId();
	public static String columnName = ConfigFileReader.getInstance().getcolumnName();
	public static String directionDESC = ConfigFileReader.getInstance().getdirectionDESC();
	public static String gamespageNo = ConfigFileReader.getInstance().getgamespageNo();
	public String gameId = ConfigFileReader.getInstance().getgameId();
	public String gameSlug = ConfigFileReader.getInstance().getgameSlug();
	public String jobId = ConfigFileReader.getInstance().getjobId();
	public String sourceType = ConfigFileReader.getInstance().getsourceType();
	public String receiptId = ConfigFileReader.getInstance().getreceiptId();
	public String collectionName = ConfigFileReader.getInstance().getcollectionName();
	public String optInId = ConfigFileReader.getInstance().getoptInId();
	public String rewardAllocationId = ConfigFileReader.getInstance().getrewardAllocationId();
	public String rewardId = ConfigFileReader.getInstance().getrewardId();
	public String rewardName = ConfigFileReader.getInstance().getrewardName();
	public String deliveryType = ConfigFileReader.getInstance().getdeliveryType();
	public String swagId = ConfigFileReader.getInstance().getswagId();
	public String notificationId = ConfigFileReader.getInstance().getnotificationId();
	public String campaignName = ConfigFileReader.getInstance().getcampaignName();
	public String email = ConfigFileReader.getInstance().getemail();
	public String templateName = ConfigFileReader.getInstance().gettemplateName();
	public String templateType = ConfigFileReader.getInstance().gettemplateType();
	public String templateTypeEnum = ConfigFileReader.getInstance().gettemplateTypeEnum();
	public String transactionlType = ConfigFileReader.getInstance().gettransactionType();
	public String fileName = ConfigFileReader.getInstance().gettransactionType();
	public String transactionTemplateId = ConfigFileReader.getInstance().gettransactionTemplateId();
	public String matrixNotificationId = ConfigFileReader.getInstance().getmatrixNotificationId();
	public String agencyId = ConfigFileReader.getInstance().getagencyId();
	// public String campaignId = ConfigFileReader.getInstance().getcampaignId();
	public String playlistId = ConfigFileReader.getInstance().getplaylistId();
	public String bannerId = ConfigFileReader.getInstance().getbannerId();
	public String favorId = ConfigFileReader.getInstance().getfavorId();
	public String milestoneId = ConfigFileReader.getInstance().getmilestoneId();
	public String eventType = ConfigFileReader.getInstance().geteventtype();
	public String faqId = ConfigFileReader.getInstance().getfaqId();
	public String faqtopicId = ConfigFileReader.getInstance().getfaqtopicId();
	public String roleId = ConfigFileReader.getInstance().getrolId();
	public String sponsorId = ConfigFileReader.getInstance().getsponsorId();
	public String surveyType = ConfigFileReader.getInstance().getsurveyType();
	public String linkId = ConfigFileReader.getInstance().getlinkId();
	public String templateId = ConfigFileReader.getInstance().gettemplateId();
	public String eventCreatedDate = ConfigFileReader.getInstance().geteventCreatedDate();
	public String achievementId = ConfigFileReader.getInstance().getachievementId();
	public String triggerId = ConfigFileReader.getInstance().gettriggerId();
	public String AchievementProgramId = ConfigFileReader.getInstance().getAchievementProgramId();
	public String benifitType = ConfigFileReader.getInstance().getbenifitType();
	public String campaignId = ConfigFileReader.getInstance().getcampaignId();
	public String directionASC = ConfigFileReader.getInstance().getdirectionASC();
	public String evnetTypeUpcomingEvents = ConfigFileReader.getInstance().getevnetTypeUpcomingEvents();
	public String eventTypeOpenEvents = ConfigFileReader.getInstance().geteventTypeOpenEvents();
	public String eventTypeCurrentEvents = ConfigFileReader.getInstance().geteventTypeCurrentEvents();
	public String eventTypePastEvents = ConfigFileReader.getInstance().geteventTypePastEvents();

	public static Response response;
	public static int Testcase;

	@BeforeMethod
	public void BaseURI() throws InterruptedException {

		RestAssured.baseURI = baseURI;
	}

	@SuppressWarnings("unlikely-arg-type")
	@AfterMethod
	public static void StatusCode() throws IOException {
		RestAssured.baseURI = baseURI;
		SoftAssert softAssert = new SoftAssert();
		int statusCode = 200;
		softAssert.assertEquals(200, statusCode);
		String ActualOutput = response.asString();
		System.out.println(ActualOutput);
		File file = new File(devApiPath);
		FileInputStream fis = new FileInputStream(file);
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet(ExcelSheetPageName);
		XSSFRow row = sheet.getRow(Testcase);
		XSSFCell cell = row.getCell(2);
		if (cell.getCellType() == CellType.STRING) {
			String ExpectedOutput = cell.getStringCellValue();
			if (ExpectedOutput.equals(ActualOutput)) {

				System.err.println("TestCase" + " " + Testcase + " " + "has been passed");

			} else {
				
				System.err.println("TestCase" + " " + Testcase + " " + "Expected and actual output is Mismatching");
				softAssert.assertEquals(ActualOutput, cell);

			}
		} else if (cell.getCellType() == CellType.NUMERIC) {
			int ExpectedOutput = (int) cell.getNumericCellValue();
			int Actual_output = Integer.parseInt(ActualOutput);

			if (ExpectedOutput==Actual_output) {
			
				System.err.println("TestCase" + " " + Testcase + " " + "has been passed");
				softAssert.assertEquals(ActualOutput, cell);

			} else {
				System.err.println("TestCase" + " " + Testcase + " " + "Expected and actual output is Mismatching");
			}

		} else if (cell.getCellType() == CellType.BOOLEAN) {
			Boolean ExpectedOutput = cell.getBooleanCellValue();

			if (ExpectedOutput.equals(ActualOutput)) {
				
				System.err.println("TestCase" + " " + Testcase + " " + "has been passed");
				softAssert.assertEquals(ActualOutput, cell);

			} else {
				System.err.println("TestCase" + " " + Testcase + " " + "Expected and actual output is Mismatching");
			}

		}
		System.out.println(cell);
		XSSFSheet sheet1 = workbook.getSheet(ExcelSheetPageName);
		XSSFRow row1 = sheet1.getRow(Testcase);
		XSSFCell cell1 = row1.getCell(3);
		cell1.setCellValue(ActualOutput);
		FileOutputStream fio = new FileOutputStream(file);
		workbook.write(fio);
		workbook.close();

	}
}
