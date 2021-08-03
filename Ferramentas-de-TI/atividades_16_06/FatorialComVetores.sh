#Autor Lucas Gabriel Flores

#!/bin/bash
read -p "Digite um numero:" num #Fala no terminal e lê o que o usuário escreve e manda para a variável num 
res=1 #Variável res declarada
i=0 #Variável “i” declarada
while [ $num -gt 0 ] #While para caso a variável num for maior que 0
do
        res=$((res*num)) #Calcula a variável “res” e “num” e manda para variável “num”
        fatorial[$i]=$num  #Cria o fatorial utilizando a variável “i” como marcação e usa o num para agrupar o fatorial
        i=$((i+1)) #Faz um cálculo com i
        num=$((num-1)) #Cálculo com num
done #Termina o wile
echo ${fatorial[@]} #fala o fatorial inteiro
echo $res #Fala a variável “res”
