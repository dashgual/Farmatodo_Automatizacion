package com.farmatodo.test.definitions;

import com.farmatodo.test.steps.Steps_Farmatodo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import net.thucydides.core.annotations.Steps;

public class Definitions_Farmatodo {

	@Steps
	Steps_Farmatodo pasos;
	
	@Given("^Ingresar a la pagina$")
	public void ingresar_a_la_pagina() {
	
	}

	@When("^Dar click en inicia sesion$")
	public void dar_click_en_inicia_sesion() {
	 pasos.click_iniciar_sesion(); 
	}

	@When("^Dar click en registrate aqui$")
	public void dar_click_en_registrate_aqui() {
	pasos.click_en_registrate_aqui();
	}

	@When("^Diligenciar campo Nombre \"([^\"]*)\"$")
	public void diligenciar_campo_Nombre(String nombre) {
	pasos.campo_Nombre(nombre);
	  
	}

	@When("^Diligenciar campo Apellido \"([^\"]*)\"$")
	public void diligenciar_campo_Apellido(String apellido) {
	pasos.campo_Apellido(apellido);
	
	}

	@When("^Diligenciar campo Correo Electronico \"([^\"]*)\"$")
	public void diligenciar_campo_Correo_Electronico(String correoelectronico) {
	 pasos.Correo_Electronico(correoelectronico);
	}

	@When("^Diligenciar campo Contraseña \"([^\"]*)\"$")
	public void diligenciar_campo_Contraseña(String contrasena) {
	pasos.campo_Contraseña(contrasena);
	}

	@When("^Diligenciar campo Confirmar contraseña \"([^\"]*)\"$")
	public void diligenciar_campo_Confirmar_contraseña(String confirmecontrasena) {
	pasos.Confirmar_contraseña(confirmecontrasena);
	   
	}

	@When("^Diligenciar campo Numero de documento \"([^\"]*)\"$")
	public void diligenciar_campo_Numero_de_documento(String numerodedocumento) {
	pasos.Numero_de_documento(numerodedocumento);
	}

	@When("^Diligenciar campo Numero de telefono \"([^\"]*)\"$")
	public void diligenciar_campo_Numero_de_telefono(String numerodetelefono) {
	pasos.Numero_de_telefono(numerodetelefono);
	}

	@When("^Seleccionar sexo$")
	public void seleccionar_sexo() {
    pasos.seleccionar_sexo();
	}

	@Then("^Validar el registro exitoso$")
	public void validar_el_registro_exitoso() {
	pasos.registro_exitoso();
	}
	
	@Then("^Validar el mensaje de cedula$")
	public void validar_el_mensaje_de_cedula() {
	pasos.mensaje_de_cedula(); 
	   
	}

	@Then("^Validar el mensaje de numero de telefono$")
	public void validar_el_mensaje_de_numero_de_telefono() {
	pasos.mensaje_de_numero_de_telefono();
	}


}
