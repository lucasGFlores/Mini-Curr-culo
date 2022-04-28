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
public class Animal {

    private String especime;
    private String filo;
    private String classe;
    private String ordem;
    private String genero;
    private String familia;
    private String tamanho;
   int idade;
   boolean fome; 

    public Animal(String especime, String filo, String classe, String ordem, String genero, String familia, String tamanho, int idade, boolean fome) {
        this.especime = especime;
        this.filo = filo;
        this.classe = classe;
        this.ordem = ordem;
        this.genero = genero;
        this.familia = familia;
        this.tamanho = tamanho;
        this.idade = idade;
        this.fome = fome;
    }



    public void comer(){
        JOptionPane.showMessageDialog(null,"YUM YUMIIIIIIII");
        fome = false;
    }
    
    }

