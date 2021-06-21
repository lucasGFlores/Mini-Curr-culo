#Autor Lucas Gabriel Flores

#!/bin/bash
read -p "Digite um número:" num #Fala no terminal e lê o que o usuário escreve e manda para a variável num
res=1 #Declaração de variável 
while [ $num -gt 0 ] #While com a condição para a variável 
do
        res=$((res*num)) #Cálculo para variável “res e num”
        num=$((num-1))  #Cálculo usando variável “num”
done #Termina o while
echo $res #Mostra no terminal
