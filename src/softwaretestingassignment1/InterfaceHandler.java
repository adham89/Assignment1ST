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
public class InterfaceHandler implements DBInterface{
    private DBInterface intF;

    @Override
    public boolean connect(String address, String userName, String password) {
        return getIntF().connect(address, userName, password);
        
    }
    
    public DBInterface getIntF() {
        return intF;
    }

    @Override
    public boolean disconnect() {
      return true ;
    }
    
    @Override
    public boolean isConnected() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public String getName(int id) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
     /**
     * @param intF the intF to set
     */
    public void setIntF(DBInterface intF) {
        this.intF = intF;
    }
    
}
