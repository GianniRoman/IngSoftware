package Modelos;

public class Usuario {
    String nombre;
    String contraseña;
    String dni;
    int tipo;
    int verificacion;
    public Usuario()
    {   
        nombre = null;
        contraseña = null;
        dni = null;
        tipo = -1;
        verificacion = -1;
    }
    
    public Usuario(String nombre, String pw, int tipo,int verificacion, String dni)
    {
        this.nombre = nombre;
        this.contraseña = pw;
        this.tipo = tipo;
        this.verificacion = verificacion;
        this.dni = dni;
    }
    

    public String getdni(){
        return dni;
    }
    
    public int getVerificacion() {
        return verificacion;
    }

    public void setVerificacion(int verificacion) {
        this.verificacion = verificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public int getTipo() {
        return tipo;
    }

    public void setTipo(int tipo) {
        this.tipo = tipo;
    }
    
    
    
}


