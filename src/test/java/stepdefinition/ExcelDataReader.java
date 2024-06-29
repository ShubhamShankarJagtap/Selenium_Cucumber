package stepdefinition;

import Utility.ExcelHandling;
import org.testng.annotations.Test;

public class ExcelDataReader {

    @Test
    public void getCellData(){

      ExcelHandling excelHandling = new ExcelHandling();

      String url = excelHandling.getCellData(".//Excel//orange.xlsx", "login", 1, 0);
      String username =  excelHandling.getCellData(".//Excel//orange.xlsx", "login", 1, 1);
      String password =  excelHandling.getCellData(".//Excel//orange.xlsx", "login", 1, 2);

        System.out.println("URL : " + url + " , " + " username : " + username + " password : " + password);
    }
}
