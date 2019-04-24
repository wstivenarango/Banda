/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banda.logica;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Random;

/**
 *
 * @author Estudiantes
 */
public class Banda {
    
    ArrayList<Musico> musicos = new ArrayList<Musico>();
    
    public void crearBanda(){
        Random r = new Random();
        int cantidad = r.nextInt(20);
        System.out.println("La banda esta conformada por " + cantidad + " musicos");
        for (int i = 0; i < cantidad; i++) {
           musicos.add(new Musico()); 
        }
        for (Iterator<Musico> iterator = musicos.iterator(); iterator.hasNext();) {
            Musico next = iterator.next();
            next.asignarInstrumento(this.generarInstrumento(r.nextInt(8)));
            
        }
    }
    
    public void afinarBanda(){
        for (Iterator<Musico> iterator = musicos.iterator(); iterator.hasNext();) {
            Musico next = iterator.next();
            next.afinarInstrumento();
        }
    }
    
    public void tocarBanda(){
        for (Iterator<Musico> iterator = musicos.iterator(); iterator.hasNext();) {
            Musico next = iterator.next();
            next.tocarInstrumentos();
        }
    }
    
    private Instrumento generarInstrumento(int aleatorio){
        switch(aleatorio){
            case 1:
                return new Guitarra();
            case 2:
                return new Violin();
            case 3:
                return new Guacharaca();
            case 4:
                return new Flauta();
            case 5:
                return new Piano();
            case 6:
                return new Acordeon();
            case 7:
                return new Bateria();
            default:
                return new Maracas();
        }
    }
}
