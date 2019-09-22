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
public class Cliente extends Pessoa{ // declarando que a classe tem herança
    protected String id_cliente; //declarando as variaveis da classe
    protected String telefone;

    public Cliente() {  //construtor padrão  
    }

    public Cliente(String id_cliente, String telefone, String nome, String CPF, int idade, String nacionalidade) {
        super(nome, CPF, idade, nacionalidade); //construtor com herança
        this.id_cliente = id_cliente;
        this.telefone = telefone;
    }

    public String getId_cliente() {
        return id_cliente;
    }

    public void setId_cliente(String id_cliente) {
        this.id_cliente = id_cliente;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNacionalidade() {
        return nacionalidade;
    }

    public void setNacionalidade(String nacionalidade) {
        this.nacionalidade = nacionalidade;
    }    

    @Override
    public String toString() {
        return "Cliente{" + "id_cliente=" + id_cliente + ", telefone=" + telefone + '}';
    }    

    void add(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setNome1(String nome1) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    void setCpf(String cpf) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

}
