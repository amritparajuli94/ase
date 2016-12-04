
package ase;


public class SaxonSystemApp {

    
    //SystemControl systemControl = new SystemControl();
    
    public static void main(String[] args) {
        SaxonSystem saxon = new SaxonSystem();
        
        
        Customer testCustomer = new Customer("Bob", "test@test.com", "sds", "ub1", 934093049);
        saxon.addCustomer(testCustomer);
        
        Payment directDebit = new DirectDebit("12/10/2016", 10, 101010, 12345678, "Barclays");
        Payment cheque = new Cheque("12/10/2016", 50.00);
        
        saxon.requestMemberShip("Bob", "test@testa.com", "dgdgd", "sdsds", 808090, cheque);
        
        saxon.requestMemberShip("Bob", "test@testa.com", "dgdgd", "sdsds", 808090, directDebit);
        
    }
    
}
