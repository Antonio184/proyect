package modelo;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.ArrayList;


public class Persona {
    //atributos de la clase
    
    String dui;
    String apellido;
    String nombres;
    
    Connection cnn;
    Statement state;
    ResultSet result;
    
public Persona(){
        try {
            Class.forName("com.mysql.jdbc.Driver");//Driver de la base de datos
            cnn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bd_recurso_humano?zeroDateTimeBehavior=convertToNull","root",""); //url de la BD, user , pass
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
        }
             
}

public boolean  insertarDatos(){
    try{
        String miQuery = "insert into tb-persona value (´"+dui + "´,´"+apellido+"´,´"+nombres+"´);";
        int estado = 0; //estado de la insecion
        state = cnn.createStatement();
        estado = state.executeUpdate(miQuery);
        if (estado == 1) {
        return true;
        }
    } catch (SQLException ex) {
        Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null , ex);
    }
    return false;
    
}  
//***************************************************

//generar los metodos set y get para los atributos

public String getDui() {
    return dui;
}

public void setDui(String dui) {
     this.dui = dui;
}

    public String getApellido() {
        return apellido;
    }
public void setApellidos(String apellidos) {
    this.apellido = apellidos;
}
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }
    
    
    //constructor vacio de la clase tipo publico
//El constructor lo utilizaremos para conectar con la base de datos.

    
}

