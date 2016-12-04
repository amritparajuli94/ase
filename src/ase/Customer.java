package ase;

public class Customer {
    ////////attributes///////
    private String name;
    private String email;

    private String address;
    private String postcode;
    private long telephone;
    
    ///////setting a default customer////////
    public Customer(){
        name = "Amrit Parajuli";
        address = "28 Kingston Avenue";
        postcode = "TW14 9SL";
        telephone = 123456;
    }
    
    ////////constructor////////
    public Customer(String name, String email, String address, String postcode, long telephone) {
        this.name = name;
        this.email = email;
        this.address = address;
        this.postcode = postcode;
        this.telephone = telephone;
    }

    //////////getter and setter//////////
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getAddress() {
        return address;
    }
    public void setAddress(String address) {
        this.address = address;
    }
    public String getPostcode() {
        return postcode;
    }
    public void setPostcode(String postcode) {
        this.postcode = postcode;
    }
    public long getTelephone() {
        return telephone;
    }
    public void setTelephone(long telephone) {
        this.telephone = telephone;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getEmail() {
        return email;
    }
}
