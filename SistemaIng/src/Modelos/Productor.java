/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelos;

/**
 *
 * @author glupi
 */
public class Productor {
   private String nombre;
   private String pcod;
   private String telefono;
   private Establecimiento Propiedad [] = new Establecimiento[20];
   
   
   public void setNombre(String nom){
       this.nombre = nom;
   }
   
   public void setPcod (String cod){
       this.pcod=cod;
   }
   
   public void setTelefono (String tel){
       this.telefono = tel;
   }
   
   public String getPcod(){
       return this.pcod;
   }
   
   public String getNombre(){
       return this.nombre;
   }
   
   public String getTelefono(){
       return this.telefono;
   }   
}
