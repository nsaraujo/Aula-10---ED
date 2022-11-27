/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mainaula10;

/**
 *
 * @author 55649
 */
public class Posicao {
    Posicao proxima, anterior;
    Object elemento;

    Posicao(Posicao prox, Object elemento) {
        this.proxima = prox;
        this.anterior = null;
        this.elemento = elemento;
    }

    Posicao(Object elemento) {
        this.proxima = null;
        this.anterior = null;
        this.elemento = elemento;
    }

    void setProxima(Posicao prox) {
        this.proxima = prox;
    }

    void setAnterior(Posicao ant) {
        this.anterior = ant;
    }

    Posicao getProxima() {
        return this.proxima;
    }

    Posicao getAnterior() {
        return this.anterior;
    }

    int getElementInt() {
        return (int) this.elemento;
    }
    Object getElement(){
        return this.elemento;
    }
}
