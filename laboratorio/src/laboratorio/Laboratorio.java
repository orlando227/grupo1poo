/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package laboratorio;

import helpers.Deportista;
import helpers.Estudiante;
public class Laboratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Estudiante in = new Estudiante();
        Deportista on = new Deportista();
        
        System.out.println(in.getNacionalidad());
        in.informacion();
        System.out.println();
        System.out.println(on.getNacionalidad());
        on.informacion();    
    }   
    }
    

