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
public class Funcionario extends Pessoa { 

  
// declarando que a classe tem herança
    protected int id; //declarando as variaveis da classe
    protected String cargo;
    protected Double salario;

    public Funcionario() { //construtor padrão
    }

    public Funcionario(int id, String cargo, Double salario, String nome, String CPF, int idade, String nacionalidade) {
        super(nome, CPF, idade, nacionalidade); //construtor com herança
        this.id = id;
        this.cargo = cargo;
        this.salario = salario;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public Double getSalario() {
        return salario;
    }

    public void setSalario(Double salario) {
        this.salario = salario;
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
        return "Funcionario{" + "id=" + id + ", cargo=" + cargo + ", salario=" + salario + '}';
    }

    
    
}
