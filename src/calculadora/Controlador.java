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
public class Controlador{
    
    private Vista view;
    private Modelo mod;
    
    
    public Controlador(){
        view=new Vista();
        mod=new Modelo();
    }
    
}
