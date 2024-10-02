#Lenguage: es 
#Author: Estefania Nicolalde
@OPERACION-01

Característica:  Prueba Funcional Automatizada Skill Hacking Banistmo

COMO usuario de la plataforma Skill Hacking Banistmo
QUIERO verificar que el sistema administre la compra de cursos con:
El sistema deberá comprobar la compra de cursos y su correcta inserción en el carrito de compra
El sistema deberá comprobar la eliminación de cursos del carrito de compras
Verificar que el valor acancelar del carrito de compras
PARA certificar su correcto funcionamiento


Antecedentes:
Dado que el usuario realiza el ingreso al sistema

#SKILL-OPERACION-01-Verificar que el sistema permita agregar y eliminar cursos al carrito de compras, verificando que el valor a pagar no supere a 400
@01-SKILL-OPERACION-01
Esquema del escenario: Verificar que el sistema permita agregar y eliminar cursos al carrito de compras, verificando que el valor a pagar no supere a 400
Cuando se seleccionan los cursos <curso1> y <curso2>
Y se dirige a la seccion de carrito de compra
Y se elimina el curso <cursoEliminado>
Entonces se verifica que el valor del precio total sea menor a "400"

Ejemplos:

  | curso1                      |   curso2                       |cursoEliminado               |
  | "Android Quick Start Guide" | "Functional Programming in JS" | "Android Quick Start Guide" |

  #SKILL-OPERACION-01- Verificar que el sistema permita agregar y eliminar cursos al carrito de compras, verificando que el valor a pagar sea correcto
@02-SKILL-OPERACION-01
Esquema del escenario: Verificar que el sistema permita agregar y eliminar cursos al carrito de compras, verificando que el valor a pagar sea correcto
Cuando se seleccionan los cursos <curso1> y <curso2>
Y se dirige a la seccion de carrito de compra
Y se elimina el curso <cursoEliminado>
Entonces se verifica que el valor del precio total sea correcto

Ejemplos:

| curso1                      |   curso2                       |cursoEliminado               |
| "Android Quick Start Guide" | "Functional Programming in JS" | "Android Quick Start Guide" |