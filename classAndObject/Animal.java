package classAndObject;

import java.security.PublicKey;

public class Animal {
    int age;
    String gender;
    int weights;
    public Animal(int age,String gender,int weights){
        this.age=age;
        this.gender=gender;
        this.weights=weights;
    }
    public void eat(){
        System.out.println("Eating.......");
    }
    public void sleep(){
        System.out.println("Sleeping..........");
    }
}
