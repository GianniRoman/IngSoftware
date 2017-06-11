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
public class DatoLactometro {
    String vcod;
    float cant;
    float dens;

    public void setVcod(String vcod) {
        this.vcod = vcod;
    }

    public void setCant(float cant) {
        this.cant = cant;
    }

    public void setDens(float dens) {
        this.dens = dens;
    }

    public String getVcod() {
        return vcod;
    }

    public float getCant() {
        return cant;
    }

    public float getDens() {
        return dens;
    }
    
    @Override
    public String toString() {
        return "    "+vcod+"                                           "+cant+"                                         "+dens;
    }
}
