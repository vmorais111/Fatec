#Questão 1-Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.
print('Insira um numero de 0 a 10')
nota=int(input('Insira o valor: '))
while nota>10 or nota<0:
    nota=int(input('numero invalido. Insira um outro valor: '))
print('o valor está correto')
#Questão 2- Faça um programa que leia um nome de usuário e a sua senha e não aceite a senha igual ao nome do usuário, mostrando uma mensagem de erro e voltando a pedir as informações
print('Insira o usuário e senha')
usuario=str(input('Digite o nome do usuário: '))
senha=str(input('Digite a senha: '))
while senha==usuario:
    print('ERRO.\nA senha não pode ser a mesma que o seu usuário')
    senha=str(input('coloque a senha: '))
print('Senha aceita. Seja bem vindo!')
#Questão 3-Supondo que a população de um país A seja da ordem de 80000 habitantes com uma taxa anual de crescimento de 3% e que a população de B seja 200000 habitantes com uma taxa de crescimento de 1.5%. Faça um programa que calcule e escreva o número de anos necessários para que a população do país A ultrapasse ou iguale a população do país B, mantidas as taxas de crescimento
a=80000
b=200000
anos=0
while a<b:
    a+= (a*0.03)
    b+= (b*0.015)
    anos+= 1
print(anos)
#Questão 4- A seqüência de Fibonacci é a seguinte: 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, ... Sua regra de formação é simples: os dois primeiros elementos são 1; a partir de então, cada elemento é a soma dos dois anteriores. Faça um algoritmo que leia um número inteiro calcule o seu número de Fibonacci. F1= 1, F2= 1, F3 = 2, etc
print('insira os dados a seguir')
num=int(input('nº:'))
contador=1
f1=1
f2=1
while contador<num:
    f1,f2=f1,f2
    f1,f2=f2,f1+f2
    contador+=1
print(f1)
#Questão 5-Dados dois números inteiros positivos, determinar o máximo divisor comum entre eles usando o algoritmo de Euclides
print('Coloque dois numeros inteiros positivos')
a=int(input('1º número: '))
b=int(input('2º número: '))
a,b=b,a
while a%b!=0:
    a,b=b,a%b
print(b)
