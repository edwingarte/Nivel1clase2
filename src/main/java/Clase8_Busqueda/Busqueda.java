package Clase8_Busqueda;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.ie.InternetExplorerOptions;

import com.sophos.capacitacion.Nivel1clase2.Driver;

public class Busqueda {
		Driver objDriver;
		WebDriver driver;
		public Busqueda() {
			
		}
		public void navegadorGoogle() {
			objDriver = new Driver();
			objDriver.navegadorGoogle();
			objDriver.navegarA("https://www.google.com");
			WebElement CajadeTexto = objDriver.getDriver().findElement(By.xpath("//*[@id=\"tsf\"]/div[2]/div[1]/div[1]/div/div[2]/input"));
			CajadeTexto.sendKeys("Sophos Chronus");
			CajadeTexto.submit();
			try {
				Thread.sleep(10000);
			} catch (Exception e) {
				
			}
			objDriver.cerrarN();
		}


}
