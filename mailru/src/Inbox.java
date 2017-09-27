package mailru;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Inbox {

	private WebDriver driver;

	public Inbox() {
		super();
	}

	public Inbox(WebDriver driver) {
		super();
		this.driver = driver;
	}
	
	public WriteMessage newMessage(){
		
		WebElement write = driver.findElement(By.xpath("//*/div/div/div[2]/div/a/span"));
		write.click();
		
		return new WriteMessage();
	}

}
