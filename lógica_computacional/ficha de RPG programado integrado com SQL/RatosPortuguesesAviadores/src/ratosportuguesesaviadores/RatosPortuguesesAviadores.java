/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ratosportuguesesaviadores;

/**
 *
 * @author lucas_g_flores
 */

public class RatosPortuguesesAviadores {
    private static Cadastro cad;
    public static void main(String[] args) {
        Cadastro tela1 = new Cadastro();
        RatosPortuguesesAviadores.cad = tela1;
        tela1.setVisible(true);
    }
    public static Cadastro retornarTelaCad(){
    return cad;
    }
    
}
