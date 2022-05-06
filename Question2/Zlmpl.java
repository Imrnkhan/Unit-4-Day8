package Question2;

public class Zlmpl implements Z {

    @Override
    public void methodX() {
        // TODO Auto-generated method stub
        System.out.println("method inside class Zmpl");
        
    }

    @Override
    public void mathodY() {
        // TODO Auto-generated method stub
        System.out.println("method inside  class Zmpl");
        
    }

    @Override
    public void methodZ() {
        // TODO Auto-generated method stub
        System.out.println("method inside Zmpl");
        
    }

    @Override
    public void Method1() {
        // TODO Auto-generated method stub
        System.out.println("method1 inside class Zmpl");
        Z.super.Method1();
    }
    
    
    
}
