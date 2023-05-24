package pageObjectModel;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import keyWordDrivernPackage.Flib;

public class InValidLoginTestData extends BaseTest {

	public static void main(String[] args) throws EncryptedDocumentException, IOException, InterruptedException {
		
		BaseTest bt = new BaseTest();
		bt.setUp();
		
		LoginPage lp = new LoginPage(driver);
		Thread.sleep(2000);
		HomePage hp = new HomePage(driver);
		
		
		Flib flib = new Flib();
		int rc = flib.rowCount(EXCEL_PATH,"Invalidcreds");
		for(int i=1;i<rc;i++)
		{
		String invalidusername = flib.readExcelData(EXCEL_PATH,"Invalidcreds",i, 0);
	    String invalidpassword = flib.readExcelData(EXCEL_PATH,"Invalidcreds",i, 1);;
		lp.inValidLogin(invalidusername, invalidpassword);
		
		}

	}

}
