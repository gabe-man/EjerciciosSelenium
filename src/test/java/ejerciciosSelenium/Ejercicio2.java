package ejerciciosSelenium;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ejercicio2 {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		ChromeDriver driver= new ChromeDriver();
		
		try {
			driver.get("https://www.odoo.com/es_ES");
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[1]/header/div/div/a[2]")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div[1]/div[1]/div[1]/label[1]/div")).click();
			Thread.sleep(3000);
			driver.findElement(By.xpath("/html/body/div[1]/main/div/div[2]/div/div[1]/div[2]/div/div/button")).click();
			Thread.sleep(3000);
			driver.findElement(By.id("username")).sendKeys("Gabriel Morales Martínez");
			Thread.sleep(3000);
			driver.findElement(By.id("email")).sendKeys("a_gabriel.morales.martinez@iespablopicasso.es");
			Thread.sleep(3000);
			Select pais = new Select(driver.findElement(By.id("country-id")));
			pais.selectByValue("España");
			Thread.sleep(3000);
			Select idioma = new Select(driver.findElement(By.name("lang")));
			idioma.selectByValue("Español");
			Thread.sleep(3000);
			Select empleados = new Select(driver.findElement(By.name("company_size")));
			empleados.selectByIndex(0);
			Thread.sleep(3000);
			Select interes = new Select(driver.findElement(By.name("plan")));
			interes.selectByIndex(2);
			Thread.sleep(6000);
			driver.findElement(By.xpath("//*[@id=\"wrapwrap\"]/main/div/div[2]/div/div[2]/div/div[1]/div/div[2]/form/div[8]/div[2]/button")).click();
			Thread.sleep(3000);
		} catch (Exception e) {
			
		}
	}

}
