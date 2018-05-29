/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueb2;


public class estudiantes {

    static int length;

    public estudiantes(String nombre, int edad, String materias) {
        this.nombre = nombre;
        this.edad = edad;
        this.materias = materias;
    }

    private String nombre;
    private int edad;
    private String materias;

    estudiantes() {
        throw new UnsupportedOperationException("Not supported yet."); 
    }

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

    public String getMaterias() {
        return materias;
    }

    public void setMaterias(String materias) {
        this.materias = materias;
    }

    
    Integer[] estudiantes = new Integer [5];
    
    public void estud(){     // para estudiantes
    
            for(int i=0;  i<5;   i++ ){
                System.out.print("Ingrese el estudiante: "+(i+1)+": ");
                int numEstudiantes = scan.nextInt();
                estudiantes[] estudiantess = new estudiantes[numEstudiantes];
            }
    }
    
    public void imprimirEstud() {
        for(int i=0;  i<10;   i++ ){
                System.out.println("Estudiante"+i+": ");
                
            }
    }
    
    
}
