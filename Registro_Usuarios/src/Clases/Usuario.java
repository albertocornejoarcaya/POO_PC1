package Clases;

// Clase Usuario que representa un objeto con nombre, edad y ciudad
public class Usuario {
    // Atributos de la clase
    private String nombre;
    private int edad;
    private String ciudad;
    private static int contador = 0;
 
    // Constructor
    public Usuario(String nombre, int edad, String ciudad) {
        this.nombre = nombre;
        this.edad = edad;
        this.ciudad = ciudad;
        contador ++;
    }

    // Getters y Setters públicos
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }
    
    
    public static int getContador() {
        return contador;
    }

    public static void setContador(int contador) {
    	Usuario.contador = contador;
    }

    // Método toString para imprimir información del usuario

    public String MostrarUsuario() {
        return nombre + " - " + edad + " años - " + ciudad;
    }
}