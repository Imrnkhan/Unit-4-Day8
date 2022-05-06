package Question2;

import java.lang.reflect.Method;

public interface Y {
    void mathodY();
    default void Method1(){
        System.out.println("inside Default method2 of Y");
    }
    static void method2(){
        System.out.println("inside static method 3 of Y");
    }
}
