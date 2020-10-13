package otherTests;

public class ExcelDataProvider {
	static String ProjectPath = System.getProperty("user.dir");
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String excelPath = ProjectPath+"/ExcelFiles/TestData.xlsx";
		testData(excelPath, "Sheet1");		
	}
		
	public static void testData(String excelPath, String sheetName) {
		ExcelUtilities testdataObj = new ExcelUtilities(excelPath, sheetName);
		int rc = testdataObj.GetRowCount();
		int cc = testdataObj.GetColumnCount();
		System.out.println("Total No.of Rows"+ rc);
		System.out.println("Total No.of Columns"+ cc);
		
		for(int i=1;i<rc; i++)
		{
			for(int j=0;j<cc;j++) {
				String op = testdataObj.GetExcelCellData(i, j);
				System.out.println(op);
			}
		}
		
	}

}
