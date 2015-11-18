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
public interface DBInterface {
    
     public boolean connect(String address, String userName, String password);
    public boolean disconnect();
    public boolean isConnected();
    public String getName(int id);
    
}
