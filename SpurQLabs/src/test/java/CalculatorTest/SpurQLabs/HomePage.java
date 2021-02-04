package CalculatorTest.SpurQLabs;
import java.io.IOException;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import PageObjects.CalculatorPage;
import Resources.App;



// 1. You can change the value/data or operation from Data.properties file in order 
// to test with different data values or operations.

// 2. You can also set browser in order to check your script in different browser. 
// Currently it only supports Chrome and Firefox browsers.


public class HomePage extends App{

	@BeforeTest

	public void initilizeProcess() throws IOException
	{
		driver = initializeDriver();
	}

	@Test
	
	public void calculatorPageNavigation()
	{		
		// Fetching url from data file
		driver.get(prop.getProperty("url"));

		CalculatorPage calc = new CalculatorPage(driver);
		
		
		// Creating variables to validate assertion
		String ValidOperations = "+ - * /";
		String ValidNumbers = "0 to 9";
		
		// Fetching first number from data file
		String firstNumber = prop.getProperty("firstNumber");
		
		for(int i=0; i<firstNumber.length(); i++)
		{
			char c = firstNumber.charAt(i);
			
			// Casting into integer to check the if conditions
			int first = Character.getNumericValue(c);
			if(first == 1)
				{
				calc.getOne().click();
				}
			else if(first == 2)
				{
					calc.getTwo().click();
				}
				else if(first == 3)
				{
					calc.getThree().click();
				}
				else if(first == 4)
				{
					calc.getFour().click();
				}
				else if(first == 5)
				{
					calc.getFive().click();
				}
				else if(first == 6)
				{
					calc.getSix().click();
				}
				else if(first == 7)
				{
					calc.getSeven().click();
				}
				else if(first == 8)
				{
					calc.getEight().click();
				}
				else if(first == 9)
				{
					calc.getNine().click();
				}
				else if(first == 0)
				{
					calc.getZero().click();
				}
				else {
					System.out.println("Not a valid number!");
					Assert.assertEquals(c,ValidNumbers);
				}
		}
		
		// fetching operation from data file
		String operation = prop.getProperty("operation");
		
		if(operation.equals("+"))
		{
		calc.getAddition().click();
		}
		else if(operation.equals("-"))
		{
			calc.getSubstration().click();
		}
		else if(operation.equals("*"))
		{
			calc.getMultiplication().click();
		}
		else if(operation.equals("/"))
		{
			calc.getDivision().click();
		}
		else
		{
			System.out.println("Not a valid opration!");
			Assert.assertEquals(operation,ValidOperations);
		}
		
		// Fetching second number from data file
		String secondNumber = prop.getProperty("secondNumber");
		
		for(int i=0; i<secondNumber.length(); i++)
		{
			char c = secondNumber.charAt(i);
			
			// Casting into integer to check the if conditions
			int second = Character.getNumericValue(c);
			if(second == 1)
				{
				calc.getOne().click();
				}
			else if(second == 2)
				{
					calc.getTwo().click();
				}
				else if(second == 3)
				{
					calc.getThree().click();
				}
				else if(second == 4)
				{
					calc.getFour().click();
				}
				else if(second == 5)
				{
					calc.getFive().click();
				}
				else if(second == 6)
				{
					calc.getSix().click();
				}
				else if(second == 7)
				{
					calc.getSeven().click();
				}
				else if(second == 8)
				{
					calc.getEight().click();
				}
				else if(second == 9)
				{
					calc.getNine().click();
				}
				else if(second == 0)
				{
					calc.getZero().click();
				}
				else {
					
					System.out.println("Not a valid number!");
					Assert.assertEquals(c,ValidNumbers);
				}
		}	
	    
	}
	
	@Test
	public void testAssertFunctions()
	{	
		// Getting result from calculator to compare with the result of below mentioned
		// method. Both result should be same if calculator functionality works as expected. 
		CalculatorPage calc = new CalculatorPage(driver);
		String str = calc.getResult().getText();
		float calcResult = Float.parseFloat(str);
		
		String firstNumber = prop.getProperty("firstNumber");
		float first = Float.parseFloat(firstNumber);
		
		String secondNumber = prop.getProperty("secondNumber");
		float second = Float.parseFloat(secondNumber);
		
		String operation = prop.getProperty("operation");
		float methodResult = 0;
		
		if(operation.equals("+"))
		{
			 methodResult = first + second;
		}
		else if(operation.equals("-"))
		{
			methodResult = first - second;
		}
		else if(operation.equals("*"))
		{
			 methodResult = first * second;
		}
		else if(operation.equals("/"))
		{
			 methodResult = first / second;
		}
		
		System.out.println("Calculator Genrated Result: "+first+" "+operation+" "+second+" = "+calcResult);
		System.out.println("Method Genrated Result: "+first+" "+operation+" "+second+" = "+methodResult);
		Assert.assertEquals(calcResult,methodResult);
		
	}

	@AfterTest
	public void getClosed()
	{
		driver.close();
	}
	
}
