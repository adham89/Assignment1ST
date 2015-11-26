/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package softwaretestingassignment1;

/**
 *
 * @author ad
 */
public class BankLoan {
    
    public Person person;
    
    public Person getPerson(){
        return person;
    }
    
    
        /**
     * @param person the person to set
     */
    public void setPerson(Person person) {
        if(person.isPersonOver18()){
            if(person.PersonHighSalary()){
                   this.person = person;
                    }
            else{
                throw new IllegalArgumentException("no enough salary");
            }
            
        }
        else{
            throw new IllegalArgumentException(" not old enough");
        }
        
    }
}
