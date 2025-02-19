package com.vtiger.contact;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.vtiger.genericutility.BaseClass;
import com.vtiger.objectrepository.ContactPage;
import com.vtiger.objectrepository.CreateContactPage;
import com.vtiger.objectrepository.HomePage;

public class TC_VT_002_TEST extends BaseClass {
	
	@Test
	public void Creatcontact() throws EncryptedDocumentException, IOException {
		hp=new HomePage(driver);
		hp.getContactlink().click();
		
		ContactPage cp=new ContactPage(driver);
		cp.getAddbuttonlink().click();
		
		
		CreateContactPage ccp=new CreateContactPage(driver);
		ccp.getLastnametextfield().sendKeys(eutil.getStringDataFromeExcel1("contact", 1, 1));
		ccp.getSavebutton().click();
		
		
	}

}
