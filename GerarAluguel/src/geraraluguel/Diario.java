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
public class Diario extends AluguelDoImovel{ // declarando que a classe tem herança
    protected Pessoa cpf; //declarando as variaveis da classe
    protected Imovel modelo;

    public Diario() { //construtor padrão
    }

    public Diario(Pessoa cpf, Imovel modelo, String tipo, String contratante) {
        super(tipo, contratante); //construtor com herança
        this.cpf = cpf;
        this.modelo = modelo;
    }

    public Pessoa getCpf() {
        return cpf;
    }

    public void setCpf(Pessoa cpf) {
        this.cpf = cpf;
    }

    public Imovel getModelo() {
        return modelo;
    }

    public void setModelo(Imovel modelo) {
        this.modelo = modelo;
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
