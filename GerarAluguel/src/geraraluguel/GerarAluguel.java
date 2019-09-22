/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package geraraluguel;

import java.util.ArrayList;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.PLAIN_MESSAGE;
import static javax.swing.JOptionPane.QUESTION_MESSAGE;

/**
 *
 * @author USER
 */
public class GerarAluguel {

	
    public static void main(String[] args) {

        // chamada de metodos com polimorfismo     
        ArrayList <Pessoa> funcionarios = new ArrayList <> ();
        ArrayList <Pessoa> clientes = new ArrayList <> ();
        ArrayList <Imovel> imoveis = new ArrayList <> ();
        ArrayList <AluguelDoImovel> alugueis = new ArrayList <> ();
        int  x = 0;
        
            do{
                try {  
                    x = Integer.parseInt(JOptionPane.showInputDialog("Menu: " // menu com as escolhas que o usuario podera acessar
                           + "\n 1 - Cadastrar Funcionario."  
                           + "\n 2 - Cadastrar Cliente."
                           + "\n 3 - Cadastrar Imovel."
                           + "\n 4 - Criar ALuguel."                
                           + "\n 5 - Sair."));  
                   switch (x){
                       case 1: //cadastro do funcionario da imobiliaria
                           Funcionario funcionario = new Funcionario();
                           JOptionPane.showMessageDialog(null,"A opção é Cadastro Funcionario","Cadastro funcionario",PLAIN_MESSAGE);
                           String nome = JOptionPane.showInputDialog(null, "Qual o seu nome?","Cadastro funcionario",QUESTION_MESSAGE);
                           funcionario.setNome(nome);
                           String CPF = JOptionPane.showInputDialog(null, "Qual o seu CPF?","Cadastro funcionario",QUESTION_MESSAGE);
                           funcionario.setCPF(CPF);
                           String id = JOptionPane.showInputDialog(null, "Qual o seu ID?","Cadastro funcionario",QUESTION_MESSAGE);
                           funcionario.setId(Integer.parseInt(id));
                           String cargo = JOptionPane.showInputDialog(null, "Qual o seu cargo?","Cadastro funcionario",QUESTION_MESSAGE);
                           funcionario.setCargo(cargo);
                           funcionarios.add(funcionario);
                           System.out.println(funcionario.toString());
                           break;
                       case 2: //cadastro do clinete da imobiliaria
                            Cliente cliente = new Cliente();
                            JOptionPane.showMessageDialog(null,"A opção é Cadastro Cliente","Cadastro cliente",PLAIN_MESSAGE);
                            String nome1 = JOptionPane.showInputDialog(null, "Qual o seu nome?","Cadastro cliente",QUESTION_MESSAGE);
                            cliente.setNome1(nome1);
                            String cpf = JOptionPane.showInputDialog(null, "Qual o seu CPF?","Cadastro funcionario",QUESTION_MESSAGE);
                            cliente.setCpf(cpf);
                            String id_cliente = JOptionPane.showInputDialog(null, "Qual o seu ID?","Cadastro cliente",QUESTION_MESSAGE);
                            cliente.setId_cliente(id_cliente);
                            String telefone = JOptionPane.showInputDialog(null, "Qual o seu telefone?","Cadastro cliente",QUESTION_MESSAGE);              
                            cliente.setTelefone(telefone);
                            cliente.add(cliente);
                            System.out.println(cliente.toString());
                            break;
                       case 3: //cadastro dos imoveis da imobiliaria
                            Imovel  imovel = new Imovel();                            
                            JOptionPane.showMessageDialog(null,"A opção é Cadastro Imovel","Cadastro imovel",PLAIN_MESSAGE);           
                            String CEP =JOptionPane.showInputDialog(null, "Qual o CEP?","CCadastro imovel",QUESTION_MESSAGE);
                            imovel.setCEP(CEP);
                            String endereco =JOptionPane.showInputDialog(null, "Qual o endereço?","Cadastro imovel",QUESTION_MESSAGE);              
                            imovel.setEndereco(endereco); 
                            imovel.add(imovel);
                            System.out.println(imovel.toString());                            
                            break;
                       case 4: // criação do aluguel do imovel
                            JOptionPane.showMessageDialog(null, "Criar ALuguel");
                           // para saber qual imovel está sendo alugado
                           x = Integer.parseInt(JOptionPane.showInputDialog("A escolha foi: \n 1 - Casa. \n 2 - Apartamento."));
                               switch (x){
                                case 1: // ao escolher o aluguel da casa
                                     
                                    Casa casa = new Casa();                                    
                                    JOptionPane.showMessageDialog(null,"A escolha foi Casa","Cariar aluguel",PLAIN_MESSAGE);
                                    String preco = JOptionPane.showInputDialog(null, "Qual o valor?","Cadastro cliente",QUESTION_MESSAGE);    
                                    casa.setPreco(preco);                                    
                                    System.out.println(casa.toString());        
                                    break;
                                case 2: // ao escolher o aluguel do apartamento                                    
                                    Apartamento apartamento = new Apartamento();
                                    JOptionPane.showMessageDialog(null,"A escolha foi Apartamento","Cariar aluguel",PLAIN_MESSAGE);
                                    String preco1 = JOptionPane.showInputDialog(null, "Qual o valor?","Cadastro cliente",QUESTION_MESSAGE); 
                                    apartamento.setPreco(preco1);                                    
                                    System.out.println(apartamento.toString());  
                                    break;
                                   default:  // apareça quando errar entre 1 a 2
                                       JOptionPane.showMessageDialog(null, "Opção invalida!");
                                   break;
                           }                   
                           break;    
                       case 5: // finalizamento do menu
                            JOptionPane.showMessageDialog(null, "Menu encerrado."); 
                           break;    
                       default: // apareça quando errar entre 1 a 5
                               JOptionPane.showMessageDialog(null, "Opção invalida!");
                   }
            
            } catch (Exception e) { // entre o try e o catch se orrocer algum erro vai pro e.printStackTrace que vai apresentar o erro
                e.printStackTrace(); // apresenta o erro
                JOptionPane.showMessageDialog(null, "Deu erro");
            }
            
            }while (x != 5); // contador igual ao valor de opções    
                      
    }  
}


    

