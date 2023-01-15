package Manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
//import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Login extends Parameters {

	@Test(priority = 1)
	public void LoginAsManager() throws InterruptedException {
		driver.get(HomePage);
		Thread.sleep(2000);
		WebElement ManagerLoginButton = driver
				.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/div[2]/button"));
		ManagerLoginButton.click();

		WebElement AddCustomerAsmanager = driver
				.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[1]"));
		AddCustomerAsmanager.click();

		String[] myListOfFirstName = { "Ahmad", "Ali", "Marwa", "Salma", };

		int randomOne = (int) (Math.random() * myListOfFirstName.length - 1);

		WebElement FirstName = driver
				.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[1]/input"));
		FirstName.sendKeys(myListOfFirstName[randomOne]);

		String[] myListOfLastName = { "Omar", "Mahmoud", "Yousef", "Adam", };
		Thread.sleep(2000);

		int randomTwo = (int) (Math.random() * myListOfLastName.length - 1);
		WebElement LastName = driver
				.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[2]/input"));
		LastName.sendKeys(myListOfLastName[randomTwo]);
		Thread.sleep(2000);
		
		int PostalCodeRandomNumber = (int) (Math.random() * 10000);
		String PostalCodeString = Integer.toString(PostalCodeRandomNumber);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/div[3]/input"))
				.sendKeys(PostalCodeString);
		Thread.sleep(2000);

		WebElement AddCustmersuchAsManager = driver
				.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button"));
		AddCustmersuchAsManager.click();
		Thread.sleep(2000);

		driver.switchTo().alert().dismiss();
	}

	@Test(priority = 2)
	public void OpenAcountAsManager() throws InterruptedException {
		Thread.sleep(2000);
		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]\r\n")).click();
		Thread.sleep(2000);
		WebElement SelectCustomerNameforTheManager = driver.findElement(By.xpath("//*[@id=\"userSelect\"]"));

		Select ManagerSelect = new Select(SelectCustomerNameforTheManager);

		ManagerSelect.selectByVisibleText(TheManager);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"userSelect\"]/option[2]")).click();

		WebElement SelectcurrencyforTheManager = driver.findElement(By.xpath("//*[@id=\"currency\"]"));

		Select currencySelect = new Select(SelectcurrencyforTheManager);

		currencySelect.selectByVisibleText(Currency);
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"currency\"]/option[2]")).click();

		WebElement Process = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/form/button"));
		Process.click();
		Thread.sleep(2000);

		driver.switchTo().alert().dismiss();

	}

	@Test(priority = 3)
	public void CustomersAsManager() throws InterruptedException {
		Thread.sleep(2000);

		driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[3]")).click();

		WebElement Search = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/form/div/div/input"));
		Search.sendKeys(SearchForCustomer);
		Thread.sleep(2000);

		WebElement DeleteTheCustomer = driver
				.findElement(By.xpath("/html/body/div/div/div[2]/div/div[2]/div/div/table/tbody/tr/td[5]/button"));
		DeleteTheCustomer.click();

	}

	@Test(priority = 4)
	public void CheckDeletion() throws InterruptedException {
		//Check if the Name was deleted
		Thread.sleep(2000);
		WebElement CheckoutTheDeletion = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]"));
		CheckoutTheDeletion.click();
		Thread.sleep(2000);

		driver.findElement(By.xpath("//*[@id=\"userSelect\"]")).click();
		Thread.sleep(2000);
	}

	@Test(priority = 5)
	public void CheckTheAddName() throws InterruptedException {
		// Check if the Name i Added Found
		Thread.sleep(2000);
		WebElement CheckoutTheAdd = driver.findElement(By.xpath("/html/body/div/div/div[2]/div/div[1]/button[2]"));
		CheckoutTheAdd.click();
		WebElement TheNewAddName= driver.findElement(By.xpath("//*[@id=\"userSelect\"]/option[6]"));
		TheNewAddName.click();
		}
}