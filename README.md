
# Ejercicio 1: Sistema de Registro de Usuarios y Cálculo de Estadísticas

# Objetivo:
Aplicar clases, controladores, uso de Scanner, condicionales, bibliotecas estándar, sobrecarga de métodos, estáticos, manejo de errores y colecciones.

# Enunciado:
Desarrolla un programa que permita registrar múltiples usuarios con los siguientes datos: nombre, edad y ciudad. Luego, debe mostrar:
- El total de usuarios registrados.
- El promedio de edad.
- El nombre mas largo ingresado.
- Elegir aleatoriamente un "usuario destacado".

# Requisitos técnicos:
- Usa ArrayList para almacenar los usuarios.
- Implementa una clase Usuario con atributos privados y métodos públicos (getters/setters).
- Crea una clase ControladorUsuarios que contenga:
- Un método estático para calcular el promedio de edad.
Un metodo sobrecargado para buscar un usuario por nombre o por ciudad.
Usa Random y Math para elegir aleatoriamente al usuario destacado.
Emplea Scanner para la entrada del usuario.
Controla errores como edad no valida con try-catch.
Usa una clase anidada estatica para mostrar un mensaje decorativo.

# Ejercicio 2: Calculadora de Figuras Geométricas

# Objetivo:
Aplicar programación orientada a objetos, sobrecarga de métodos, estructuras de control, biblioteca Math, clases estáticas, manejo de errores y colecciones.

# Enunciado:
Desarrolla un sistema que permita al usuario calcular el área de diferentes figuras (círculo, rectángulo, triángulo). El usuario podrá:
1. Ingresar el tipo de figura.
2. Ingresar los parámetros necesarios (radio, base, altura, etc).
3. Mostrar el área calculada. 4. Al finalizar, mostrar un historial de todos los cálculos realizados.

# Requisitos técnicos:
- Crea una clase abstracta Figura con un metodo calcularArea().
- Crea clases hijas: Circulo, Rectangulo, Triangulo.
- Usa sobrecarga para calcularArea (distintas firmas según la figura).
- Maneja errores de entrada (números negativos, datos no válidos).
- Usa un ArrayList para almacenar los resultados.
- Incluye una clase anidada estática Decorador con métodos para imprimir cabeceras o líneas decorativas.
- Emplea estructuras condicionales (switch, if) para controlar el menú.
- Usa métodos estáticos para mostrar estadísticas al final (total de figuras, promedio de áreas).