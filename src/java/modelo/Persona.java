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

public Persona (String dui, String apellidos , String nombres){
    this.dui = dui;
    this.apellido = apellidos;
    this.nombres = nombres ;
}

public boolean  insertarDatos(){
    try{
        String miQuery = "insert into tb_persona values ('" + dui + "', '" + apellido + "','" + nombres + "');";
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
 
public ArrayList<Persona> consultarRegistros(){
    ArrayList<Persona> person =new ArrayList (); //*crear el array del almacenamiento de tipo persona
    try{
    String miQuery = "select * from tb_persona:";//*definir la consulta
    state =cnn.createStatement();//*crear el,boton para la consulta
    result = state.executeQuery(miQuery);//* ejecutar consulta
    while(result.next()){//*recoger todo el Resultset y almacena en cada fila los requisitos encontrados
    
        person.add(new Persona(result.getString("dui_persona"), result.getString("apellido_persona"), result.getString("nombre_Persona")));
    }
    } catch (SQLException ex) {
        Logger.getLogger(Persona.class.getName()).log(Level.SEVERE, null, ex);
    }
    return person;
    

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

