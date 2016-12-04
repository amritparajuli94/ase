package ase;

public class DirectDebit extends Payment {

    // attributes
    private int sortCode = 0;
    private int accountNumber = 0;
    private String bankName = null;
    //////default payment//////
    private DirectDebit() {}
    
    ////////constructor//////
    
    public DirectDebit(String date, double amount, int sortCode, int accountNumber,
            String bankName) {
        super(date, amount);
        this.sortCode = sortCode;
        this.accountNumber = accountNumber;
        this.bankName = bankName;
    }

    public int getSortCode() {
        return sortCode;
    }

    public int getAccountNumber() {
        return accountNumber;
    }

    public String getBankName() {
        return bankName;
    }
    
    ////////setter and getter///////
    public String getType() {
        return "DIRECTDEBIT";
    }
}
