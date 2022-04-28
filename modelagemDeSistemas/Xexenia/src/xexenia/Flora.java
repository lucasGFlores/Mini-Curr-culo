/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xexenia;
import java.util.ArrayList; 
/**
 *
 * @author lucas_g_flores
 */
public class Flora {
    ArrayList<Planta> pranta = new ArrayList<Planta>();
    private Planta planta;

    public Flora() {
    }
    public void adicionarPlanta(Planta planta){
        pranta.add(planta);
}    
}
