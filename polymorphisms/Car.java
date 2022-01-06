package polymorphisms;

public class Car extends Vehicle {// vichale is grand parent , car parent , bmw is child
    public void starts(){
        System.out.println("Car Starts ---car class");
    }
    public void stop(){
        System.out.println("Car stops---car class");
    }
    public void refuels(){
        System.out.println("Car refuels ---car class");
    }

}
