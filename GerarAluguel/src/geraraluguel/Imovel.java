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
public class Imovel {
 protected String preco; //declarando as variaveis da classe
 protected String CEP;
 protected String endereco;

 public Imovel(){ //construtor padrão
 }
 
public Imovel(String preco, String CEP, String endereco) {
    this.preco = preco;
    this.CEP = CEP;
    this.endereco = endereco;
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
        return "Imovel{" + "preco=" + preco + ", CEP=" + CEP + ", endereco=" + endereco + '}';
    }

    void add(Imovel imovel) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
