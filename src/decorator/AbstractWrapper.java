
package decorator;


public abstract class AbstractWrapper implements ProcessingDecorator{
    ProcessingDecorator procDecor;
    
    abstract  public void decorating(); 
    
    public void AbstractWrapper(ProcessingDecorator pd){
        procDecor = pd;
        
    }
    
}
