package practice;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.IOException;

public class ExcelHandling {

    FileInputStream inputStream;
    XSSFWorkbook workbook;
    XSSFSheet sheet;
    XSSFRow row;
    XSSFCell cell;

    @Test
    public void handlingExcel(){

        try {

            inputStream = new FileInputStream(".//Excel//orange.xlsx");
            workbook = new XSSFWorkbook(inputStream);
            sheet = workbook.getSheetAt(0);

            int total_Rows = sheet.getLastRowNum();
            int total_Cells  = sheet.getRow(0).getLastCellNum();

            System.out.println("Total number of rows are: " + total_Rows );
            System.out.println("Total number of cells are: " + total_Cells);

            if (total_Rows>0){

                for (int currentRow = 1; currentRow<=total_Rows; currentRow++){

                    row = sheet.getRow(currentRow);
                    if (row!=null){

                        for (int currentCell = 0; currentCell<total_Cells; currentCell++){

                            cell = row.getCell(currentCell);
                            String cellValue = cell.getStringCellValue();
                            System.out.println(cellValue);

                        }

                    }
                }
            }
            workbook.close();
            inputStream.close();

        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
