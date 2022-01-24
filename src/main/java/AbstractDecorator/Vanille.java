
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
public class Vanille extends AbstractDecorator {

    public Vanille(AbstractBoisson boisson) {
        super(boisson);
    }

    
    
    @Override
    public double Cout() {
      return 10+ boisson.Cout();
    }

    @Override
    public String getDescription() {
        
        return boisson.getDescription()+" Au Vanille";
    }
    
}
