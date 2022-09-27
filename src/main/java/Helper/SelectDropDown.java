package Helper;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import BaseClass.BaseClass;

public class SelectDropDown extends BaseClass {

	public static Select sc;
	
	public static void selectByVisibleText(WebElement wb,String text) {
		
		sc=new Select(wb);
		sc.selectByVisibleText(text);
	}
}
