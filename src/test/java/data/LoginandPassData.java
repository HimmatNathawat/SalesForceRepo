package data;

import Utilites.ExcelUtils;
import org.testng.annotations.DataProvider;

public class LoginandPassData {
    @DataProvider
    public Object[][] LoginData(){

        return ExcelUtils.readExcel("LoginData.xlsx","ValidData");
    }
}
