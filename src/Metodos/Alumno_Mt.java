/*
Crear una clase llamada Alumno que mantenga información sobre las notas de distintos alumnos. La clase Alumno tendrá como atributos, su nombre y una lista
de tipo Integer con sus 3 notas. En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide toda la información al usuario y ese
Alumno se guarda en una lista de tipo Alumno y se le pregunta al usuario si quiere crear otro Alumno o no.Después de ese bucle tendremos el siguiente método
en el servicio de Alumno: Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota final y se lo busca en la lista de Alumnos.
Si está en la lista, se llama al método. Dentro del método se usará la lista notas para calcular el promedio final de alumno. Siendo este promedio final
devuelto por el método y mostrado en el main.
*/
package Metodos;

public class Alumno_Mt {
    private String nombre;
    private String apellido;
    private Integer dni;
    private Integer nota1;
    private Integer nota2;
    private Integer nota3;

    public Alumno_Mt(String nombre, String apellido, Integer dni, Integer nota1, Integer nota2, Integer nota3) {
        this.nombre = nombre;
        this.apellido = apellido;
        this.dni = dni;
        this.nota1 = nota1;
        this.nota2 = nota2;
        this.nota3 = nota3;
    }

    public Alumno_Mt() {
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public Integer getDni() {
        return dni;
    }

    public Integer getNota1() {
        return nota1;
    }

    public Integer getNota2() {
        return nota2;
    }

    public Integer getNota3() {
        return nota3;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public void setDni(Integer dni) {
        this.dni = dni;
    }

    public void setNota1(Integer nota1) {
        this.nota1 = nota1;
    }

    public void setNota2(Integer nota2) {
        this.nota2 = nota2;
    }

    public void setNota3(Integer nota3) {
        this.nota3 = nota3;
    }
    
    public int notaFinal() {
        int notaFinal;
        notaFinal = (nota1 + nota2 + nota3) /3;
        return notaFinal;
    }

    @Override
    public String toString() {
        return "Alumno_Mt{" + "nombre=" + nombre + ", apellido=" + apellido + ", dni=" + dni + ", nota1=" + nota1 + ", nota2=" + nota2 + ", nota3=" + nota3 + '}';
    }

    

    
}