package com.vtiger.contact;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.vtiger.genericutility.BaseClass;
import com.vtiger.genericutility.FileUtility;
import com.vtiger.objectrepository.HomePage;

public class TC_VT_001_TEST  extends BaseClass{
	 
	@Test
public void ClickOnContacts() throws EncryptedDocumentException, IOException {
		hp=new HomePage(driver);
		hp.getContactlink().click();
		String actTitle = driver.getTitle();
		String expTitle = eutil.getStringDataFromeExcel1("contact",1, 0);
		Assert.assertEquals(actTitle,expTitle,"contacts page is not displayed");
		test.log(Status.PASS,"contact page is displayed");
		
		
	
	}

}
