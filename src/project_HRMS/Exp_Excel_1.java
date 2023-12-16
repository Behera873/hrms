package project_HRMS;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Exp_Excel_1 {

	public static void main(String[] args) throws IOException, BiffException {
		FileInputStream file = new FileInputStream("C:\\Exp_Excel\\Book1.xls");
		Workbook wb = Workbook.getWorkbook(file);
		Sheet st = wb.getSheet(0);
		int rowcount = st.getRows();
		System.out.println(rowcount);
		for(int i=1;i<rowcount;i++) {
			String SL_No = st.getCell(0,i).getContents();
			String Players = st.getCell(1,i).getContents();
			String Betsman = st.getCell(2,i).getContents();
			String StrikeRat = st.getCell(3,i).getContents();
			System.out.println(SL_No+"||"+Players+"||"+Betsman+"||"+StrikeRat);
		}
	}

}
