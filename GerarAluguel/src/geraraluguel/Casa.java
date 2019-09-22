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
public class Casa extends Imovel{ // declarando que a classe tem herança
    protected Double tamanho; //declarando as variaveis da classe
    protected double largura;
    protected int quarto;

    public Casa() { //construtor padrão
    }

    public Casa(Double tamanho, double largura, int quarto, String preco, String CEP, String endereco) {
        super(preco, CEP, endereco); //construtor com herança
        this.tamanho = tamanho;
        this.largura = largura;
        this.quarto = quarto;
    }

    public Double getTamanho() {
        return tamanho;
    }

    public void setTamanho(Double tamanho) {
        this.tamanho = tamanho;
    }

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        this.largura = largura;
    }

    public int getQuarto() {
        return quarto;
    }

    public void setQuarto(int quarto) {
        this.quarto = quarto;
    }

    public String getpreco() {
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
        return "Casa{" + "tamanho=" + tamanho + ", largura=" + largura + ", quarto=" + quarto + '}';
    }
    
}
