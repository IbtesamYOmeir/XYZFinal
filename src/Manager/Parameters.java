package Manager;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameters {
	WebDriver driver = new ChromeDriver() ; 

	String HomePage = "https://www.globalsqa.com/angularJs-protractor/BankingProject/#/login";
	String TheManager = "Hermoine Granger" ;
	String Currency = "Dollar";
	String SearchForCustomer="Hermoine";


	@BeforeTest
	public void setup() {
		driver.get(HomePage);

		WebDriverManager.chromedriver().setup();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3)); 

}
}
