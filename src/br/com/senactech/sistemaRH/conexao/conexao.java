/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.sistemaRH.conexao;
import java.sql.SQLException;
import java.sql.DriverManager;
import java.sql.Connection;

/**
 *
 * @author Marcia
 */
public class conexao {
    
    private static String url = "jdbc:mysql://mysql746.umbler.com:41890/devn211";
    private static String user = "devn211";
    private static String pass = "devn211senac";

  

    public static Connection getConexao() throws SQLException {
        Connection c = null;

        try {
            c = DriverManager.getConnection(url, user, pass);

        } catch (SQLException e)  {
            throw new SQLException("Erro de conexão!" + e.getMessage());

        } finally {

        }

        return c;
    }
    
}
