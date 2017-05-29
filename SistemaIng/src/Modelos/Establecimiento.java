package Modelos;

public class Establecimiento {
    private String nombre;
    private String ubicacion;
    private Productor Propietario [] = new Productor[20];
    
    public void setNombre(String nom){
        this.nombre = nom;
    }

    public void setUbicacion(String ubic){
        this.ubicacion = ubic;
    }

    public String getNombre(){
        return this.nombre;
    }
    
    public String getUbicacion(){
       return this.ubicacion; 
    }
}
