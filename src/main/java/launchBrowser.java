import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class launchBrowser {

	public static void main(String[] args) {
		ChromeOptions co=new ChromeOptions();
		co.setBrowserVersion("116");
		WebDriver driver=new ChromeDriver(co);
		driver.get("https://www.google.com/");
		driver.findElement(By.name("q")).sendKeys("naveen automation labs");
		System.out.println(driver.getTitle());

	}

}
