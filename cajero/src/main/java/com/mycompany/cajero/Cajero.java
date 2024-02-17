/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.cajero;
import java.util.Scanner;
/**
 *
 * @author Alumno103
 */
public class Cajero {
    private double saldo;
    
    public Cajero (double saldoInicial){
        this.saldo = saldoInicial;
    }
    public double getSaldo(){
        return saldo;
    }
    public void setSaldo(double saldo){
        this.saldo=saldo;
    }
    public static void main(String[] args) {
        Cajero cajero = new Cajero(1000.00);
        System.out.println("que desea hacer? seleccione 1.-Para consulta de saldo y 2.- Para retirar");
        Scanner sc = new Scanner (System.in);
        int var = sc.nextInt();
        if (var == 1){
            System.out.println("ingrese la cantidad a retirar ");
            int var1 = sc.nextInt();
            Retiro retiro = new Retiro (var1);
            retiro.RegistrarRetiro(cajero);
        }else if (var == 2){
            Consulta_saldo consulta = new Consulta_Saldo ();
            consulta.mostrar(cajero);
        }
    }
}
