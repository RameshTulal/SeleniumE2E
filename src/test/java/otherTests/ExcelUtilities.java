package otherTests;

import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelUtilities {	
	static XSSFWorkbook wb;
	static XSSFSheet ws;
	
	public ExcelUtilities(String excelPath, String sheetName) {
		try {
			wb = new XSSFWorkbook(excelPath);
			ws = wb.getSheet(sheetName);
		}catch(Exception ex) {
			ex.printStackTrace();
		}
	}

	public static void main(String[] args) {		
		GetRowCount();
		GetExcelCellData(1,2);
	}
	
	public static int GetColumnCount() {
		int op;
		op = ws.getRow(1).getPhysicalNumberOfCells();	
		return op;
	}
	
	public static int GetRowCount() {
		int op;
		op = ws.getPhysicalNumberOfRows();	
		return op;
	}	
	
	public static String GetExcelCellData(int rowNum, int colNum) {				
			String celldata = ws.getRow(rowNum).getCell(colNum).getStringCellValue();
			return celldata;			
		
	}


}
