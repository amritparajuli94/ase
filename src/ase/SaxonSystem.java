package ase;

import java.util.ArrayList;


public class SaxonSystem {
    ////////creating a arraylist of the customer//////
    ArrayList<Customer> members;
    private static double membershipFee = 120;

    
    
    public SaxonSystem() {
        members = new ArrayList<Customer>();
    }
    
    
    public boolean requestMemberShip(String name, String email, String address, String postcode,
            long telephone, Payment paymentType) {
        //checking true/false
        boolean exists = checkCustomerExists(email);
        //already a memeber 
        if (exists) {
            System.err.println("Sorry you are already a memeber in the system.");
            return false;
        } else {
            //add a new customer
            System.out.println();
            System.out.println("**********************************************");
            System.out.println("Adding new customer!");
            System.out.println();
            Customer c = new Customer(name, email, address, postcode, telephone);
            if (paymentType.getType().equals("CHEQUE")){
                double paymentAmount = paymentType.getAmount();
            
                if (paymentAmount == membershipFee) {
                    addCustomer(c);
                    System.out.println("Thankyou, We have recieved your payment.\n"
                            + "!!Welcome Onboard!!");
                    return true;
                }
                else {
                  System.out.println("Sorry registration process got cancelled.\n"
                        + "The membership fee is " + membershipFee + ".\n"
                        + "Your cheque amount is: " + paymentAmount);
                  return false;
                }
            } else if (paymentType.getType().equals("DIRECTDEBIT")){
                DirectDebit payment = (DirectDebit) paymentType;
                if (payment.getAccountNumber() == 0 || payment.getSortCode() == 0
                        || payment.getBankName() == null){
                    System.out.println("Sorry registration process failed.\n"
                            + "Your payment detail is incomplete.");
                    return false;
                } else {
                    addCustomer(c);
                    System.out.println("Thank you! You are registered in our system.");
                    return true;
                }
            } else {
                System.out.println("Registrtion failed due to unknown reason");
                return false;
            }
        }
        
    }
   //check email against the customer array list
    public boolean checkCustomerExists(String email) {
        for (Customer customer : members) {
            if (email.equals(customer.getEmail())) {     
                return true;    
            }
        }
        return false;
    }
//adding customer to the arraylist
    public void addCustomer(Customer customer) {
        members.add(customer);
    } 
}
