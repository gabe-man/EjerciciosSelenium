package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByName;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ejercicio1 {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver = new ChromeDriver();
		
		try {
			driver.get("https://www.wikipedia.org");
			Thread.sleep(3000);
			driver.findElement(By.id("searchInput")).sendKeys("Java\n");
			Thread.sleep(3000);
			System.out.println(driver.getTitle());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
