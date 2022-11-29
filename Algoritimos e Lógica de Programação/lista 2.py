#Questão 1- Faça um Programa que peça os três lados de um triângulo. O programa deverá informar se os valores podem ser um triângulo. Indique, caso os lados formem um triângulo, se o mesmo é: equilátero, isósceles ou escaleno.
print ('insira os dados a seguir:')
a= float(input('insira o lado 1: '))
b= float(input('insira o lado 2: '))
c= float(input('insira o lado 3: '))
if a<b+c and b<a+c and c<a+b:
    if a==b==c:
        print('O triangulo existe e será equilátero')
    elif a==b or b==c or a==c:
        print('o triangulo existe e será isóceles')
    elif a!=b!=c!=a:
        print('o triangulo existe e será escaleno')
else:
    print ('o triangulo não existe')

#Questão 2- Determine se um ano é bissexto. Verifique no Google como fazer isso..
print ('Verificador de anos bissextos')
ano = int(input('Coloque o ano que deseja analisar: '))
if (ano%4)==0 and (ano%100)!=0:
    print('ano é bissexto')
elif (ano%400)== 0:
    print('ano é bissexto')
else:
    print('ano não é bissexto')
    
#Questão 3- João Papo-de-Pescador, homem de bem, comprou um microcomputador para controlar o rendimento diário de seu trabalho. Toda vez que ele traz um peso de peixesmaior que o estabelecido pelo regulamento de pesca do estado de São Paulo (50 quilos) deve pagar uma multa de R$ 4,00 por quilo excedente. João precisa que você faça um programa que leia a variável peso (peso de peixes) e verifique se há excesso. Se houver, gravar na variável excesso e na variável multa o valor da multa que João deverá pagar. Caso contrário mostrar tais variáveis com o conteúdo ZERO.
print('calculadora de multa')
peso= float(input('Qual o peso do peixe pescado?'))
if peso>50:
    excesso = peso-50
    multa = excesso*4
    print(f'O peixe passou do peso permitido! O excesso será de {excesso:.2f}kgs e a multa ficará em R${multa:.2f}')
else:
    multa=0
    excesso=0
    print('O peixe em questão está dentro do peso permitido')

#Questão 4- Faça um Programa que leia três números e mostre o maior deles.
print('Insira os valores a seguir')
num1= float(input('Insira o primeiro valor: '))
num2= float(input('Insira o segundo valor: '))
num3= float(input('Insira o terceiro valor: '))
if num1==num2==num3:
    print('os três valores são iguais')
elif num1>num2 and num1>num3:
    print('o primeiro será maior que os demais')
elif num2>num1 and num2>num3:
    print('o segundo será maior que os demais')
elif num3>num1 and num3>num2:
    print('o terceiro será maior que os demais')

#Questão 5- Faça um Programa que leia três números e mostre o maior e o menor deles
print('Insira os valores a seguir')
num1= float(input('Insira o primeiro valor: '))
num2= float(input('Insira o segundo valor: '))
num3= float(input('Insira o terceiro valor: '))
if num1==num2==num3:
    print('os três valores são iguais')
elif num1>num2 and num1>num3:
    if num2>num3:
        print('O Primeiro valor é maior e o terceiro é o menor')
    else:
        print('O Primeiro valor é maior e o segundo é o menor')
elif num2>num1 and num2>num3:
    if num1>num3:
        print('O Segundo valor é maior e o terceiro é o menor')
    else:
        print('O Segundo valor é maior e o primeiro é o menor')
elif num3>num1 and num3>num2:
    if num1>num2:
        print('O Terceiro valor é maior e o segundo é o menor')
    else:
        print('O Terceiro valor é maior e o primeiro é o menor')

#Questão 6
#perguntas
print('Calculadora de despesas relativas a impostos\ninsira os dados a seguir: ')
ganho_hora = float(input('O quanto você ganha por hora? '))
horas_mes = float(input('Quantas horas você trabalha no mês? '))
#contas
bruto = ganho_hora*horas_mes
imposto_renda = bruto*0.11
inss = bruto*0.08
sindicato = bruto*0.05
despesas= imposto_renda+inss+sindicato
liquido= bruto - despesas
#resposta
print(f'Seu salário ao final do mês será de R$ {liquido:.2f}')
print(f'Dados mais detalhados a seguir:\na)Salário bruto:R${bruto:.2f}\nb)Imposto de renda:R${imposto_renda:.2f}\nc)INSS:R${inss:.2f}')
print(f'd)Sindicato:R${sindicato:.2f}\ne)Salário Líquido:R${liquido:.2f}')

#Questão 7


