
package AbstractDecorator;

import AbstractDecorator.AbstractDecorator;
import Boisson.AbstractBoisson;

/**
 *
 * @author Adda-Issa-Abdoul-Razak
 */
/*
* Toutes Les Classe qui Herite de la classe Decorator sont des Decorator et herite de façon abstraite du type "AbstractBoisson boisson"
                                                                                                                               --------
*/
public class Chocollat extends AbstractDecorator {

    public Chocollat(AbstractBoisson boisson) {
        super(boisson);
    }

    @Override
    public double Cout() {
       return boisson.Cout()+2;
    }

    @Override
    public String getDescription() {
        
      return   boisson.getDescription()+ " Au Chocollat";
       
    }
    
    
}
