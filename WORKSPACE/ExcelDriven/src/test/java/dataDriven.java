import java.io.FileInputStream;

import java.io.IOException;

import java.util.Iterator;



import org.apache.poi.ss.usermodel.Cell;

import org.apache.poi.ss.usermodel.Row;

import org.apache.poi.xssf.usermodel.XSSFSheet;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;



public class dataDriven {

// Identify TestSuit column by scanning the entire row

// Once Column is identified than scan entire TestSuite column to identify Purchase TestSUite row

// After you grab Purchase TestSuite row- pull the data of that row n feed into test

public static void main(String [] args) throws IOException {

// Create Object for XSSFWorkbook Class

FileInputStream fis= new FileInputStream("D:\\JAVA\\WORKSPACE\\demodata.xlsx");

XSSFWorkbook book= new XSSFWorkbook(fis);

// Get Access to sheet

int sheets=book.getNumberOfSheets();

for(int i=0; i<sheets; i++)

{

if(book.getSheetName(i).equalsIgnoreCase("testdata"))

{

XSSFSheet sheet=book.getSheetAt(i);

// Identify TestSuit column by scanning the entire row

Iterator<Row> rows=sheet.iterator(); // Sheet is collection of Rows

Row firstrow=rows.next();

Iterator<Cell> cells=firstrow.cellIterator(); // Row is collection of Cells

int k = 0;

int column = 0;

while(cells.hasNext())

{

Cell value=cells.next();

if(value.getStringCellValue().equalsIgnoreCase("TestCases"))

{

// Desired Column

column = k;

}

k++;

}

System.out.println(column);

// Once Column is identified than scan entire TestSuite column to identify Purchase TestSUite row

while(rows.hasNext())

{

Row r=rows.next();

if(r.getCell(column).getStringCellValue().equalsIgnoreCase("Purchase"))

{

// After you grab Purchase TestSuite row- pull the data of that row n feed into test

Iterator<Cell> cv=r.cellIterator();

while(cv.hasNext())

{

System.out.println(cv.next().getStringCellValue());

}

}

}

}



}

}

}