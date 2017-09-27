package mailru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Homepage {
	
	private final static String LOGIN = "tathtp";
	private final static String PASSWORD = "Klopik123";

	private WebDriver driver;

	public Homepage() {
		super();
	}

	public Homepage(WebDriver driver) {
		super();
		this.driver = driver;
	}

	public Inbox login() {
		
		WebElement login = driver.findElement(By.xpath("//*[@id='mailbox__login']"));
		login.click();
		login.sendKeys(LOGIN);

		WebElement psswd = driver.findElement(By.xpath("//*[@id='mailbox__password']"));
		psswd.click();
		psswd.sendKeys(PASSWORD);

		WebElement submit = driver.findElement(By.xpath("//*[@id='mailbox__auth__button']"));
		submit.click();
		
		return new Inbox();

	}

}
