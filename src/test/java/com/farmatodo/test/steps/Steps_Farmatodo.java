package com.farmatodo.test.steps;

import com.farmatodo.test.pageobject.Page_Object_Farmatodo;

import net.thucydides.core.annotations.Step;

public class Steps_Farmatodo {

Page_Object_Farmatodo caso;

@Step

public void click_iniciar_sesion() {
	caso.click_iniciar_sesion();	
}

@Step
public void click_en_registrate_aqui() {
	caso.click_en_registrate_aqui();
	
}

public void campo_Nombre(String nombre) {
	caso.campo_Nombre(nombre);
}

public void campo_Apellido(String apellido) {
	caso.campo_Apellido(apellido);
}

public void Correo_Electronico(String correoelectronico) {
	caso.Correo_Electronico(correoelectronico);
	
}

public void campo_Contraseña(String contrasena) {
	caso.campo_Contraseña(contrasena);
	
}

public void Confirmar_contraseña(String confirmecontrasena) {
	caso.Confirmar_contraseña(confirmecontrasena);
}

public void Numero_de_documento(String numerodedocumento) {
	caso.Numero_de_documento(numerodedocumento);
	
}

public void Numero_de_telefono(String numerodetelefono) {
	caso.Numero_de_telefono(numerodetelefono);
	
}

public void seleccionar_sexo() {
	caso.seleccionar_sexo();
	
}

public void registro_exitoso() {
   caso.registro_exitoso();
}

public void mensaje_de_cedula() {
	caso.mensaje_de_cedula();
	
}

public void mensaje_de_numero_de_telefono() {
	caso.mensaje_de_numero_de_telefono();
	
}

}
