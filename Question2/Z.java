package Question2;

public interface Z extends X,Y {
    void methodZ();

    @Override
    default void Method1() {
        // TODO Auto-generated method stub
        System.out.println("inside Z interface");
        X.super.mathod1();
        Y.super.Method1();
        X.method2();
        Y.method2();
        
    }

    public static void main(String[] args) {
        
    }
    
    
}
