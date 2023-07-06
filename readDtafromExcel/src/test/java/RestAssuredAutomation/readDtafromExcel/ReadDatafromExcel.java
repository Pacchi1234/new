package RestAssuredAutomation.readDtafromExcel;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;
//import org.testng.annotations.Test;

public class ReadDatafromExcel {
	@Test
	public void test() throws Throwable {
		File f= new File("C:\\Users\\Prashanthchigarer\\eclipse-workspace\\readDtafromExcel\\src\\test\\resource\\ExpectedOutput.xlsx");
		System.out.println(f.exists());
		
		FileInputStream fis=new FileInputStream(f);
		
		XSSFWorkbook workbook = new XSSFWorkbook(fis);
		XSSFSheet sheet = workbook.getSheet("Demo1");
		int lst = sheet.getLastRowNum();
		XSSFRow row = sheet.getRow(1);
            System.out.println(row.getCell(1));
	}
		
		

	

}
