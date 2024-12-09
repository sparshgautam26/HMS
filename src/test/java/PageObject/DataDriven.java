package PageObject;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class DataDriven {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//Excel File ------------ Workbook -------- Sheet --------- Rows ------------- cells
		
		/*
		 * FileInputStream ----------- Input the file in program and read 
		 * XSSFWorkbook --------- Extract the workbook
		 * XSSFSheet -------- Extract the sheet
		 * XSSFRow ------------ Extract the row drom the sheet
		 * XSSFCell ----------- Extract the cell from the rows
		 */
		
		
		FileInputStream file = new FileInputStream("/home/yagvendra/Documents/PracticalMaven/Java/TestData/testdata.xlsx");
		
		XSSFWorkbook workbook = new XSSFWorkbook(file);
		
		XSSFSheet sheet = workbook.getSheet("sheet1");
		
		int totalrows=sheet.getLastRowNum();
		
		int totalcell= sheet.getRow(1).getLastCellNum();
		
		System.out.println("Total rows"+totalrows);
		System.out.println("Total columns"+totalcell);
		
		
		for(int r=0;r<=totalrows;r++)
		{
			
			XSSFRow currentRow = sheet.getRow(r);
			
			for(int c=0;c<totalcell;c++)
			{
				XSSFCell cell = currentRow.getCell(c);
				System.out.print(cell.toString()+"\t");
			}
			System.out.println();
		}

		workbook.close();
		file.close();
	}

}


