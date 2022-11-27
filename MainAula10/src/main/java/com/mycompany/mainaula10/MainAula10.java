/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package com.mycompany.mainaula10;

/**
 *
 * @author 55649
 */
public class MainAula10 {

    public static void main(String[] args) {
        Lista lista = new Lista();
        lista.sortear();

        for (int i = 0; i < lista.array.length; i++) {
            lista.ordemCres(lista.array[i]);
        }

        System.out.println("-----------------------------------------------------------------");
        lista.Ordemcrescente();
        System.out.println("-----------------------------------------------------------------");
       
        System.out.println("-----------------------------------------------------------------");
        lista.OrdemDescrecente();
        System.out.println("-----------------------------------------------------------------");
        
        System.out.println("-----------------------------------------------------------------");    
        lista.numeroPrimo();
        System.out.println("-----------------------------------------------------------------");
        

        System.out.println("-----------------------------------------------------------------");
        lista.Ordemcrescente();
        System.out.println("-----------------------------------------------------------------");
    }
}
