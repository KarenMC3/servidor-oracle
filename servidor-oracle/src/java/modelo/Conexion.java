/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.sql.*;
public class Conexion {
    public static Connection conectarse(String login, String password)
            throws ClassNotFoundException, SQLException
    {
        Connection con=null;
        try{
            //Paso 1: escribir la url de conexion
            String url="jdbc:oracle:thin:@localhost:1521:orcl";
            
            //Paso 2: cargado del driver
            Class.forName("oracle.jdbc.OracleDriver");
             
            //Paso 3: nos autenticamos
            con=DriverManager.getConnection(url, login, password);
            System.out.println("CONECTADO");
            
        }catch(Exception e){
            System.out.println("Hubo un error" +e.getMessage());
        }
        
        return con;
    }
}
    


