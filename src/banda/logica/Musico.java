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
public class Musico {
    
    private Instrumento instrumento;
    
    public void asignarInstrumento(Instrumento i){
        this.instrumento = i;
    }
    public void afinarInstrumento(){
        this.instrumento.afinar();
    }
    public void tocarInstrumentos(){
        this.instrumento.tocar();
    }
}
