package classAndObject;

public class Human {
    /*
    class basically contains instructions for how object should be created , how they
    should behave in the application, a class is basically a specification,
     */
    String name;
    int age;
    int hights;
    String eyeColor;
    public Human(){
        // this method construct human object
    }
    public void speak(){
        System.out.println(" hello my name is :"+name);
        System.out.println("I am  "+hights+ " inches tall");
        System.out.println("I am "+age+" years old");
        System.out.println("My eye color is : "+eyeColor);
    }
    public void est(){
        System.out.println(" Human eats........");
    }
    public void walk(){
        System.out.println("Walking.....");
    }
    public void work(){
        System.out.println("Working.......");
    }
}
