
package decorator;


public class BasicFigure implements ProcessingDecorator{

    @Override
    public void decorating() {
        System.out.println("I am basic figure");
    }
    
}
