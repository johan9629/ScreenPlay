## Author: Johan Gonzalez
  # Johan.Gonzalez@sqasa.co
#language: es

Característica: Yo como usuario,
  necesito realizar una compra del libro Android Quick Start Guide
  Y en la cantidad serán 2, se debe llenar el formulario y validar la cantidad total del libro
  Para verificar la cantidad y precio de la compra por hacer

  Escenario: compra de libro exitoso
    Dado que el usuario verifica la conexion a internet
    Cuando se compren dos libros de Android Quick Start Guide
    Entonces se verificara la cantidad y el precio
