package login;

import static org.junit.Assert.assertEquals;

import org.openqa.selenium.WebElement;

public class Testing extends BaseClass {
	public static void main(String[] args)
browserLaunch("");
	FaceBookHomePage f= new FaceBookHomePage();
	WebElement textUsername = f.getUsername();
	textUsername.sendKeys("Jan");
	driver.navigate().refresh();
	textUsername.sendKeys("Jan");
	WebElement textPassword = f.getPassword();
	textPassword.sendKeys("1234");
	WebElement login = f.getLogin();
	login.click();
	
}
