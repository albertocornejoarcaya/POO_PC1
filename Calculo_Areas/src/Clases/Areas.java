package Clases;

import java.util.ArrayList;

/**
 * Clase abstracta base que representa una figura con área.
 * Sirve como superclase para figuras geométricas específicas.
 */
public abstract class Areas {
    protected double area;   // Almacena el área calculada de la figura
    protected String tipo;   // Almacena el tipo de figura como cadena

    // Método abstracto que obliga a las subclases a definir cómo se calcula el área
    public abstract void calcularArea();

    // Devuelve el valor del área de la figura
    public double getArea() {
        return area;
    }

    // Devuelve el tipo de figura
    public String getTipo() {
        return tipo;
    }
}

/**
 * Clase que representa un círculo, hereda de Areas.
 */
class Circulo extends Areas {
    private double radio;

    // Constructor del círculo: inicializa el radio y valida que sea positivo
    public Circulo(double radio) {
        if (radio <= 0)
            throw new IllegalArgumentException("El radio debe ser mayor a cero.");
        this.radio = radio;
    }

    // Calcula el área del círculo y define su tipo
    @Override
    public void calcularArea() {
        area = Math.PI * radio * radio;
        tipo = "Circulo";
    }
}

/**
 * Clase que representa un rectángulo, hereda de Areas.
 */
class Rectangulo extends Areas {
    private double base, altura;

    // Constructor del rectángulo: inicializa base y altura, con validación
    public Rectangulo(double base, double altura) {
        if (base <= 0 || altura <= 0)
            throw new IllegalArgumentException("Las dimensiones deben ser mayores a cero.");
        this.base = base;
        this.altura = altura;
    }

    // Calcula el área del rectángulo y define su tipo
    @Override
    public void calcularArea() {
        area = base * altura;
        tipo = "Rectangulo";
    }
}

/**
 * Clase que representa un triángulo, hereda de Areas.
 */
class Triangulo extends Areas {
    private double base, altura;

    // Constructor del triángulo: inicializa base y altura, con validación
    public Triangulo(double base, double altura) {
        if (base <= 0 || altura <= 0)
            throw new IllegalArgumentException("Las dimensiones deben ser mayores a cero.");
        this.base = base;
        this.altura = altura;
    }

    // Calcula el área del triángulo y define su tipo
    @Override
    public void calcularArea() {
        area = (base * altura) / 2;
        tipo = "Triangulo";
    }
}

/**
 * Clase auxiliar con herramientas para mostrar decoraciones y estadísticas.
 */
class Utilidades {

    // Clase estática interna usada para imprimir decoraciones visuales
    public static class Decorador {

        // Imprime una línea decorativa
        public static void imprimirLinea() {
            System.out.println("==================================");
        }

        // Imprime un título decorado en mayúsculas
        public static void imprimirCabecera(String titulo) {
            imprimirLinea();
            System.out.println(titulo.toUpperCase());
            imprimirLinea();
        }
    }

    /**
     * Método que muestra estadísticas sobre una lista de figuras.
     * Calcula el área promedio y cuenta cuántas figuras de cada tipo existen.
     */
    public static void mostrarEstadisticas(ArrayList<Areas> Area) {
        System.out.println("\n ESTADÍSTICAS FINALES:");

        double totalArea = 0;             // Acumulador de todas las áreas
        int contadorC = 0, contadorR = 0, contadorT = 0; // Contadores por tipo

        for (Areas f : Area) {
            f.calcularArea(); // Se asegura de calcular el área antes de usarla
            totalArea += f.getArea(); // Se suma el área al total

            // Se cuenta cada tipo de figura según el valor de su tipo
            switch (f.getTipo()) {
                case "Circulo" -> contadorC++;
                case "Rectangulo" -> contadorR++;
                case "Triangulo" -> contadorT++;
                default -> System.out.println("Tipo desconocido: " + f.getTipo());
            }
        }

        // Se imprime el resumen de estadísticas
        System.out.printf("Promedio de áreas: %.2f\n", totalArea / Area.size());
        System.out.printf("Total de Círculos: %d\n", contadorC);
        System.out.printf("Total de Rectángulos: %d\n", contadorR);
        System.out.printf("Total de Triángulos: %d\n", contadorT);
        System.out.println("Total de figuras: " + Area.size());
    }
}
