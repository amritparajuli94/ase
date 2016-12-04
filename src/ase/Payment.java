package ase;

public abstract class Payment {
///////attributes//////////
    private String type;
    private String date;
    private double amount;
    
    ///////setting a default Payment////////
    public Payment() {
        type = "Direct Debit";
        date = "11/11/2016";
        amount = 20.00;
    }
    //////constructor///////
    public Payment(String date, double amount) {
        this.date = date;
        this.amount = amount;
    }
    ////////setter and getter///////
    public abstract String getType();
    
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public double getAmount() {
        return amount;
    }
    public void setAmount(double amount) {
        this.amount = amount;
    }
}
