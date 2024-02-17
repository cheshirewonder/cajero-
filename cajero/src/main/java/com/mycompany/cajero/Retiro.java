/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cajero;

/**
 *
 * @author Alumno103
 */



public class Retiro {
    private double cantidad;
    public Retiro (double cantidad){
        this.cantidad = cantidad;
    }
    public double getCantidad (){
        return cantidad; 
    }
    public void RegistrarRetiro (Cajero cajero) {
    double saldoActual = cajero.getSaldo();
    if (cantidad<=saldoActual){
        double nuevoSaldo = saldoActual - cantidad;
        cajero.setSaldo(nuevoSaldo);
        System.out.println("Retiro de "+ cantidad+"realizado correctamente, su nuevo saldo es de: "+nuevoSaldo);
    }else{
        System.out.println("Fondos insuficientes, su saldo actual es de "+saldoActual);
    }
}   
}
