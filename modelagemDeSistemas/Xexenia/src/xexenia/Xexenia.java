/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xexenia;

/**
 *
 * @author lucas_g_flores
 */
public class Xexenia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
      Habitat habitat;
      Animal animal;
      animal = new Animal("Jacaré","Chordata","Reptilia","Crocodylia","Alligator","Alligatoridae","2 metros",12,false);
        habitat = new Habitat(animal,"Pantanal");
    }
    
}
