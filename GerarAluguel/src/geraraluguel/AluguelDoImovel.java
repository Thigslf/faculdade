/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geraraluguel;

/**
 *
 * @author USER
 */
public class AluguelDoImovel {
    protected String tipo; //declarando as variaveis da classe
    protected String contratante;

 public AluguelDoImovel(){ //construtor padrão
 }   
    
public AluguelDoImovel(String tipo, String contratante) {
    this.tipo = tipo;
    this.contratante = contratante;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getContratante() {
        return contratante;
    }

    public void setContratante(String contratante) {
        this.contratante = contratante;
    }  
}
