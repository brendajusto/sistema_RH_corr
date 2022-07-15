/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.com.senactech.sistemaRH.model;

/**
 *
 * @author 631701777
 */
public class turnover {
    private int nAd;
    private int nDem;
    private int qlMesAnterior;

    public turnover() {
    }

    public turnover(int nAd, int nDem, int qlMesAnterior) {
        this.nAd = nAd;
        this.nDem = nDem;
        this.qlMesAnterior = qlMesAnterior;
    }

    public int getnAd() {
        return nAd;
    }

    public void setnAd(int nAd) {
        this.nAd = nAd;
    }

    public int getnDem() {
        return nDem;
    }

    public void setnDem(int nDem) {
        this.nDem = nDem;
    }

    public int getQlMesAnterior() {
        return qlMesAnterior;
    }

    public void setQlMesAnterior(int qlMesAnterior) {
        this.qlMesAnterior = qlMesAnterior;
    }

    @Override
    public String toString() {
        return "turnover{" + "nAd=" + nAd + ", nDem=" + nDem + ", qlMesAnterior=" + qlMesAnterior + '}';
    }
    
    
}
