package scanner;

import java.util.Scanner;

public class Scannerss {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("What is your name");
        String nme=sc.next();
        System.out.println("How old you are");
        int age=sc.nextInt();
        System.out.println("What is your hobby");
        String hby= sc.next();
        System.out.println("Thank you "+nme+ ", you are "+age+", years old and hobby is:" +hby);
    }
}
