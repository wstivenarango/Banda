/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda;

import banda.logica.Banda;

/**
 *
 * @author Estudiantes
 */
public class Bandaaleatoria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Banda b = new Banda();
        b.crearBanda();
        System.out.println("afinando la banda");
        b.afinarBanda();
        System.out.println("");
        System.out.println("tocando la banda");
        b.tocarBanda();
    }
    
}
