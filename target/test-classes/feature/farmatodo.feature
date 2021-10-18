#Author: David Gutierrez
#Keywords Summary :Farmatodo
#Scenario: Automatizacion Farmatodo
@tag
Feature: Automatizacion Farmatodo
  I want to use this template for my feature file

  @tag1
  Scenario Outline: Registro exitoso
    Given Ingresar a la pagina
    When Dar click en inicia sesion
    And Dar click en registrate aqui
    And Diligenciar campo Nombre <nombre>
    And Diligenciar campo Apellido <apellido>
    And Diligenciar campo Correo Electronico <correoelectronico>
    And Diligenciar campo Contraseña <contrasena>
    And Diligenciar campo Confirmar contraseña <confirmecontrasena>
    And Diligenciar campo Numero de documento <numerodedocumento>
    And Diligenciar campo Numero de telefono <numerodetelefono>
    And Seleccionar sexo
    Then Validar el registro exitoso

    Examples: 
      | nombre  | apellido    | correoelectronico        | contrasena    | confirmecontrasena | numerodedocumento | numerodetelefono |
      | "David" | "Gutierrez" | "Dashgual1992@gmail.com" | "Bogota2021*" | "Bogota2021*"      | "1032453749"      | "3057798223"     |

@tag2
  Scenario Outline: Registro incorrcto cedula 
    Given Ingresar a la pagina
    When Dar click en inicia sesion
    And Dar click en registrate aqui
    And Diligenciar campo Nombre <nombre>
    And Diligenciar campo Apellido <apellido>
    And Diligenciar campo Correo Electronico <correoelectronico>
    And Diligenciar campo Contraseña <contrasena>
    And Diligenciar campo Confirmar contraseña <confirmecontrasena>
    And Diligenciar campo Numero de documento <numerodedocumento>
    And Diligenciar campo Numero de telefono <numerodetelefono>
    And Seleccionar sexo
    Then Validar el mensaje de cedula

    Examples: 
      | nombre  | apellido    | correoelectronico        | contrasena    | confirmecontrasena | numerodedocumento | numerodetelefono |
      | "Esneider" | "Alvis" | "Dagu1992@hotmail.com"    | "Bogota2021*" | "Bogota2021*"      | "1032453749"      | "3057798226"     |
      
      @tag3
  Scenario Outline: Registro incorrecto numero de telefono
    Given Ingresar a la pagina
    When Dar click en inicia sesion
    And Dar click en registrate aqui
    And Diligenciar campo Nombre <nombre>
    And Diligenciar campo Apellido <apellido>
    And Diligenciar campo Correo Electronico <correoelectronico>
    And Diligenciar campo Contraseña <contrasena>
    And Diligenciar campo Confirmar contraseña <confirmecontrasena>
    And Diligenciar campo Numero de documento <numerodedocumento>
    And Diligenciar campo Numero de telefono <numerodetelefono>
    And Seleccionar sexo
    Then Validar el mensaje de numero de telefono

    Examples: 
      | nombre  | apellido    | correoelectronico                           | contrasena    | confirmecontrasena | numerodedocumento | numerodetelefono |
      | "Andres" | "Laiton"   |  "dsgutierreza@correo.udistrital.edu.co"    | "Bogota2021*" | "Bogota2021*"      | "26006906"        | "3057798223"     |

  

