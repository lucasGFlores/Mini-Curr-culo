/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package xexenia;

import javax.swing.JOptionPane;

/**
 *
 * @author lucas_g_flores
 */
public class Fauna {
    private Animal animal;
    private String especie;
    

    public Fauna(String especie) {
        this.especie = especie;
    }
    public void criarAnimal(){
        
        String especime = JOptionPane.showInputDialog(null,"nome da espécie");
        String filo = JOptionPane.showInputDialog(null,"filo do animal");
        String classe = JOptionPane.showInputDialog(null,"A classe da espécie");
        String ordem = JOptionPane.showInputDialog(null,"ordem da espécie");
        String genero = JOptionPane.showInputDialog(null,"O gênero da espécie");
        String familia = JOptionPane.showInputDialog(null,"A fámilia da espécie");
        String tamanho = JOptionPane.showInputDialog(null,"tamanho em cm da espécie");
        int idade = Integer.parseInt(JOptionPane.showInputDialog(null,"idade do animal"));
        boolean fome = false;
        animal = new Animal(especime,filo,classe,ordem,genero,familia,tamanho,idade,fome);
        
    }
    public void list(){
    JOptionPane.showMessageDialog(null,animal);
    }
}
