package ase;

public class SystemControl {
    
    public SystemControl(){
        
    }
    
    public String get_membership_request(int id, String name) {
    
        if (check_membership_id(id)) {
            return "You are already a member.";
        } else {
            return "todo";
            // register_new_member()
            // return "You have been registered"
        }
    }
    
    private boolean check_membership_id(int membership_id) {
        return true;
    }

    
    
}
