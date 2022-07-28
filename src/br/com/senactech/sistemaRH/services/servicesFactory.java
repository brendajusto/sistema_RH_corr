/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.sistemaRH.services;

/**
 *
 * @author Marcia
 */
public class servicesFactory {
    private static usuarioServices UsuarioServices = new usuarioServices();
    //private static horaextraServices heServices = new horaextraService();
    
    public static usuarioServices getusuarioServices(){
        return UsuarioServices;
    }
}
