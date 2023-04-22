#Questão A.O que o seguinte programa (dado na forma de pseucódigo) imprime

#x = 2
#y = 5
#se y > 8 então
#y = y * 2
#caso contrário,
#x = x * 2
#imprime (x + y)

#RESPOSTA
print('RESPOSTA QUESTÃO A')
x=2
y=5
if y>8:
    y*=2
else: 
    x*=2
print(f'A reposta para o pseudocódigo será {x+y}\n')

#Questão B.Quantas vezes o trecho de pseudocódigo seguinte imprime 'oi'? 
#(obs: na nossa pseudo-linguagem, o laço inclui os extremos, ou seja, 1 até 4 significa 1, 2, 3, 4.)
#para i = 1 até 9
#se i != 3, então
#para j = 1 até 6
#imprime 'oi'

#RESPOSTA
print('RESPOSTA QUESTÃO B')
lista=[]
for i in range(1,10):
    if i!=3:
        for j in range(1,7):
            lista.append(str('oi'))
print(f'lista c/ o total de ois:\n{lista}\nValor total: {len(lista)}\n')

#Questão C. Entre 1067 e 3627 (inclusive), quantos números são pares e também divisíveis por 7

#RESPOSTA
print('RESPOSTA QUESTÃO C')
lista=[]
for i in range(1067,3628):
    if i%2==0 and i%7==0:
        lista.append(i)
print(f'Itens da lista:\n{lista}\nTotal de números:{len(lista)}\n')


#Questão D. Daniela é uma pessoa muito supersticiosa. Para ela, um número é sortudo se ele contém o dígito 2
#mas não o dígito 7. Então, na opinião dela, quantos números sortudos existem entre 18644 e 33087, incluindo
#os extremos?

#RESPOSTA
print('RESPOSTA QUESTÃO D')
lista=[]
for i in range(18644,33088):
    if '2' in str(i) and '7' not in str(i):
        lista.append(i)
print(f'O total de números sortudos será de:{len(lista)}\n')

#Questão E. Na pacata vila campestre de Ponteironuloville, todos os telefones têm 6 dígitos. A companhia 
#telefônica estabelece as seguintes regras sobre os números:
#
# 1. Não pode haver dois dígitos consecutivos idênticos, porque isso é chato;
# 2. A soma dos dígitos tem que ser par, porque isso é legal;
# 3.O último dígito não pode ser igual ao primeiro, porque isso dá azar.
#
#Então, dadas essas regras perfeitamente razoáveis, bem projetadas e maduras,quantos números de telefone 
#na lista abaixo são válidos?
#
# 213752 216732 221063 221545 225583 229133 230648 233222
# 236043 237330 239636 240138 242123 246224 249183 252936 
# 254711 257200 257607 261424 263814 266794 268649 273050
# 275001 277606 278997 283331 287104 287953 289137 291591
# 292559 292946 295180 295566 297529 300400 304707 306931
# 310638 313595 318449 319021 322082 323796 326266 326880
# 327249 329914 334392 334575 336723 336734 338808 343269
# 346040 350113 353631 357154 361633 361891 364889 365746
# 365749 366426 369156 369444 369689 372896 374983 375223
# 379163 380712 385640 386777 388599 389450 390178 392943
# 394742 395921 398644 398832 401149 402219 405364 408088
# 412901 417683 422267 424767 426613 430474 433910 435054
# 440052 444630 447852 449116 453865 457631 461750 462985
# 463328 466458 469601 473108 476773 477956 481991 482422
# 486195 488359 489209 489388 491928 496569 496964 497901
# 500877 502386 502715 507617 512526 512827 513796 518232
# 521455 524277 528496 529345 531231 531766 535067 535183
# 536593 537360 539055 540582 543708 547492 550779 551595
# 556493 558807 559102 562050 564962 569677 570945 575447
# 579937 580112 580680 582458 583012 585395 586244 587393
# 590483 593112 593894 594293 597525 598184 600455 600953
# 601523 605761 608618 609198 610141 610536 612636 615233
# 618314 622752 626345 626632 628889 629457 629643 633673
# 637656 641136 644176 644973 647617 652218 657143 659902
# 662224 666265 668010 672480 672695 676868 677125 678315

#RESPOSTA
print('RESPOSTA QUESTÃO E')
listanum= ''' 
 213752 216732 221063 221545 225583 229133 230648 233222
 236043 237330 239636 240138 242123 246224 249183 252936 
 254711 257200 257607 261424 263814 266794 268649 273050
 275001 277606 278997 283331 287104 287953 289137 291591
 292559 292946 295180 295566 297529 300400 304707 306931
 310638 313595 318449 319021 322082 323796 326266 326880
 327249 329914 334392 334575 336723 336734 338808 343269
 346040 350113 353631 357154 361633 361891 364889 365746
 365749 366426 369156 369444 369689 372896 374983 375223
 379163 380712 385640 386777 388599 389450 390178 392943
 394742 395921 398644 398832 401149 402219 405364 408088
 412901 417683 422267 424767 426613 430474 433910 435054
 440052 444630 447852 449116 453865 457631 461750 462985
 463328 466458 469601 473108 476773 477956 481991 482422
 486195 488359 489209 489388 491928 496569 496964 497901
 500877 502386 502715 507617 512526 512827 513796 518232
 521455 524277 528496 529345 531231 531766 535067 535183
 536593 537360 539055 540582 543708 547492 550779 551595
 556493 558807 559102 562050 564962 569677 570945 575447
 579937 580112 580680 582458 583012 585395 586244 587393
 590483 593112 593894 594293 597525 598184 600455 600953
 601523 605761 608618 609198 610141 610536 612636 615233
 618314 622752 626345 626632 628889 629457 629643 633673
 637656 641136 644176 644973 647617 652218 657143 659902
 662224 666265 668010 672480 672695 676868 677125 678315'''.split()

def f1(i):
    for n in range(10):
        if str(n)+str(n) in i:
            return True
    return False
def f2(i):
    cont=0
    for j in i:
        cont+=int(j)
    if cont%2==0:
        return True
    else:
        return False
def f3(i):
    if i[0]!= i[-1]: 
        return True
    else: 
        return False

lista=[]
for n in listanum:
    if not f1(n) and f2(n) and f3(n):
        lista.append(n)
print(f'A lista dos números válidos é:\n{lista}\nO total de telefones válidos será de: {len(lista)}')
