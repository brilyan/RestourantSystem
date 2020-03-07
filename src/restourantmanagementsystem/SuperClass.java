/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package restourantmanagementsystem;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author Brily Branco
 */
public class SuperClass {
    
    public double FiletOfFish;
    public double Chickenburger;
    public double Chickenlegend;
    public double ChickenBurgerMeal;
    public double BaconAndCheseBurger;
    
    public double MilkShake;
    public double vanillacone;
    public double ClassicVanilla;
    public double VanillaMilkShake;
    public double ChocolateMilkShake;
    
    public double Meals;
    public double Drink;
    public double Subtotal;
    public double Alltotal;
    
    public double Dapatkanjunlah(){
        Meals=FiletOfFish+Chickenburger+Chickenlegend+ChickenBurgerMeal+BaconAndCheseBurger;
        Drink=MilkShake+vanillacone+ClassicVanilla+VanillaMilkShake+ChocolateMilkShake;
        Subtotal=Meals+Drink;
        Alltotal=Subtotal;
        
        return Alltotal;
    }
    
    private JFrame jframe;
    
    public void Keluar(){
        jframe=new JFrame("Exit");
        
        if(JOptionPane.showConfirmDialog(jframe,"Yakin Ingin Keluar?","Restourant Management System",JOptionPane.YES_NO_OPTION)==JOptionPane.YES_NO_OPTION){
            System.exit(0);
        }
    }
    
    //============Harga============
    public double  hargaFiletOfFish=25.000;
    public double hargaChickenburger=20.000;
    public double hargaChickenlegend=35.000;
    public double hargaChickenBurgerMeal=18.000;
    public double hargaBaconAndCheseBurger=17.000;
    
    public double hargaMilkShake=12.000;
    public double hargavanillacone=15.000;
    public double hargaClassicVanilla=16.000;
    public double hargaVanillaMilkShake=20.000;
    public double hargaChocolateMilkShake=25.000;
    
    public double mctax= 0.90;
    
    public double cFindTax(double Camount){
        
        double FindTax=Camount-(Camount*mctax);
        return FindTax;
    }
    
    
}
