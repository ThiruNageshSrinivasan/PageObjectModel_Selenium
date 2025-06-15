package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	WebDriver driver;

	// Constructor to initialize WebElements
	public LoginPage(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//input[@id='login-username']")
	WebElement username;
	@FindBy(xpath="//input[@id='login-password']")
	WebElement password;
	@FindBy(xpath="/html[1]/body[1]/div[3]/form[1]/fieldset[1]/input[1]")
	WebElement login;
	public WebElement getUsername() {
		return username;
	}
	public void setUsername(WebElement username) {
		this.username = username;
	}
	public WebElement getPassword() {
		return password;
	}
	public void setPassword(WebElement password) {
		this.password = password;
	}
	public WebElement getLogin() {
		return login;
	}
	public void setLogin(WebElement login) {
		this.login = login;
	}
	public void loginToApp(String string, String string2) {
		// TODO Auto-generated method stub
		
	}

	public void loginclick() {
		// TODO Auto-generated method stub
		login.click();
		
	}
	public void loginToApp1(String string, String string2) {
		// TODO Auto-generated method stub
		
	}
	
}
