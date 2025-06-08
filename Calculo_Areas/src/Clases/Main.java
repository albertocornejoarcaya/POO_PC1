package Clases;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);                     // Se crea un objeto Scanner para leer datos del usuario
        ArrayList<Areas> historial = new ArrayList<>();               // Lista para almacenar las figuras creadas (historial)
        int opcion;                                                   // Variable para almacenar la opción del usuario
        int contador = 0;                                             // Contador para mostrar cabecera solo la primera vez

        // Bucle principal del menú
        do {
            // Muestra la cabecera solo la primera vez
            if (contador == 0) {
                Utilidades.Decorador.imprimirCabecera("Calculadora de Figuras Geométricas");
            }

            // Menú de opciones
            System.out.println("\n MENÚ DE OPCIONES");
            Utilidades.Decorador.imprimirLinea();
            System.out.println("1. Círculo");
            System.out.println("2. Rectángulo");
            System.out.println("3. Triángulo");
            System.out.println("4. Mostrar historial");
            System.out.println("5. Ver estadísticas");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            contador++;

            try {
                opcion = scanner.nextInt(); // Lee la opción ingresada por el usuario

                // Control de flujo según la opción ingresada
                switch (opcion) {

                    case 1 -> { // Crear y calcular un Círculo
                        System.out.print("Ingrese el radio del círculo: ");
                        double radio = scanner.nextDouble();                      // Pide radio
                        Areas c = new Circulo(radio);                            // Crea el objeto círculo
                        c.calcularArea();                                        // Calcula el área
                        historial.add(c);                                        // Lo agrega al historial
                        System.out.printf("Área del círculo es: %.2f\n", c.getArea());
                    }

                    case 2 -> { // Crear y calcular un Rectángulo
                        System.out.print("Ingrese la base del rectángulo: ");
                        double base = scanner.nextDouble();                      // Pide base
                        System.out.print("Ingrese la altura del rectángulo: ");
                        double altura = scanner.nextDouble();                    // Pide altura
                        Areas r = new Rectangulo(base, altura);                  // Crea el objeto rectángulo
                        r.calcularArea();                                        // Calcula el área
                        historial.add(r);                                        // Lo agrega al historial
                        System.out.printf("Área del rectángulo: %.2f\n", r.getArea());
                    }

                    case 3 -> { // Crear y calcular un Triángulo
                        System.out.print("Ingrese la base del triángulo: ");
                        double base = scanner.nextDouble();                      // Pide base
                        System.out.print("Ingrese la altura del triángulo: ");
                        double altura = scanner.nextDouble();                    // Pide altura
                        Areas t = new Triangulo(base, altura);                   // Crea el objeto triángulo
                        t.calcularArea();                                        // Calcula el área
                        historial.add(t);                                        // Lo agrega al historial
                        System.out.printf("Área del triángulo: %.2f\n", t.getArea());
                    }

                    case 4 -> { // Mostrar historial de figuras calculadas
                        Utilidades.Decorador.imprimirCabecera("Historial de cálculos");
                        if (historial.isEmpty()) {
                            System.out.println("No hay cálculos en el historial.");
                        } else {
                            for (int i = 0; i < historial.size(); i++) {
                                Areas f = historial.get(i); // Obtiene figura
                                System.out.printf("%d. %s - Área: %.2f\n", i + 1, f.getTipo(), f.getArea());
                            }
                        }
                    }

                    case 5 -> { // Mostrar estadísticas
                        Utilidades.mostrarEstadisticas(historial); // Llama método para estadísticas
                    }

                    case 6 -> { // Salir del programa
                        Utilidades.Decorador.imprimirCabecera("Saliendo del programa...");
                    }

                    default -> System.out.println("Opción no válida."); // Control para opciones fuera de rango
                }

            } catch (InputMismatchException e) {
                // Si el usuario no ingresa un número
                System.out.println("Entrada no válida. Intente nuevamente.");
                scanner.next(); // Limpia el scanner
                opcion = 0;     // Reinicia opción para seguir en el bucle
            } catch (IllegalArgumentException e) {
                // Si hay errores como dimensiones inválidas
                System.out.println("Error: " + e.getMessage());
                opcion = 0;
            }

        } while (opcion != 6); // El bucle se repite mientras la opción no sea salir (6)
    }
}
