package pom;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;


public class registration {
WebDriver driver;

	@FindBy(xpath="//input[@placeholder='First Name']")
	WebElement  Firstname;
	@FindBy(xpath="//input[@placeholder='Last Name']")
	WebElement  Lasttname;	
	@FindBy(xpath="//textarea[@ng-model='Adress']")
	WebElement  txtAddress;
	@FindBy(xpath="//input[@ng-model='EmailAdress']")
	WebElement emailaddress;
	@FindBy(xpath="//input[@type='tel']")
	WebElement phonenumber;
	@FindBy(xpath="//input[@value='FeMale']")
	WebElement gender;
	@FindBy(xpath="//input[@value='Cricket']")
	WebElement hobby;
	//@FindBy(xpath="//input[@value='Cricket']")
	//WebElement hobby;
	@FindBy(xpath="//input[@type='password']")
	WebElement password;
	@FindBy(id="secondpassword")
	WebElement cpassword;
	
	public registration(WebDriver driver){
		this.driver=driver;
		PageFactory.initElements(driver, this);}
 
	public void Fname(String Fname){
		Firstname.sendKeys(Fname);
		 }
	public void Lname(String Lname){
		Lasttname.sendKeys(Lname);
		}
	public void address(String Address){
		txtAddress.sendKeys(Address);
	}
	public void email(String email){
		emailaddress.sendKeys(email);
	}
	public void phone(String Phone){
		phonenumber.sendKeys(Phone);
		}
	public void gender(String gender){
		Select sel=new Select(driver.findElement(By.xpath("//input[@value='"+gender+"']")));
		sel.selectByVisibleText(gender);
	}
	public void hobby(String hobby){
		Select sel=new Select(driver.findElement(By.xpath("//input[@value='"+hobby+"']")));
		sel.selectByVisibleText(hobby);
	}
	}

