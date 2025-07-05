/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package ura.efris;

/**
 *
 * @author USER
 */
public class Efris {
    

    public static void main(String[] args) {
        //creating array for tax taxcategory
        TaxCategory[] taxCategories = new TaxCategory[3];
          taxCategories[0] = new Retailer();
          taxCategories[1] = new Wholesaler();
          taxCategories[2] = new Importers();
          double amount = 1000.0;
          for (TaxCategory  taxCategory:taxCategories){
        System.out.println("VAT:" +taxCategory.calculateVAT(amount));
          }
    }
}
