/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package esercizio_2;

/**
 *
 * @author paolo
 */
public class Elemento {
    int valore;
    Elemento successivo;
    Elemento(int valore, Elemento successivo){
        this.successivo=successivo;
        this.valore=valore;
    }
}
