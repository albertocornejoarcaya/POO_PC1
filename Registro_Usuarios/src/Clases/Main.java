package Clases;
import java.util.ArrayList;
import java.util.Scanner;

// Clase principal con método main
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Scanner para entradas
        ArrayList<Usuario> usuario = new ArrayList<>(); // Lista para guardar usuarios

        String continuar = "S";

        // Bucle para ingresar usuarios mientras se responda "S"
        while (continuar.equalsIgnoreCase("S")) {
            System.out.print("Ingrese nombre: ");
            String nombre = scanner.nextLine().toUpperCase();

            int edad = 0;
            boolean edadValida = false;

            // Validar que la edad ingresada sea correcta
            while (!edadValida) {
                try {
                    System.out.print("Ingrese edad: ");
                    edad = Integer.parseInt(scanner.nextLine()); // Convertir a entero
                    if (edad <= 0) throw new NumberFormatException(); // Edad inválida si es <= 0
                    edadValida = true;
                } catch (NumberFormatException e) {
                    System.out.println("Edad inválida. Ingrese un número mayor que 0.");
                }
            }

            System.out.print("Ingrese ciudad: ");
            String ciudad = scanner.nextLine().toUpperCase();

            // Crear y agregar nuevo usuario
            usuario.add(new Usuario(nombre, edad, ciudad));

            System.out.print("¿Desea ingresar otro usuario? (s/n): ");
            continuar = scanner.nextLine().toUpperCase();
        }

        // Mostrar resumen
        ControladorUsuarios.Decorador.mostrarMensaje("Resumen de usuarios");

        // Total de usuarios registrados
        System.out.println("Total de usuarios: " + usuario.size());

        // Promedio de edad
        System.out.printf("Promedio de edad: %.1f\n", ControladorUsuarios.calcularPromedioEdad(usuario));

        // Buscar el nombre más largo
        String nombreMasLargo = ControladorUsuarios.buscarUsuario(usuario);
        System.out.println("Nombre más largo: " + nombreMasLargo);

        // Elegir un usuario destacado aleatoriamente
        ControladorUsuarios.Decorador.mostrarMensaje("Usuario Destacado");
        String usuarioDestacado = ControladorUsuarios.buscarUsuario (usuario);
        System.out.println(usuarioDestacado);

        // Cerrar scanner
        scanner.close();
    }
}