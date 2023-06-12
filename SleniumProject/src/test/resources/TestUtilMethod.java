 
package TestUtilMethod;
import java.util.ArrayList;

public class TestUtilMethod {

	static Xls_Reader reader;
	
	
	
	
	public static ArralyList<Object[]> getDataFromExcel()
	{

	ArrayList<Object[]> testData=new ArrayList<Object[]>();
	
			reader=new Xls_Reader(System.getProperty("/Users/somashekarr/eclipse-workspace/SeleniumMorningSession/testsdata/Book1.xlsx"));

	for(int rowValue=2; rowValue<=reader.getRowCount("testdatasheet");rowValue++)
	{
		String userName=reader.getCellData("testdatasheet","username",rowValue);
		String userName=reader.getCellData("testdatasheet","passWord",rowValue);
		
		Object obj[]= {userName,userName};
		testData.add(obj);
		
	}
	retun testData;
	
	
	
	}
	

}
