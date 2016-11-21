package decorator;


public class Decorator {

  
    public static void main(String[] args) {
        
        ProcessingDecorator pd = new CryDoll(new SportDoll(new SmileDoll(new BasicFigure())));
        pd.decorating();
    }
    
}
