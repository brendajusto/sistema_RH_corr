/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senactech.sistemaRH.model;

/**
 *
 * @author 631701777
 */
public class horaExtra {
    private int valorHoraExtra;
    private int valorQuadroLotacao;

    public horaExtra() {
    }
    
    

    public horaExtra(int valorHoraExtra, int valorQuadroLotacao) {
        this.valorHoraExtra = valorHoraExtra;
        this.valorQuadroLotacao = valorQuadroLotacao;
    }

    public int getValorHoraExtra() {
        return valorHoraExtra;
    }

    public void setValorHoraExtra(int valorHoraExtra) {
        this.valorHoraExtra = valorHoraExtra;
    }

    public int getValorQuadroLotacao() {
        return valorQuadroLotacao;
    }

    public void setValorQuadroLotacao(int valorQuadroLotacao) {
        this.valorQuadroLotacao = valorQuadroLotacao;
    }

    @Override
    public String toString() {
        return "horaExtra{" + "valorHoraExtra=" + valorHoraExtra + ", valorQuadroLotacao=" + valorQuadroLotacao + '}';
    }
    
    
}
