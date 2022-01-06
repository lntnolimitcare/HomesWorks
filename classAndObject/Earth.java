package classAndObject;

public class Earth {
    public static void main(String[] args) {
        Human hu= new Human();
        hu.name="John";
        hu.age=22;
        hu.eyeColor="black";
        hu.hights=41;
        hu.speak();
        hu.work();
        hu.est();
        hu.walk();
        Animal an= new Animal(10,"male",254);
        System.out.println(an.age);
        System.out.println(an.gender);
        System.out.println(an.weights);
        an.eat();
        an.sleep();


    }
}
