package prueb2;

import java.util.Scanner;

public class Prueb2 {

    public static void main(String[] args) {
        
                    Scanner scan = new Scanner(System.in);
                    System.out.print("Ingrese los DATOS: ");
                    System.out.println();
                    estudiantes[] estudiantess = new estudiantes[5];

                    for (int i = 0; i < estudiantess.length; i++) {
                        System.out.println("Datos del estudiante:  " + (i + 1));
                        scan.nextLine();

                        System.out.print("Nombre: ");
                        String nombre = scan.nextLine();

                        System.out.print("Edad: ");
                        String edad = scan.nextLine();

                        System.out.println("Cuántos materias tiene el estudiante? ");
                        int numMaterias = scan.nextInt();
                        String[] mates = new String[numMaterias];

                        scan.nextLine();
                        materias[] materia= new materias[2];    
                        for (int j = 0; j < materia.length; j++) {
                            System.out.print("Nombre de la materia " + (j + 1) + ": ");
                            String nombreA = scan.nextLine();
                            
                            System.out.println("Nivel de la materia "+(j+1)+": ");
                            int nivel=scan.nextInt();
                        }
                        System.out.println("");
                        System.out.println("");
                    }
                    
                    
    }

}
