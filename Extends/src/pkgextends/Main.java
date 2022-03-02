    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgextends;

import javafx.animation.AnimationTimer;

/**
 *
 * @author DELL
 */
public class Main {
    public static void main(String[] args) {
       Animal tom = new Animal();
       tom.setName("Tom");
       tom.setAge(3);
       tom.setWeight(5);
       
       Animal jerry = new Animal();
       jerry.setName("Tom");
       jerry.setAge(3);
       jerry.setWeight(5);
       
        System.out.println(tom.equals(tom));
    }
}
