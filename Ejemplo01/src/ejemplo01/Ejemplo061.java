/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemplo01;

/**
 *
 * @author reroes
 */
public class Ejemplo061 {
    public static void main(String[] args) {
        // Uso de printf
        // f: formato
        
        String nombreEstudiante = "JOSE PABLO";
        String apellidoEstudiante = "RAMIREZ JIMENEZ";
        int edadEstudiante = 18;
        String direccionEstudiante = "Epoca";
        String universidadEstudiante = "UTPL";
        int cicloEstudiante = 1;
        String asignaturaEstudiante = "Introduccion a la programacion";
        String paraleloEstudiante = "A";
        // System.out.println(nombreEstudiante+" "+apellidoEstudiante+ " "+ 
        // nacimiento);
        // En printf; 
        // usamos %s para reemplazar las cadenas, enteros, decimales
        // usamos %d para reemplazar los valores enteros
        // usamos %f para reemplazar los valore decimales
        // System.out.printf("%s\n\n%s\n\n%s\n", nombreEstudiante, 
        //        apellidoEstudiante, nacimiento);
        
        System.out.printf("Nombre:\n\t%s\nApellido:\n\t%s\nEdad:%s\nDireccion:\n\n\t%s \n----------- \nUniversidad:%S\nCiclo: %s\nAsignatura: %s \n Paralelo: \n\t%S", nombreEstudiante, 
                apellidoEstudiante, edadEstudiante, direccionEstudiante, universidadEstudiante, cicloEstudiante, asignaturaEstudiante, paraleloEstudiante);
        
         
        
    }
}
