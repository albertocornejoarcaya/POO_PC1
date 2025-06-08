package Clases;


import java.util.ArrayList;
import java.util.Random;

// Clase que controla operaciones relacionadas con la lista de usuarios
public class ControladorUsuarios {

    // Método para calcular el promedio de edad
    public static double calcularPromedioEdad(ArrayList<Usuario> usuarios) {
        if (usuarios.isEmpty()) return 0;
        int suma = 0;
        double promedio =0;
        for (Usuario u : usuarios) {
            suma += u.getEdad(); // Acumula edades
        }
        
        promedio = Math.round(suma * 10.0 / Usuario.getContador())/10.0 ;
        return   promedio; // Retorna promedio
    }

    // Método sobrecargado para buscar por nombre
    public static boolean buscarUsuario(ArrayList<Usuario> usuarios, String nombre) {
    	boolean encontrado = false;
        for (Usuario u : usuarios) {
            if (u.getNombre().equalsIgnoreCase(nombre)) {
            	encontrado = true; 
            }
        }
        return encontrado;
    }

    // Método sobrecargado para buscar por ciudad
    public static boolean buscarUsuario(ArrayList<Usuario> usuarios, String ciudad, boolean b ) {
       boolean encontrado = false;
        for (Usuario u : usuarios) {
            if (u.getCiudad().equalsIgnoreCase(ciudad)) {
                encontrado = true; // Agrega coincidencias por ciudad
            }
        }
        return encontrado;
    }
    
    
    //Metodo para buscar el nombre mas largo
    public static String buscarUsuario(ArrayList<Usuario> usuarios){
        if (usuarios.isEmpty()) return "";

        String nombreMasLargo = usuarios.get(0).getNombre(); // Inicializar con el primer nombre

        for (Usuario u : usuarios) {
            if (u.getNombre().length() > nombreMasLargo.length()) {
                nombreMasLargo = u.getNombre(); // Actualizar si se encuentra un nombre más largo
            }
        }

        return nombreMasLargo;
    }
    
    //Metodo para destacar un usuario
    public static String buscarUsuario(ArrayList<Usuario> usuarios, int b) {
        if (usuarios.isEmpty()) {
            return "No hay usuarios registrados.";
        }

        Random rand = new Random();
        int indiceDestacado = rand.nextInt(usuarios.size()); // Selecciona índice aleatorio
        return usuarios.get(indiceDestacado).getNombre();    // Retorna el nombre del usuario destacado
    }

    // Clase anidada estática para mostrar mensajes decorativos
    public static class Decorador {
        public static void mostrarMensaje(String mensaje) {
            System.out.println("\n ==== " + mensaje.toUpperCase() + " ====");
        }
    }
}