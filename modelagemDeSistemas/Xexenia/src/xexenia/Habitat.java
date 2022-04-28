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
public class Habitat {
    private Animal animal;
    private Flora flora;
    private Fauna fauna;
    private String tipo;

    public Habitat(Animal animal, String tipo) {
        this.animal = animal;
        this.tipo = tipo;
    }
    public void  inserirFauna(String especie){
        fauna = new Fauna(especie);
    }
    public void inserirPlanta(Planta planta){
       flora = new Flora();
    }
}
