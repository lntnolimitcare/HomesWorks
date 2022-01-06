package staticNonstatic;

public class Execution {
    public static void main(String[] args) {

        StaticAndNonStatic.sum();
        StaticAndNonStatic nc= new StaticAndNonStatic();
        nc.sendMail();
        System.out.println(StaticAndNonStatic.age=21);
    }
}
