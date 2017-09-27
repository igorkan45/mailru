package mailru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Main {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:/Chromedriver.exe");
		WebDriver driver = new ChromeDriver();

		driver.get("http://www.mail.ru");

		Homepage homepage = new Homepage(driver);
		homepage.login();

		try {
			Thread.sleep(10000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		Inbox inbox = new Inbox(driver);
		inbox.newMessage();

		WriteMessage writeMessage = new WriteMessage(driver);
		writeMessage.writeMessage();

	}

}
