package Utility;


import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelHandling {

    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;


    public String getCellData(String filePath, String sheetName, int currentRow, int currentCell) {


        String cellValue = "";
        try {

            FileInputStream inputStream = new FileInputStream(filePath);
            workbook = new XSSFWorkbook(inputStream);
            sheet = workbook.getSheet(sheetName);

            int rowCount = sheet.getLastRowNum();
            int cellCount = sheet.getRow(0).getLastCellNum();
            System.out.println("total cells are : " + cellCount);

            for (int current_Row=currentRow ; current_Row<=rowCount; current_Row++){

                row = sheet.getRow(currentRow);
                if (row!=null){

                    cell = row.getCell(currentCell);
                }

                if (cell!=null){

                cellValue = cell.getStringCellValue();
                }
            }
        }catch (IOException e){

            throw new RuntimeException("Unable to find the file...");
        }
        return cellValue;
    }
}
