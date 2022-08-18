/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas. En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide toda la información al usuario y ese
Alumno se guarda en una lista de tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.Después de ese bucle tendremos el siguiente método
en el servicio de Alumno: Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota final y se lo busca en la lista de Alumnos.
Si está en la lista, se llama al método. Dentro del método se usará la lista notas para calcular el promedio final de alumno. Siendo este promedio final
devuelto por el método y mostrado en el main.
*/
package Servicios;

import Metodos.Alumno_Mt;
import java.util.ArrayList;
import java.util.Scanner;

public class Alumno_Sv {
    
    private Scanner leer;
    private ArrayList<Alumno_Mt> lista = new ArrayList();
    
    
    public void cargarAlumno(){
        
        String respuesta = "";
        
        do{
            Alumno_Mt a1 = new Alumno_Mt();
            
            System.out.println("Ingrese el nombre del alumno");
            String nombres = leer.next();
            
            System.out.println("Ingrese el apellido del alumno");
            String apellidoAlumno = leer.next();
            
            System.out.println("Ingrese el DNI del alumno");
            int dni = leer.nextInt();
            
            System.out.println("Ingrese la primer nota");
            int nota1 = leer.nextInt();
            
            System.out.println("Ingrese la segunda nota");
            int nota2 = leer.nextInt();
            
            System.out.println("Ingrese la tercer nota");
            int nota3 = leer.nextInt();
            
            a1.setNombre(nombres);
            a1.setApellido(apellidoAlumno);
            a1.setDni(dni);
            a1.setNota1(nota1);
            a1.setNota2(nota2);
            a1.setNota3(nota3);
            
            lista.add(a1);
            
            System.out.println("¿Quiere ingresar otro alumno?");
            respuesta = leer.next();
            
        } while (respuesta.equalsIgnoreCase("si"));
        
        for (Alumno_Mt alumno_Mt : lista) {
            System.out.println(alumno_Mt);
        }
        
    }
    
    public void notaFinal(){
        System.out.println("Escriba el nombre del alumno que desea calcular su nota final");
        String nombreAlumno = leer.next();
        
        for (Alumno_Mt alumno_Mt : lista) {
            if (alumno_Mt.getNombre().equalsIgnoreCase(nombreAlumno)) {
                System.out.println("La nota final de " + nombreAlumno + " es " + alumno_Mt.notaFinal());
            }
        }
    }
}
