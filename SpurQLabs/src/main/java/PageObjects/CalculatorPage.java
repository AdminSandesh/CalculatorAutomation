package PageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CalculatorPage {

	public WebDriver driver;
	
	By one = By.xpath("//tbody/tr[2]/td[2]/div[1]/div[3]/span[1]");
	By two = By.xpath("//span[contains(text(),'2')]");
	By three = By.xpath("//span[contains(text(),'3')]");
	By four = By.xpath("//span[contains(text(),'4')]");
	By five = By.xpath("//span[contains(text(),'5')]");
	By six = By.xpath("//span[contains(text(),'6')]");
	By seven = By.xpath("//span[contains(text(),'7')]");
	By eight = By.xpath("//span[contains(text(),'8')]");	
	By nine = By.xpath("//span[contains(text(),'9')]");
	By zero = By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[1]");
	By result = By.xpath("//div[@id='sciOutPut']");
	
	By addition = By.xpath("//tbody/tr[2]/td[2]/div[1]/div[1]/span[4]");	
	By substration = By.xpath("//span[contains(text(),'–')]");
	By multiplication = By.xpath("//span[contains(text(),'×')]");
	By division = By.xpath("//tbody/tr[2]/td[2]/div[1]/div[4]/span[4]");
	
	By equal = By.xpath("//span[contains(text(),'=')]");

	public CalculatorPage(WebDriver driver) {
		// TODO Auto-generated constructor stub
		this.driver=driver;
	}


	public WebElement getOne() {
		return driver.findElement(one);
	}

	public WebElement getTwo() {
		return driver.findElement(two);
	}

	public WebElement getThree() {
		return driver.findElement(three);
	}

	public WebElement getFour() {
		return driver.findElement(four);
	}

	public WebElement getFive() {
		return driver.findElement(five);
	}

	public WebElement getSix() {
		return driver.findElement(six);
	}

	public WebElement getSeven() {
		return driver.findElement(seven);
	}

	public WebElement getEight() {
		return driver.findElement(eight);
	}

	public WebElement getNine() {
		return driver.findElement(nine);
	}

	public WebElement getZero() {
		return driver.findElement(zero);
	}

	public WebElement getAddition() {
		return driver.findElement(addition);
	}

	public WebElement getSubstration() {
		return driver.findElement(substration);
	}

	public WebElement getMultiplication() {
		return driver.findElement(multiplication);
	}

	public WebElement getDivision() {
		return driver.findElement(division);
	}

	public WebElement getEqual() {
		return driver.findElement(equal);
	}
	
	public WebElement getResult() {
		return driver.findElement(result);
	}

	
	

}
