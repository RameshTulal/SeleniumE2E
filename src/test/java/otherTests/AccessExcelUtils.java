package otherTests;

public class AccessExcelUtils {

	static String ProjectPath = System.getProperty("user.dir");
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String excelPath = ProjectPath+"/ExcelFiles/TestData.xlsx";
		ExcelUtilities excelObj = new ExcelUtilities(excelPath, "Sheet1");
		ExcelUtilities.GetRowCount();
		ExcelUtilities.GetColumnCount();
		ExcelUtilities.GetExcelCellData(1, 1);
	}

}
