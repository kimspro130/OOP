/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ura.efris;

/**
 *
 * @author USER
 */
public class Wholesaler extends TaxCategory {
    
    public Wholesaler() {
        super(10.0);
    }

    @Override
    public double calculateVAT(double amount) {
        return  amount*(VatRate/100);
    }
    
    
}
