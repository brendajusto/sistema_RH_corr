/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.senactech.sistemaRH.model;

/**
 *
 * @author Marcia
 */
public class usuario {
    private int idUsuario;
    private String nome;
    private String setor;
    private int senha;

    public usuario() {
    }

    public usuario(int idUsuario, String nome, String setor, int senha) {
        this.idUsuario = idUsuario;
        this.nome = nome;
        this.setor = setor;
        this.senha = senha;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSetor() {
        return setor;
    }

    public void setSetor(String setor) {
        this.setor = setor;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }
    
    
    
}
