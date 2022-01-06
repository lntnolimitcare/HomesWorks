package execution;

import abstruction.TestShape;
import classAndObject.Human;
import encaptulation.EmployeeData;
import interfacess.UssBank;
import interfacess.WellsFargoAndUssBank;
import polymorphisms.Bmw;
import polymorphisms.Car;


public class AllExecution {
    public static void main(String[] args) {
        System.out.println("Encaptulation Starts----------------");
        EmployeeData emd= new EmployeeData();
        emd.setSsn(140012);
        emd.setSalary(1235.02);
        emd.setHeadOffice("NY");
        emd.setName("John");
        System.out.println(emd.getName()+", "+emd.getSsn()+", "+emd.getSalary()+" ,"+emd.getHeadOffice());
        System.out.println("Encaptulation end -------------------");
        System.out.println("===========Interface Starts==========");
        WellsFargoAndUssBank wellUss= new WellsFargoAndUssBank();
        wellUss.detit();
        wellUss.credit();
        wellUss.transferMoney();
        wellUss.carLoan();
        wellUss.homeLoan();
        wellUss.educationLoan();
        wellUss.insurancePolicySell();
        wellUss.stockTradingOpton();
        System.out.println(UssBank.minBalance);// this variable is written inside interface
        // all interface variable/class are Staric in nature;
        System.out.println("===========Interface end==============");
        System.out.println("***********Abstruction Starst");
        TestShape ts= new TestShape();
        ts.fill();
        ts.drawing();
        System.out.println("*************Abstruction Ends");
        System.out.println("Static polymorphysim starts----");
        Bmw bw= new Bmw();
        //when same method present parent class as well as child class with the sname name
        //same number of arguments is calld overriding
        bw.starts();// in bmw class and car class both they have starts method,
        //when same method exist in child class and parent class in the time of execution
        //child class method will be executed.
        bw.stop();
        bw.refuels();
        bw.theftSefty();
        bw.engine();
        System.out.println("Car class method is executing");
        Car cr= new Car();
        cr.refuels();
        cr.starts();
        cr.starts();
        cr.engine();
        // here we can use theftSefty method by creating car class object because parent
        //can not inherit child property .
        System.out.println("Dynamic polymorphism-----------");
        Car crs= new Bmw();// child class object can be referred by parent class reference
        // variable is called  dynamic pylymorphism.
        crs.starts();
        crs.refuels();
        crs.starts();
        System.out.println("Class and Object--------------");
        Human hm= new Human();
        hm.speak();
        hm.est();
        hm.walk();
        hm.work();

    }
}
