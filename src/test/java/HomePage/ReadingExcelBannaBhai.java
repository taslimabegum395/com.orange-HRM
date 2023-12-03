package HomePage;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadingExcelBannaBhai {
    public static void main(String[] args) throws IOException {

        FileInputStream file = new FileInputStream("C:\\Users\\gtas6\\IdeaProjects\\com.OrangeHRM\\testdata\\New Microsoft Excel Worksheet.xlsx");
        // FileInputStream file = new FileInputStream(System.getProperty("user.dir")+"\\testdata\\testdata.xlsx");
//hasan banna
        XSSFWorkbook workbook = new XSSFWorkbook(file);
        XSSFSheet sheet = workbook.getSheet("Sheet1");
       int totalrows= sheet.getLastRowNum();
      int totalcells= sheet.getRow(1).getLastCellNum();
        System.out.println(totalrows);
        System.out.println(totalcells);

  //      int totalrows=sheet.getLastRowNum();
       // int totalcells=sheet.getRow(1).getLastCellNum();
//
//        System.out.println(totalrows);
//        System.out.println(totalcells);
    }
}
