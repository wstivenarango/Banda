/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda.logica;

/**
 *
 * @author Estudiantes
 */
public class Bateria implements Instrumento {

      @Override
    public void afinar() {
        System.out.println("afinando Bateria");
    }

    @Override
    public void tocar() {
        System.out.println("tocando Bateria");
    }
    
}
