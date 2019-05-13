/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.banco.cotizacion;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author jose
 */
public class Conexion {
    private String host;
    private String puerto;
    private String database;
    private String usuario;
    private String contrasena;

    public Conexion() {
        this.host = "localhost";
        this.puerto = "3306";
        this.usuario = "admin";
        this.contrasena = "admin";
        this.database = "dbBanco";
    }

    //public String url = "jdbc:mysql://" + host + ":" + puerto + "/" + database;
    public String url = "jdbc:mysql://localhost:3306/dbBanco";
    public Connection getConexion() {
        Connection conn = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, usuario, contrasena);
            System.out.println("conexion exitosa");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }
   
}
