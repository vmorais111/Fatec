#Questão 1-Faça um programa que peça dois números inteiros e imprima a soma desses dois números
print ('Calculadora de números inteiros')
a = int ( input("Coloque um número inteiro: "))
b = int ( input("Coloque um segundo número inteiro: "))
print (f' Seu resultado será {a+b}')
         
# Questão 2-Escreva um programa que leia um valor em metros e o exiba convertido em milímetros
print ('Conversor de metros para milimetros')
metros = float ( input ( 'insira o valor em metros: '))
print (f' o resultado será de {metros * 1000:.0f} mm')

#Questão 3- Escreva um programa que leia a quantidade de dias, horas, minutos e segundos do usuário. Calcule o total em segundos.
print ('insira os dados a seguir ')
dias = float ( input ( 'Insira o numero de dias:'))
horas = float ( input ( 'Insira o numero de horas:'))
minutos = float ( input ( 'Insira o numero de minutos:'))
segundos = float ( input ( 'Insira o numero de segundos:'))
a= dias*24 + horas
b = a*60 + minutos
c = b*60 + segundos
print (f'O número total será de {c:.0f} segundos')

#Questão 4 - Faça um programa que calcule o aumento de um salário. Ele deve solicitar o valor do salário e a porcentagem do aumento. Exiba o valor do aumento e do novo salário.
print ('Calculadora de aumento ')
porcentagem = float ( input ("Coloque a porcentagem desejada: "))
salário = float ( input ("Coloque o valor salário do salário: "))
print ("o aumento será igual a ", porcentagem/ 100 * salário,' reais enquanto o valor total do novo salário ficará em', porcentagem/ 100 * salário + salário, 'reais')

#Questão 5- Solicite o preço de uma mercadoria e o percentual de desconto. Exiba o valor do desconto e o preço a pagar.
print ('Calculadora de desconto ')
porcentagem = float ( input ("Coloque a porcentagem do desconto: "))
preço = float ( input ("Coloque o preço do produto: "))
print ("o valor do desconto será de", porcentagem/100* preço, " reais, enquanto o novo valor do produto será de R$",preço - porcentagem/100 * preço)

# Questão 6- Calcule o tempo de uma viagem de carro. Pergunte a distância a percorrer e a velocidade média esperada para a viagem.
print ('calculadora de tempo de viagem')
distância = float (input('Insira a distância: '))
velocidade = float (input('insira a velocidade: '))
print (f' O tempo será de {distância/ velocidade} horas')

#Questão 7- Converta uma temperatura digitada em Celsius para Fahrenheit. F = 9*C/5 + 32
print ('conversor de temperatura')
celsius = float ( input('Qual a temperatura em celsius? Coloque aqui:'))
Fahrenheit = 9*celsius/5+32
print('A temperatura em Fahrenheit dará', Fahrenheit,'º graus')

#Questão 8- Faça agora o contrário, de Fahrenheit para Celsius.
print ('conversor de temperatura')
Fahrenheit = float ( input('Qual a temperatura em Fahrenheit? Coloque aqui:'))
Celsius= (Fahrenheit - 32)/1.8
print(f'A temperatura em Celsius dará {Celsius:.3f}º graus')

#Questão 9- Escreva um programa que pergunte a quantidade de km percorridos por um carro alugado pelo usuário, assim como a quantidade de dias pelos quais o carro foi alugado. Calcule o preço a pagar, sabendo que o carro custa R$ 60,00 por dia e R$ 0,15 por km rodado.
print ('calculadora de preço de viagem')
dias= float (input ('insira a quantidade de dias:'))
kilometros = float(input('insira a quantidade de kms:'))
print (f'O valor final ficará R${(dias*60)+(kilometros*0.15)}')

#Questão 10- Escreva um programa para calcular a redução do tempo de vida de um fumante. Pergunte a quantidade de cigarros fumados por dia e quantos anos ele já fumou. Considere que um fumante perde 10 minutos de vida a cada cigarro, calcule quantos dias de vida um fumante perderá. Exiba o total de dias
print ('calculadora de tempo de vida perdida pela ação do cigarro')
cigdia = float(input('Quantos cigarros a pessoa em questão fumava diariamente? '))
anosfumados = float(input('Por quantos anos essa pessoa fumou? '))
totalcigarro= (anosfumados*365)*cigdia
minperdidos = totalcigarro*10
print (f'O total de dias perdidos será de {minperdidos/1440:.2f} dias')

#Questão 11- Sabendo que str( ) converte valores numéricos para string, calcule quantos dígitos há em 2 elevado a um milhão.

