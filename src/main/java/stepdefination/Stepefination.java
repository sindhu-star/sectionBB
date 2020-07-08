package stepdefination;



import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import pom.Skipsign;
import pom.registration;


public class Stepefination {
	WebDriver driver;  
	@Given ("^user on home page$")
public void urllaunch(){
		 System.setProperty("webdriver.chrome.driver","C:\\Users\\jeeva\\Desktop\\seleniumjar\\chromedriver.exe");
			driver=new ChromeDriver();
		driver.get("http://demo.automationtesting.in");
	     driver.manage().window().maximize();}
	
	@Then("^click on Skiplogin button$")
	public void skiplogin(){
		//driver.findElement(By.id("btn2")).click();
		Skipsign obj=new Skipsign(driver);
		obj.clickskignin();
	
	}
	@Then ("^Registration page is displayed and validate title$")
		public void titleverification(){
		System.out.println(driver.getTitle());
		}
	@Then("enter the firstname as \"(.*)\" and the lastname as \"(.*)\"$")
	public void Entername(String Firstname, String Lastname){
		//driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys(Firstname);
		//driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys(Lastname);
		registration obj1=new registration(driver);
		obj1.Fname(Firstname);
		obj1.Lname(Lastname);
	}
	@Then ("enter the address as \"(.*)\" and the email as \"(.*)\"$")
	public void address(String Address,String email){
		//driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys(Address);
		//driver.findElement(By.xpath("//input[@ng-model='EmailAdress']")).sendKeys(email);
		registration obj1=new registration(driver);
		obj1.address(Address);
		obj1.email(email);
	}
	@Then ("enter the phonenumber as \"(.*)\"$")
	public void phonenumber(String Phone){
		//driver.findElement(By.xpath("//input[@type='tel']")).sendKeys(Phone);
		registration obj1=new registration(driver);
		obj1.phone(Phone);
	}
	@Then("click on the gender checkbox \"(.*)\"$")
	public void gender(String gender){
		//driver.findElement(By.xpath("//input[@value='"+gender+"']")).click();
		registration obj1=new registration(driver);
		obj1.gender(gender);
	}
	@Then ("click on the Hobbies checkbox \"(.*)\"$")
	public void hobby(String hobby){
		//driver.findElement(By.xpath("//input[@value='"+hobby+"']")).click();
		registration obj1=new registration(driver);
		obj1.hobby(hobby);
	}
	
	@Then ("select the language as \"(.*)\"$")
	public void language(String lang){
		driver.findElement(By.xpath("//div[@id='msdd']")).click();
		Select sel=new Select(driver.findElement(By.xpath("//div[@id='msdd']")));
		sel.selectByVisibleText(lang);
	}
	
	@Then ("select the Skill as \"(.*)\"$")
	public void skill(String skill){
		driver.findElement(By.xpath("//*[@id='Skills']")).click();
		Select sel=new Select(driver.findElement(By.xpath("/option[@value='"+skill+"']")));
		sel.selectByVisibleText(skill);
	}
	
    @Then("select the country dropdown as \"(.*)\"$")
    public void country(String country){
    	Select Countrydrp = new Select(driver.findElement(By.id("countries")));
    	Countrydrp.selectByValue("India");
    }
    @Then("enter the password as \"(.*)\" and confirm password as \"(.*)\"$")
    public void password(String password,String Cpassword){
    	driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
    	driver.findElement(By.id("secondpassword")).sendKeys(Cpassword);	
    }
    @Then("^click on submitbutton$")
    public void submit(){
    	driver.findElement(By.id("submitbtn")).click();
    }
    
}
	


