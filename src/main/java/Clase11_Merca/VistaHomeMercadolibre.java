package Clase11_Merca;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class VistaHomeMercadolibre {
	WebDriver driver;
	public VistaHomeMercadolibre (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10) , this);
	}
	@FindBy(name = "as_word")
	WebElement cajaTextoBusqueda;
	
	public void setTextAndLookFor (String text) {
		cajaTextoBusqueda.sendKeys(text);
		cajaTextoBusqueda.submit();
	}

}
