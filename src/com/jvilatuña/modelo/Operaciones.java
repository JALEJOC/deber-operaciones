/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.jvilatuña.modelo;

import javax.swing.JOptionPane;

/**
 *
 * @author UseR
 */
public class Operaciones {
    float n1,n2;

    public Operaciones(float n1, float n2) {
        this.n1 = n1;
        this.n2 = n2;
    }
    
    
    public Operaciones(){
        JOptionPane.showMessageDialog(null,"Ingrese dos numeros para realizar la operación deseada");
    }
    
    public void ingreso1(float n1){
        this.n1=n1;
    }
    public float get1(){
        return n1;
    }
    
    public void ingreso2(float n2){
        this.n2 = n2;
    }
    
    public float get2(){
        return n2;
    }
    
    public float suma(){
        return n1+n2;
    }
    public float resta(){
        return n1-n2;
    }
    
    public float multiplicacion(){
        return n1*n2;
    }
    
    public float division(){
        return n1/n2;
    }
 
}
