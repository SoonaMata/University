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
    int value;
    Elemento next;
    Elemento(int value, Elemento next){
        this.value=value;
        this.next=next;
    }
}
