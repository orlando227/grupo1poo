/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helpers;

/**
 *
 * @author ITBSoporte
 */
public class Estudiante extends Persona{
    
     public Estudiante(){
    
        setNombre("César");
        setApellido("Vásquez");
        setEdad(27);
    }        

    @Override
    public String getNacionalidad() {
      return "Nacionalidad Hondureña"; 
    }
}

