package dataDrivenTestingSandeepSir;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class HandlingExcelFile {
	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		//Get the java representative object of the Physical File
		FileInputStream fis=new FileInputStream("./src/test/resources/TestScript.xlsx");
		
		//Open the Workbook or create the Workbook
		Workbook wb = WorkbookFactory.create(fis);
		
		//get the control, then the row, then the cell, then read the data
		String data = wb.getSheet("CreateCustomer").getRow(1).getCell(2).getStringCellValue();
		
		//Print the data
		System.out.println(data);
	}

}
