/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkgextends;

/**
 *
 * @author DELL
 */
public class Animal {

    /**
     * @param args the command line arguments
     */
    protected int weight;
    protected String name;
    protected int age ;
    protected String email;
    
    protected void saySomething() {
        System.out.println("lalallalalal");
}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

     public void setEmail(String email) {
        this.email = email;
    }
     
    @Override
    public boolean equals(Object otherObj) {
        if(this == otherObj) {
            return true;
        }
        if(otherObj == null) {
            return false;
        }
        if(!(this.getClass() == otherObj.getClass())) {
            return false;
        }
        Animal other = (Animal)otherObj;
            return this.name.equals(other.name) && this.age == other.age 
                    && this.weight == weight;
    }

    
}
