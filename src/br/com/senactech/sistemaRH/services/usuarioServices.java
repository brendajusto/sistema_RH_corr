/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.sistemaRH.services;
import br.com.senactech.sistemaRH.sistemaRHDAO.usuarioDAO;
import br.com.senactech.sistemaRH.sistemaRHDAO.DaoFactory;
import br.com.senactech.sistemaRH.model.usuario;
import java.sql.SQLException;
import java.util.ArrayList;

import java.sql.SQLException;

/**
 *
 * @author Marcia
 */
public class usuarioServices {
    
    public void cadUsuarioBD(usuario uVO) throws SQLException{
        usuarioDAO uDAO = DaoFactory.getusuarioDAO();
        uDAO.cadastrarUsuario(uVO);
    }
    
    public ArrayList<usuario> getusuarioBD() throws SQLException{
        usuarioDAO uDAO = DaoFactory.getusuarioDAO();
        return uDAO.listarusuarios();
    }
    
    public usuario buscarUsuarioBD(String Cpf) throws SQLException{
        usuarioDAO uDAO = DaoFactory.getusuarioDAO();
        return uDAO.getByDoc(Cpf);
    }
    
    public void deletarUsuarioBD(int id) throws SQLException{
        usuarioDAO uDAO = DaoFactory.getusuarioDAO();
        uDAO.deletarUsuario(id);
    }
}
