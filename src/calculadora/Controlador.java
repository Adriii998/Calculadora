/*
 * 
 * By  Adrian Garcia San Jose.
 * 
 */
package calculadora;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * @author adri
 */
public class Controlador implements ActionListener {
    
    private Vista view;
    private Modelo mod;
    
    
    public Controlador(){
        view=new Vista();
        mod=new Modelo();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    
}
