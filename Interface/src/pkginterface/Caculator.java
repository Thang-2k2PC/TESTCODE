/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkginterface;

/**
 *
 * @author DELL
 */
public interface Caculator extends Repeatable {
    int add(int a, int b);
    int sub(int a, int b);
    int mul(int a, int b);
    int div(int a, int b);
    default void Show(int a, int b ) {
        
    System.out.println(a + " + " + b + " = " + add(a, b));
    }
}
