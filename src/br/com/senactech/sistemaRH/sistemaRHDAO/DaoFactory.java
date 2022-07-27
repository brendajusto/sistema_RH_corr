/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.sistemaRH.sistemaRHDAO;

/**
 *
 * @author Marcia
 */
public class DaoFactory {
    private static usuarioDAO uDAO = new usuarioDAO();
    private static turnoverDAO toDAO = new turnoverDAO();
    
    public static usuarioDAO getusuarioDAO() {
        return uDAO;

    }
    
    public static turnoverDAO getturnoverDAO() {
        return toDAO;

    }
}
