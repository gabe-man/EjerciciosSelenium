package ejerciciosSelenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

class Ejercicio4 {

	ChromeDriver driver;
	
	@BeforeEach
	void inicio() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	}
	
	@Test
	void CalculadoraTest() {
		
		try {
			driver.get("https://testsheepnz.github.io/BasicCalculator.html");
			
			Thread.sleep(3000);
			
			WebElement n1 = driver.findElement(By.id("number1Field"));
			
			WebElement n2 = driver.findElement(By.id("number2Field"));
			
			WebElement calc = driver.findElement(By.id("calculateButton"));
			
			Select select = new Select(driver.findElement(By.id("selectOperationDropdown")));
			
			Thread.sleep(3000);
			
			n1.sendKeys("2");
			
			Thread.sleep(3000);
			
			n2.sendKeys("3");
			
			Thread.sleep(3000);
			
			select.selectByIndex(0);
			
			Thread.sleep(3000);
			
			calc.click();
			
			Thread.sleep(9000);
			
			assertEquals("5", driver.findElement(By.id("numberAnswerField")));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
}
