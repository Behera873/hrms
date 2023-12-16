package project_HRMS;

import java.io.FileInputStream;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Exp_Excel {

	public static void main(String[] args) throws BiffException, IOException {
		FileInputStream file = new FileInputStream("C:\\Exp_Excel\\Book2.xls");
		Workbook  wb = Workbook.getWorkbook(file);
		Sheet  st = wb.getSheet(0);
		int row = 1;
		String Worldcup = st.getCell(0,row).getContents();
		String T20 = st.getCell(1,row).getContents();
		String Odi = st.getCell(2,row).getContents();
		String no = st.getCell(3,row).getContents();
		System.out.println(Worldcup+"||"+T20+"||"+Odi+"||"+no);
	}

}
