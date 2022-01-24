
package AbstractDecorator;

import Boisson.AbstractBoisson;

/**
 *
 * @author Adda-Issa-Abdoul-Razak
 */
/*
* Toutes Les Classe qui Herite de la classe Decorator sont des Decorator et herite de façon abstraite du type "AbstractBoisson boisson"
                                                                                                                               --------
*/

public class Caramel extends AbstractDecorator{

    public Caramel(AbstractBoisson boisson1) {
        super(boisson1);
    }
    


    @Override
    public String getDescription() {
       return  boisson.getDescription()+" Au caramel";
    }

    @Override
    public double Cout() {
     
        return 10+ boisson.Cout();
    }
    
}
