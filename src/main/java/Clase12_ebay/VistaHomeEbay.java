package Clase12_ebay;

import java.util.NoSuchElementException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;
import org.openqa.selenium.support.ui.Select;

public class VistaHomeEbay {

	WebDriver driver;
	public VistaHomeEbay (WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(new AjaxElementLocatorFactory(driver, 10) , this);
	}
	
	@FindBy(id = "gh-cat")
	WebElement listaDesplegable;
	
	public boolean seleccionarPorPosicion(int posicion) {
		try {
			Select seleccion = new Select(listaDesplegable);
			seleccion.deselectByIndex(posicion);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
	
	public boolean seleccionarPorNombre(String nombre) {
		try {
			Select seleccion = new Select(listaDesplegable);
			seleccion.deselectByVisibleText(nombre);
			return true;
		} catch (Exception e) {
			return false;
		}
		
	}
}

