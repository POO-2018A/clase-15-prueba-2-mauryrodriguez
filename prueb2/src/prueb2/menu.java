/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prueb2;


public class menu {
    public menu() {
        //constructor 
        
    }
    Integer opcion=0;
    
    public void setMenu(int opc){
    
        opcion=opc;   //  valor para  nuestro menu    
        switch (opcion){
            case 1:
                System.out.println("Ingrese los datos del estudiante");
                
                break;
            case 2:
                System.out.println("Ingrese los datos de las mateerias");
                break;
            case 3: 
                System.out.println("Imprimir datos de los estudiantes");
                break;
            case 4: 
                System.out.println("Salir");
                break;
            default:
              
                System.out.println("Ingrese una opcio correcta");
                break;
        }
    
    }
    
}
