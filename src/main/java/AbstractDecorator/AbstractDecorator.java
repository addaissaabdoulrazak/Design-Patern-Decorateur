
package AbstractDecorator;

import Boisson.AbstractBoisson;

/**
 *
 * Le Décorateur est un patron de conception structurel
 * qui permet d’ajouter dynamiquement de nouveaux comportements à des objets
 * en les plaçant à l’intérieur d’objets spéciaux appelés emballeurs (wrappers).
 * 
 * NB:utiliser ce design pattern Lorsque Vous Voullez Ajouter des Fonctionnalité "Simultannement"./.
 */


public abstract class AbstractDecorator extends AbstractBoisson{
    
    protected AbstractBoisson boisson;

    public AbstractDecorator(AbstractBoisson boisson) {
    
        this.boisson=boisson;
    }
    
     public abstract String getDescription();
    
}
