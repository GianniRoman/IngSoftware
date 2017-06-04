package Modelos;


public class Vaca {
     String vcod;
     float peso;
     String raza;
     String añoDeNacimiento;
     int cantLactancia;
     
     public Vaca(String vcod, float peso, String raza, String añoDeNac, int lactancias)
     {
           this.vcod = vcod;
           this.peso = peso;
           this.raza = raza;
           this.añoDeNacimiento = añoDeNac;
           this.cantLactancia = lactancias;
     }
     
     @Override
    public String toString() {                                 
        return vcod+"                                                   "+raza+"                                               "+(int)peso;
    }
     
     public Vaca()
     {
           this.vcod = null;
           this.peso = -1;
           this.raza = null;
           this.añoDeNacimiento = null;
           this.cantLactancia = -1;
     }

    public String getVcod() {
        return vcod;
    }

    public void setVcod(String vcod) {
        this.vcod = vcod;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public String getAñoDeNacimiento() {
        return añoDeNacimiento;
    }

    public void setAñoDeNacimiento(String añoDeNacimiento) {
        this.añoDeNacimiento = añoDeNacimiento;
    }

    public int getCantLactancia() {
        return cantLactancia;
    }

    public void setCantLactancia(int cantLactancia) {
        this.cantLactancia = cantLactancia;
    }
    
}