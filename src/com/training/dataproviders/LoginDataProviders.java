package com.training.dataproviders;

import java.util.List;

import org.testng.annotations.DataProvider;

import com.training.bean.LoginBean;
import com.training.dao.ELearningDAO;
import com.training.readexcel.ApachePOIExcelRead;
import com.training.readexcel.ReadExcel;

public class LoginDataProviders {

	@DataProvider(name = "db-inputs")
	public Object[][] getDBData() {

		List<LoginBean> list = new ELearningDAO().getLogins();

		Object[][] result = new Object[list.size()][];
		int count = 0;
		for (LoginBean temp : list) {
			// Object[] obj = new Object[2];
			// obj[0] = temp.getUserName();
			// obj[1] = temp.getPassword();
			Object[] obj = new Object[12];
			obj[0] = temp.getFirstName();
			obj[1] = temp.getLastName();
			obj[2] = temp.geteMail();
			obj[3] = temp.gettelePhone();
			obj[4] = temp.getaddress1();
			obj[5] = temp.getaddress2();
			obj[6] = temp.getcity();
			obj[7] = temp.getpostalCode();
			obj[8] = temp.getcountry();
			obj[9] = temp.getstate();
			obj[10] = temp.getpassword();
			obj[11] = temp.getconfirmpassword();

			result[count++] = obj;
		}

		return result;
	}

	@DataProvider(name = "excel-inputs")
	public Object[][] getExcelData() {
		// String fileName ="C:/Users/Naveen/Desktop/Testing.xlsx";
		String fileName = "C:/Re-Skill/Selenium/Testdata.xlsx";
		return new ApachePOIExcelRead().getExcelContent(fileName);
	}

	@DataProvider(name = "xls-inputs")
	public Object[][] getXLSData() {
		// ensure you will have the title as first line in the file
		// return new ReadExcel().getExcelData("C:/Users/Naveen/Desktop/Testing.xls",
		// "Sheet1");
		return new ReadExcel().getExcelData("C:/Re-Skill/Selenium/Testdata.xlsx", "Sheet1");
	}
}
