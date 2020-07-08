package pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Skipsign {
	
		WebDriver driver;
		@FindBy(xpath="//button[@id='btn2']")
		WebElement skipsign;
		public Skipsign(WebDriver driver){
			this.driver=driver;
			PageFactory.initElements(driver, this);}
	public void clickskignin(){
		skipsign.click();
	}
}
