/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.cotizacion;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

/**
 *
 * @author jose
 */
public class Cotizacion {
    
    Conexion conexcion; 
    PreparedStatement ps;
    ResultSet res;
    
    
    public Cotizacion() {
        conexcion = new Conexion();       
    }

    
   public String getCotizacion(String fecha){
       Connection con = null;
       con = conexcion.getConexion();
       String valor = "";
       String fechacotizacion = "";
       try {
           ps = con.prepareStatement("SELECT fecha,valor FROM cotizacion WHERE fecha = ?");
           ps.setString(1, fecha);
           res = ps.executeQuery();
           if(res.next()){
               
               fechacotizacion = res.getString("fecha");
               valor = res.getString("valor");
               
           }
           
       } catch (SQLException e) {
           System.err.println(e.getMessage());
       }
       
       
    return valor;   
   } 
   public String setCotizacion(String fecha, double valor){
       Connection con = null;
       con = conexcion.getConexion();
       String ms = "";
       
       try {
           ps = con.prepareStatement("INSERT INTO cotizacion(id,fecha,valor) VALUES(?,?,?)");
           ps.setInt(1,0);
           ps.setString(2, fecha);
           ps.setDouble(3, valor);
           int respuesta = ps.executeUpdate();
        if(respuesta > 0){
            ms = "Guardado Correctamente";
        }else{
            ms = "Error, ningun campo afectado";
        }
           
       } catch (SQLException e) {
           System.err.println(e.getMessage());
       }
       return ms;
   } 
   //prueba de conexion e insercion de datos;
//   public static void main(String args[]){
//       Cotizacion cotizacion = new Cotizacion();
//       cotizacion.setCotizacion("11-04-2019",10.0);
//       System.out.println(cotizacion.getCotizacion("11-04-2019"));
//       System.err.println("Estoy aqui");
//   }
}
