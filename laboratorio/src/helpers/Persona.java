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
public abstract class Persona {
    
    private String nombre;
    private String apellido;
    private int edad;
    
    public Persona(){
    
    } 
     public void setNombre(String nombre){
      this.nombre = nombre;
     }       
     public String getNombre(){
        return this.nombre;
     }
     public void setApellido(String apellido){
      this.apellido = apellido;
     }       
     
     public String getApellido(){
        return this.apellido;
     }
     public void setEdad(int edad){
      this.edad = edad;
     }       
     
     public int getEdad(){
        return this.edad;
     }
     
     public void informacion(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Apellido: " + apellido);
        System.out.println("Edad: " + edad);
     }
     
     abstract String getNacionalidad();
}


