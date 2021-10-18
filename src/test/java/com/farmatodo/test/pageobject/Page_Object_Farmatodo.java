package com.farmatodo.test.pageobject;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import groovy.time.Duration;
import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;

@DefaultUrl("https://www.farmatodo.com.co/")
public class Page_Object_Farmatodo extends PageObject {

	String click_iniciar_sesion = "//app-navbar/header/div[1]/div[7]/div/div[1]";
	String click_en_registrate_aqui = "//section[3]/p[1]/a";
    String campo_Nombre = "//*[@id=\"sign-up-name\"]";
	String campo_Apellido = "//*[@id=\"sign-up-last-name\"]";
    String Correo_Electronico = "//*[@id=\"sign-up-email\"]";
    String campo_Contraseña = "//*[@id=\"sign-up-password\"]";
    String Confirmar_contraseña = "//*[@id=\"sign-up-confirm-password\"]";
    String Numero_de_documento = "//*[@id=\"sign-up-document-number\"]";
    String Numero_de_telefono = "//*[@id=\"sign-up-phone\"]";
    String seleccionar_sexo ="//*[@id=\"sign-up-male\"]";
    String registro_exitoso="//*[@id=\"sign-up-validate-customer\"]";
	String mensaje_de_cedula = "//article/form/app-error-message/section";
    String mensaje_de_numero_de_telefono ="//*[@id=\"sign-up-general-error-message\"]";

	public void espera(int segundos) {
		try {
			Thread.sleep(segundos * 1000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	// Caso1

	public void click_iniciar_sesion() {
		this.open();
		espera(3);
		find(By.xpath(click_iniciar_sesion)).click();
		
	}

	public void click_en_registrate_aqui() {
		espera(3);
		find(By.xpath(click_en_registrate_aqui)).click();
	}

	public void campo_Nombre(String nombre) {
		espera(3);
	find(By.xpath(campo_Nombre)).sendKeys(nombre);
}

	public void campo_Apellido(String apellido) {
		espera(3);
	find(By.xpath(campo_Apellido)).sendKeys(apellido);
	}

	public void Correo_Electronico(String correoelectronico) {
		espera(3);
		find(By.xpath(Correo_Electronico)).sendKeys(correoelectronico);
	}

	public void campo_Contraseña(String contrasena) {
		espera(3);
		find(By.xpath(campo_Contraseña)).sendKeys(contrasena);
	}

	public void Confirmar_contraseña(String confirmecontrasena) {
		espera(3);
		find(By.xpath(Confirmar_contraseña)).sendKeys(confirmecontrasena);
	}

	public void Numero_de_documento(String numerodedocumento) {
		espera(3);
		find(By.xpath(Numero_de_documento)).sendKeys(numerodedocumento);
	}

	public void Numero_de_telefono(String numerodetelefono) {
		espera(3);
		find(By.xpath(Numero_de_telefono)).sendKeys(numerodetelefono);
	}

	public void seleccionar_sexo() {
		espera(3);
		find(By.xpath(seleccionar_sexo)).click();
	}

	public void registro_exitoso() {
		find(By.xpath(registro_exitoso)).click();
		espera(10);
	}

	//Caso 2 
	public void mensaje_de_cedula() {
		find(By.xpath(registro_exitoso)).click();
		WebDriver driver = new ChromeDriver();
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("window.scrollBy(0,500)");
		String Text= getDriver().findElement(By.xpath(mensaje_de_cedula)).getText();
		System.out.println("Cedula ya existe" + Text);
		espera(10);
	}
	
     //caso3  
	public void mensaje_de_numero_de_telefono() {
		find(By.xpath(registro_exitoso)).click();
		String Text= getDriver().findElement(By.xpath(Numero_de_telefono)).getText();
		JavascriptExecutor js= (JavascriptExecutor)getDriver();
		js.executeScript("window.scrollBy(0,500)","");
		System.out.println("Numero de telefono ya esta registrado" + Text);
		espera(10);
	}

		
	}


