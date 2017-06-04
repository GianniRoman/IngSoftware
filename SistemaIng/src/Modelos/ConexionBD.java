package Modelos;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConexionBD {
    private Connection conexion;
    private ResultSet rs;
    private Statement s;
    
    public ConexionBD()
    {
     conexion = null;
     rs = null;
     s = null;       
    }
    
     public void Conectar()
    {
        if(conexion != null)
        {
            return;
        }
        
        String url = "jdbc:postgresql://localhost:5432/SistemaIngenieria";
        String password = "warcraft1";
        String user = "postgres";
        try{
            Class.forName("org.postgresql.Driver");
            conexion = DriverManager.getConnection(url,user,password);
            
            if(conexion != null)
            {
                 System.out.println("La conexion a la base de datos fue exitosa...");
            }
            
        }catch(Exception e)
        {
            System.out.println("Hubo un problema al conectar la base de datos");
            System.out.println("Errorx:" + e.getMessage());
            
        }
               
    }

    public Connection getConexion() {
        return conexion;
    }

    public void setConexion(Connection conexion) {
        this.conexion = conexion;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }

    public Statement getS() {
        return s;
    }

    public void setS(Statement s) {
        this.s = s;
    }
   
    
}
