#Questão 1- Sorteie 10 inteiros entre 1 e 100 para uma lista e descubra o maior e o menor valor, sem usar as funções max e min.
import random

lista= random.sample(range(100),10)
maior=lista[0]
menor=lista[0]
bn=1
while bn<len(lista):
    if lista[bn]>maior: 
        maior=lista[bn]
    if lista[bn]<menor:
        menor=lista[bn]
    bn+=1
print(lista)
print(maior)
print(menor)

#Questão 2-Sorteie 20 inteiros entre 1 e 100 numa lista. Armazene os números pares na lista PAR e os números ímpares na lista IMPAR. Imprima as três listas.

import random
lista= random.sample(range(100),20)
par=[]
impar=[]
k=0
while k<20:
    if lista[k]%2==0:
        par.append(lista[k])
    if lista[k]%2==1:
        impar.append(lista[k])
    k+=1
print(lista)
print(par)
print(impar)
print('o resultado de tudo é 42')

#Questão 3-Faça um programa que crie dois vetores com 10 elementos aleatórios entre 1 e 100. Gere um terceiro vetor de 20 elementos, cujos valores deverão ser compostos pelos elementos intercalados dos dois outros vetores. Imprima os três vetores.
import random

lista1= random.sample(range(100),10)
lista2= random.sample(range(100),10)
a,b,c,d,e,f,g,h,i,j=lista1
k,l,m,n,o,p,q,r,s,t=lista2
lista3=a,k,b,l,c,m,d,n,e,o,f,p,g,q,h,r,i,s,t,j
print(f'Lista 1={lista1}\nLista 2={lista2}')
print(f'Lista 3={lista3}')

#Questão 4-Seja o statement sobre diversidade: “The Python Software Foundation and the global Python community welcome and encourage participation by everyone. Our community is based on mutual respect, tolerance, and encouragement, and we are working to help each other live up to these principles. We want our community to be more diverse: whoever you are, and whatever your background, we welcome you.”. Gere uma lista de palavras deste texto com split(), a seguir crie uma lista com as palavras que começam ou terminam com uma das letras “python”. Imprima a lista resultante. Não se esqueça de remover antes os caracteres especiais e cuidado com maiúsculas e minúsculas.

texto='''The Python Software Foundation and the global Python community welcome and encourage participation 
by everyone. Our community is based on mutual respect, tolerance, and encouragement, and we are working to 
help each other live up to these principles. We want our community to be more diverse: whoever you are, and
whatever your background, we welcome you'''.lower()
texto=texto.replace(',','')
texto=texto.replace('.','')
texto=texto.replace(':','')
texto=texto.split()
k=0
cnt=''
acm=[]
while k<len(texto):
    cnt=texto[k]
    if cnt.startswith('p') or cnt.endswith('p'):
        acm.append(cnt)
    elif cnt.startswith('y') or cnt.endswith('y'):
        acm.append(cnt)
    elif cnt.startswith('t') or cnt.endswith('t'):
        acm.append(cnt)
    elif cnt.startswith('h') or cnt.endswith('h'):
        acm.append(cnt)
    elif cnt.startswith('o') or cnt.endswith('o'):
        acm.append(cnt)
    elif cnt.startswith('n') or cnt.endswith('n'):
        acm.append(cnt)
    k+=1
print(acm)

#Questão 5-Seja o mesmo texto acima “splitado”. Calcule quantas palavras possuem uma das letras “python” e que tenham mais de 4 caracteres. Não se esqueça de transformar maiúsculas para minúsculas e de remover antes os caracteres especiais.

texto='''The Python Software Foundation and the global Python community welcome and encourage participation 
by everyone. Our community is based on mutual respect, tolerance, and encouragement, and we are working to 
help each other live up to these principles. We want our community to be more diverse: whoever you are, and
whatever your background, we welcome you'''.lower()
texto=texto.replace(',','')
texto=texto.replace('.','')
texto=texto.replace(':','')
texto=texto.split()
alc=texto
#função
def bn(tre):
    if len(tre)<=4:
        return False
    for i in tre:
        if i in 'python': 
            return True
    return False
#calculo
lista=[]
for a in alc:
    if bn(a):
        lista.append(a)
print(f'A lista conterá:{lista}\nO total de números é {len(lista)}')