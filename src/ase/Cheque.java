package ase;

public class Cheque extends Payment {
    
    ////////default payment///////
    private Cheque() {}
    ////////constructor///////
    public Cheque(String date, double amount) {
        super(date, amount);
    }
    ///////setter and getter///////
    public String getType() {
        return "CHEQUE";
    }
       
}
