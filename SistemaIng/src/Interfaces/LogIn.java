package Interfaces;
import Modelos.ConexionBD;
import Modelos.Usuario;
import java.sql.SQLException;
import java.util.Date;

public class LogIn extends javax.swing.JFrame {

   
    public LogIn() {
        initComponents();
        this.setLocationRelativeTo(null);
        Date d = new Date();
        String hora;
         String fecha = (+d.getDate()+"/"+(d.getMonth()+1)+"/"+(d.getYear()+1900));

         if(d.getMinutes() < 10)
         {
             hora = (+(d.getHours())+":0"+d.getMinutes());
         }else
         {
             hora = (+(d.getHours())+":"+d.getMinutes());
         } 
         FechaInicio.setText(fecha);
         Hora.setText(hora);
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        tfNombreInicio = new javax.swing.JTextField();
        jButton1 = new javax.swing.JButton();
        tfContraseñaInicio = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        tipoUsuario = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        FechaInicio = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 51, 0));
        jLabel1.setText("Sistema de Control Lechero");

        jLabel5.setText("Nombre");

        jLabel6.setText("Contraseña");

        tfNombreInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                InsertUsersNames(evt);
            }
        });

        jButton1.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jButton1.setText("Iniciar Sesion");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BtnIniciarSesion(evt);
            }
        });

        tfContraseñaInicio.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EnterPw(evt);
            }
        });

        jLabel2.setText("Tipo");

        tipoUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "empleado", "gerente" }));
        tipoUsuario.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                EnterTipo(evt);
            }
        });

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/vaca1.png"))); // NOI18N

        FechaInicio.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        Hora.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(79, 79, 79)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(tfNombreInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(tfContraseñaInicio)
                            .addComponent(tipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap(78, Short.MAX_VALUE)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jLabel3))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1)
                .addGap(141, 141, 141))
            .addGroup(layout.createSequentialGroup()
                .addComponent(FechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 64, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(tfNombreInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(tfContraseñaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(tipoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(39, 39, 39)
                .addComponent(jButton1)
                .addGap(106, 106, 106)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(FechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, 31, Short.MAX_VALUE)
                    .addComponent(Hora, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void BtnIniciarSesion(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BtnIniciarSesion
        IniciarSesion();        
    }//GEN-LAST:event_BtnIniciarSesion

    private void IniciarSesion()
    {
        int tipo = -1;
        Object e = tipoUsuario.getSelectedItem();
        String cargo = String.valueOf(e);

        if(cargo == "gerente"){
            tipo = 1;            
        }else{
            tipo = 2;
        }       
        Usuario usuario = new Usuario(tfNombreInicio.getText(),tfContraseñaInicio.getText(),tipo,0,null);
        ConexionBD conexion = new ConexionBD();        
        conexion.Conectar();
        try {
            conexion.setS(conexion.getConexion().createStatement());
            conexion.setRs(conexion.getS().executeQuery("SELECT * FROM Usuario Where nombre = '"+usuario.getNombre()+"';"));
            if(conexion.getRs().next())  // metodo next hace apuntar al primer elemento obtenido de la consulta y devuelve true si es distinto de null.
            {   // luego obtenemos los valores en orden en el que estan insertados en la base de datos.
                String a = conexion.getRs().getString("nombre"); 
                String b = conexion.getRs().getString("contraseña");
                int c = conexion.getRs().getInt("tipo"); 
                int v = conexion.getRs().getInt("verificacion");
                if((a.equals(usuario.getNombre())) && (b.equals(usuario.getContraseña())) && (c == usuario.getTipo())) // uso el metodo equals ya que == devuelve true si comparten el 
                {                                                                                                      // mismo espacio de memoria equals compara caracteres
                        if(c == 1){
                            this.setVisible(false);   //desaparece la ventana login
                            new VistaGerente().setVisible(true);  // aparece la de gerente
                                  }else{
                                    if(v==0)
                                    {
                                       this.setVisible(false);
                                       new VerificacionContraseña(usuario).setVisible(true);
                                    }else{
                                        this.setVisible(false);
                                        new VistaEmpleado().setVisible(true);
                                    }
                                    
                                  }
                }                
            }else{ 
                  System.out.println("Usted no esta registrado en el sistema."); // si no es un usuario en la base de datos, entonces..
                 }  
                     
            
        } catch (SQLException ex) {
            System.out.println(ex);
        } 
    }
    private void EnterPw(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterPw
        if(evt.getKeyChar() == 10)
        {
            IniciarSesion();
        }
    }//GEN-LAST:event_EnterPw

    private void EnterTipo(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_EnterTipo
        if(evt.getKeyChar() == 10)
        {
            IniciarSesion();
        }
    }//GEN-LAST:event_EnterTipo

    private void InsertUsersNames(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_InsertUsersNames
         if((tfNombreInicio.getText().length() == 0) && (evt.getKeyChar() == 108 || evt.getKeyChar() == 103))
         {
            evt.consume();
            if(evt.getKeyChar() == 108){
                tfNombreInicio.setText("Lautaro"); 
            }else{
                tfNombreInicio.setText("gianni");
            }            
         }
    }//GEN-LAST:event_InsertUsersNames

    public static void main(String args[]) {
        
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LogIn().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel FechaInicio;
    private javax.swing.JLabel Hora;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPasswordField tfContraseñaInicio;
    private javax.swing.JTextField tfNombreInicio;
    private javax.swing.JComboBox<String> tipoUsuario;
    // End of variables declaration//GEN-END:variables
}
