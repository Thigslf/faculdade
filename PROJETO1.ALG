Algoritmo "Projeto1"
// CPD   : 045094
// Autor(a)    : Thiago Lacerda Freitas
// Data atual  : 13/04/2019
Var
   // Se��o de Declara��es das vari�veis
   opcao : inteiro
   numero1,numero2 : inteiro//op��o1
   divisao: real//op��o1
   contador, pessoas,idade,sexo,maxM,maxF,totalM: inteiro// op��o2
   totalF,maxP: inteiro//op��o2
   mediaP, mediaM,mediaF : real//op��o2
   contador1,contador2,numero,primo: inteiro//op��o3
   soma: real//op��o3
   numeroMax, contador3 : inteiro //op��o4
   soma1,numero3,maior,menor,media : real//op��o4
   morse : inteiro//op��o5
   contador4, contador5, numeroMax1, n, binario : inteiro//op��o6
   decimal : real//op��o6
   y: caracter//opc�o6
Inicio
   // Se��o de Comandos, procedimento, fun��es, operadores, etc...
   repita
         escreval
         escreval("      MENU  ")
         escreval("1.Divis�o")
         escreval("2.Faixa Et�ria")
         escreval("3.N�meros Primos")
         escreval("4.Retornar o Maior,Menor,M�dia")
         escreval("5.C�digo Morse")
         escreval("6.Mudan�a de Base")
         escreval("7.Sair")
         escreval
         escreval("Digite o n�mero desejado")
         leia(opcao)
         escreval
      escolha(opcao)
         caso 1
              limpatela//Limpar a Tela
              escreval("Divis�o")
              escreval("Entre com o dividendo")// numero que ser� dividido
              leia(numero1)
              escreval("Entre com o divisor")// numero que sera o divisor
              leia(numero2)
              divisao <- numero1/numero2// dividendo divido pelo divisor
              escreval("O resultado da divis�o foi",divisao)// mostrando o resultado do calculo dividendo divido por divisor
         caso 2
              limpatela//Limpar a Tela
              maxP <- 0//Limpando variaveis
              maxM <- 0//Limpando variaveis
              maxF <- 0//Limpando variaveis
              totalM <- 0//Limpando variaveis
              totalF <- 0//Limpando variaveis
              mediaP <- 0//Limpando variaveis
              mediaM <- 0//Limpando variaveis
              mediaF <- 0//Limpando variaveis
              contador <- 1
              escreval("Faixa Et�ria")
              escreval("Digite a quantidade de pessoas:")
              leia(pessoas)
              repita
                     escreval("Digite a idade da", contador, "� pessoa:")// indicara por meio de classifica��o qual pessoa o usuario colocara a idade
                     leia(idade)
                     maxP <- maxP + idade
                     escreval("Digite (1) para Masculino e (2) para Feminino")//momento em que o usuario indicara o sexo da pessoa
                     leia(sexo)
                     se (sexo = 1) entao
                        totalM <- totalM + 1
                        maxM <- maxM + idade
                     senao
                        se (sexo = 2) entao
                           totalF <- totalF + 1
                           maxF <- maxF + idade
                        senao
                           repita
                              escreval("Informe o valor verdadeiro para sexo")
                              escreval("Digite (1) para Masculino e (2) para Feminino")
                              leia(sexo)
                           ate (sexo = 1) ou (sexo = 2)//o algoritmo s� ira fazer as contas da idade apartir do momento que o suario indicar 1 ou 2
                        fimse
                     fimse
                     contador <- contador + 1
              ate (contador > pessoas)// encerrar� o algoritmo  no momento em que o contador for maior que o numero de pessoas indicadas
              mediaP <- maxP / pessoas
              se(maxM > 0) entao
                  mediaM <- maxM / totalM
              fimse
              se (maxF > 0) entao
                  mediaF <- maxF / totalF
              fimse
              escreval("M�dia de todas as pessoas: ", mediaP)
              escreval("M�dia de todos do sexo masculino: ", mediaM)
              escreval("M�dia de todas do sexo feminino: ", mediaF)
         caso 3
              limpatela//Limpar a Tela
              escreval("N�meros Primos")
              escreval("Digite at� o n�mero que quer a soma dos inteiros:")
              leia(numero)
              se( numero > 0)entao
                  soma <- 0//limpando variavel
                  para contador1 de 1 ate numero faca
                     primo <- 0//limpando variavel
                     para contador2 de 1 ate contador1 faca
                          se (contador1 mod contador2=0)entao
                             primo <- primo + 1
                          fimse
                     fimpara
                     se (primo =2) entao
                        soma <- soma + contador1
                     fimse
                 fimpara
              fimse
              escreval("A soma dos primos �:", soma)
         caso 4
              limpatela//Limpar a Tela
              escreval("Retornar o Maior,Menor,M�dia")
              escreval("Digite a quantidade de numeros:")
              leia(numeroMax)
              contador3 <- 0//limpando variavel
              repita
                 escreval("Digite o numero: ")
                 leia(numero3)
                 se numero3 > maior entao// se o numero for maior que o numero que j� estava l� ent�o ele vai ocupar o lugar de maior numero
                    maior <- numero3
                 fimse
                 se (numero3 > 0) e ((numero3 < menor) ou (menor = 0)) entao// se o numero for menor que o menor que j� estava l� ent�o ele vai ocupar o lugar de menor n�mero
                    menor <- numero3
                 fimse
                 soma1 <- soma1 + numero3
                 contador3 <- contador3 + 1
              ate (contador3 >= numeroMax)
              media <- soma1 / contador3
              escreval("O maior e ", maior)
              escreval("O menor e ", menor)
              escreval("A media e ", media)
         caso 5
              limpatela//Limpar a Tela
              escreval("C�digo Morse")
              escreval("Digite um n�mero de 0 a 20")
              leia(morse)
              escolha (morse)
                      caso 0
                           escreval("-----")
                      caso 1
                           escreval(".----")
                      caso 2
                           escreval("..---")
                      caso 3
                           escreval("...--")
                      caso 4
                           escreval("....-")
                      caso 5
                           escreval(".....")
                      caso 6
                           escreval("-....")
                      caso 7
                           escreval("--...")
                      caso 8
                           escreval("---..")
                      caso 9
                           escreval("----.")
                      caso 10
                           escreval(".---- -----")
                      caso 11
                           escreval(".---- .----")
                      caso 12
                           escreval(".---- ..---")
                      caso 13
                           escreval(".---- ...--")
                      caso 14
                           escreval(".---- ....-")
                      caso 15
                           escreval(".---- .....")
                      caso 16
                           escreval(".---- -....")
                      caso 17
                           escreval(".---- --...")
                      caso 18
                           escreval(".---- ---..")
                      caso 19
                           escreval(".---- ----.")
                      caso 20
                           escreval("..--- -----")
                      outrocaso
                           escreval("Valor invalido")
              fimescolha
         caso 6
              limpatela//Limpar a Tela
              contador4 <- 0//limpando variavel
              escreval("Mudan�a de Base")
              escreval("Digite a quantidade de numeros:")
              leia(numeroMax1)
              repita
                 contador5 <- 0//limpando variavel
                 binario <- 0//limpando variavel
                 decimal <- 0//limpando variavel
                 repita
                    escreval("Digite um numero maior que 0:")
                    leia(n)
                    se n <= 0 entao
                       escreval("O numero digitado n�o e maior que 0")
                    fimse
                 ate n > 0
                 repita
                    escreval("Digite b para binario e d para decimal")
                    leia(y)
                    se (y <> "B") e (y <> "b") e (y <> "D") e (y <> "d") entao
                       escreval("A letra deve ser b ou d")
                    fimse
                 ate (y = "B") ou (y = "b") ou (y = "D") ou (y = "d")

                 resultado <- ""
                 se (y = "B") ou (y = "b") entao//transformar em binario
                    enquanto n > 0 faca
                        se (n mod 2) = 0 entao
                           resultado <- "0" + resultado
                        senao
                           resultado <- "1" + resultado
                        fimse
                        n <- n div 2//pegar so a divisao
                    fimenquanto
                    escreval("O valor em binario e ",resultado)
                 fimse
                 se (y = "D") ou (y = "d") entao//transformar em decimal
                    enquanto n > 0 faca
                       binario <- n mod 10//Pegando a proxima unidade do numero
                       decimal <- decimal + (binario*2 ^ contador5)
                       contador5 <- contador5 +1
                       n <- n\10//dividindo para pegar proxima unidade
                    fimenquanto
                    escreval("O valor decimal e ",decimal)
                 fimse
                 
                 contador4 <- contador4 + 1
              ate (contador4 >= numeroMax1)
         caso 7
              escreval("Menu finalizado")
         outrocaso
              escreval("Digite um valor de 1 at� 7")
      fimescolha
   ate (opcao = 7)
Fimalgoritmo