package interfacess;

public class WellsFargoAndUssBank implements UssBank,WellsFargoBank{
    @Override
    public void detit() {
        System.out.println("UssBank debit method");
    }

    @Override
    public void credit() {
        System.out.println("UssBank credit method");
    }

    @Override
    public void transferMoney() {
       System.out.println("UssBank Transfermoney method");
    }

    @Override
    public void educationLoan() {
        System.out.println(" Wellsfargo edu loan");
    }

    @Override
    public void homeLoan() {
        System.out.println("Wellsfargo Home loan");
    }

    @Override
    public void carLoan() {
       System.out.println("Wells fargo car loan");
    }
    public void stockTradingOpton(){
        System.out.println("Stock Trading method");
    }
    public void insurancePolicySell(){
        System.out.println("Insurance Sells");
    }
}
