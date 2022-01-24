/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Boisson;

/**
 *
 * @author USER-PC
 */

/** 
 * --Je pense qu'il ne sera plus neccerais de declarer un type description et une methodes getDescription il sont Present dans cette Classe mais transparent pour le programeur
      il sont implicite c'est ce qui fait le force de L'heriatage **/
public class Espresso extends AbstractBoisson{

    public Espresso() {
        description = "Boisson Espresso";
    }
    
    
    
    @Override
    public double Cout() {
      return 6;
    }
    
}
