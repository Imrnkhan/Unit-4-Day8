package Question2;

import javax.swing.text.html.StyleSheet;

public interface X {
    void methodX();
    default void mathod1(){
        System.out.println("Inside Default method2 of X");
    }
    static void method2(){
        System.out.println("inside staic method3 of X");
    }
}
