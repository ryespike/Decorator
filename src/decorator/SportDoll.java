/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decorator;

/**
 *
 * @author Artyom
 */
public class SportDoll extends AbstractWrapper{

    SportDoll(ProcessingDecorator pr)
    {
       procDecor = pr;
    }
    
    @Override
    public void decorating() {
         System.out.println("I am sport doll. Decorating:");
        procDecor.decorating();
    }
    
}
