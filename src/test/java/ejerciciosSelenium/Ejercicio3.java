package ejerciciosSelenium;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

class Ejercicio3 {
	private ChromeDriver driver;
	
	@BeforeEach
	void inicio() {
		WebDriverManager.chromedriver().setup();
		
		driver = new ChromeDriver();
	}

	@Test
	void PabloPicassoTest() {
		try {
			driver.get("https://www.wikipedia.org");
			Thread.sleep(3000);
			driver.findElement(By.id("searchInput")).sendKeys("Pablo Picasso\n");
			Thread.sleep(3000);
			assertEquals("https://upload.wikimedia.org/wikipedia/commons/thumb/9/98/Pablo_picasso_1.jpg/200px-Pablo_picasso_1.jpg", driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[5]/div[1]/table/tbody/tr[2]/td/a/img")).getAttribute("src"));
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	
	@Test
	void IESPicassoTest() {
		try {
			driver.get("https://www.wikipedia.org");
			Thread.sleep(3000);
			driver.findElement(By.id("searchInput")).sendKeys("IES Pablo Picasso\n");
			Thread.sleep(3000);
			assertEquals("Resultados de la búsqueda", driver.findElement(By.id("firstHeading")).getText());
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
