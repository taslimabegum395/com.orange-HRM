package HomePage;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Iterator;

public class ReadingExcell1 {
    public static void main(String[] args) throws IOException, IOException {

        //create file

        FileInputStream file = new FileInputStream("C:\\Users\\gtas6\\IdeaProjects\\com.OrangeHRM\\testdata\\New Microsoft Excel Worksheet.xlsx");
        //create wordbook
        //create workbook
        XSSFWorkbook workbook = new XSSFWorkbook(file);

        //create excel sheet

        XSSFSheet sheet = workbook.getSheet("sheet1");

        //get all rows
        Iterator iterator = sheet.iterator();

        while (iterator.hasNext()) {

            //return row

            XSSFRow row = (XSSFRow) iterator.next();

            Iterator celliterator = row.cellIterator();

            while (celliterator.hasNext()) {

                XSSFCell cell = (XSSFCell) celliterator.next();
                System.out.printf("%s\t", cell);
                System.out.print("|");
            }
            System.out.println("");
        }}}





//1st  amra row gula k iterator korlam

//then iterator korbo cell guli k

//line 25 teke 28 loop diye amra sodo row te dokte parbo cell e dokte parbo na

