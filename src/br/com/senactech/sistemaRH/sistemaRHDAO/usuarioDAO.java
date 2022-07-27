/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.sistemaRH.sistemaRHDAO;
import br.com.senactech.sistemaRH.conexao.conexao;
import br.com.senactech.sistemaRH.model.usuario;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet; //vai receber o resultado de um select
import java.util.ArrayList;

/**
 *
 * @author Marcia
 */
public class usuarioDAO {
    public void cadastrarUsuario(usuario uVO) throws SQLException{
        Connection con = conexao.getConexao();
        Statement sta = con.createStatement();
        
        try {
            String sql;
            sql = "insert into usuario values (null, '"
                    + uVO.getNome()+ "', '"
                    + uVO.getSetor()+ "', '"
                    + uVO.getSenha()+ ");";

            sta.execute(sql);

        } catch (SQLException e) {
            throw new SQLException("Erro ao cadastrar!" + e.getMessage());

        } finally {
            con.close();
            sta.close();

        }
        
    }
    
    public ArrayList<usuario> listarusuarios() throws SQLException {
        Connection con = conexao.getConexao();
        Statement sta = con.createStatement();
        
        try {
           String sql;
           sql = "select * from usuario";
           ResultSet rs = sta.executeQuery(sql);
           ArrayList<usuario> usuarios = new ArrayList();
           while (rs.next()){
               usuario u = new usuario();
                //lado java /x/ lado banco
                u.setIdUsuario(rs.getInt("idUsuario"));
                u.setNome(rs.getString("nome"));
                u.setCpf(rs.getString("cpf"));
                u.setSenha(rs.getString("senha"));
                u.setSetor(rs.getString("setor"));
                usuarios.add(u);
              
           } return usuarios;
        } catch (SQLException e){
            throw new SQLException("Erro ao listar usuarios!" + e.getMessage());
        } finally {
            con.close();
            sta.close();
        }

    }
    
    public usuario getByDoc(String Cpf) throws SQLException{
        Connection con = conexao.getConexao();
        Statement sta = con.createStatement();
        
        usuario u = new usuario();
        
        try {
          String sql;
          sql = "select * from usuario where Cpf = " + Cpf;
          ResultSet rs = sta.executeQuery(sql);
          while (rs.next()){
              //lado do java |x| lado do banco
              u.setIdUsuario(rs.getInt("idUsuario"));
              u.setNome(rs.getString("nome"));
              u.setCpf(rs.getString("Cpf"));
              u.setSenha(rs.getString("senha"));
              u.setSetor(rs.getString("setor"));
              
          }
        } catch (Exception e) {
            throw new SQLException("Erro ao encontrar usuario!" + e.getMessage());
        } finally {
            con.close();
            sta.close();
            
        } return u;
    }
    
    public void deletarUsuario(int id) throws SQLException{
        Connection con = conexao.getConexao();
        Statement sta = con.createStatement();
        
        try {
          String sql;
          sql = "delete * from usuario where id = " + id;
          sta.execute(sql);
          
        } catch (Exception e) {
            throw new SQLException("Erro ao deletar!" + e.getMessage());
            
        } finally {
          con.close();
          sta.close();
        }
    }
}
