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
public class Apartamento extends Imovel{ // declarando que a classe tem herança
    protected String andar; //declarando as variaveis da classe
    protected String proprietario;
    protected String condominio;

    public Apartamento() { //construtor padrão
    }

    public Apartamento(String andar, String proprietario, String condominio, String preco, String CEP, String endereco) {
        super(preco, CEP, endereco); //construtor com herança
        this.andar = andar;
        this.proprietario = proprietario;
        this.condominio = condominio;
    }

    public String getAndar() {
        return andar;
    }

    public void setAndar(String andar) {
        this.andar = andar;
    }

    public String getProprietario() {
        return proprietario;
    }

    public void setProprietario(String proprietario) {
        this.proprietario = proprietario;
    }

    public String getCondominio() {
        return condominio;
    }

    public void setCondominio(String condominio) {
        this.condominio = condominio;
    }

    public String getPreco() {
        return preco;
    }

    public void setPreco(String preco) {
        this.preco = preco;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String CEP) {
        this.CEP = CEP;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    } 

    @Override
    public String toString() {
        return "Apartamento{" + "andar=" + andar + ", proprietario=" + proprietario + ", condominio=" + condominio + '}';
    }
    
}
