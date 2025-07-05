/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ura.efris;

/**
 *
 * @author USER
 */
public class TaxCategory {
    double VatRate;
    // contructorto set the VAT RATE

    public TaxCategory(double VatRate) {
        this.VatRate = VatRate;
    }
    // METHOD TO CALCULATE VATRATE 
    public double calculateVAT(double amount){
        return amount*(VatRate/100);
    }
}
