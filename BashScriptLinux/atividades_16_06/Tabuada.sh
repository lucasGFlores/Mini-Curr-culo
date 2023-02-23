#Autor Lucas Gabriel Flores

#!/bin/bash
read -p "Digite um numero para ver sua tabuada: " x #Lê o que o usuário escreve no terminal e passa para a variável x

for i in $(seq 1 10) #Sequencia usando for
do
        res[$i]=$(($x*$i)) #Cria o vetor “res” usando “i” como contador e calcula a variável “x” e “i”
done #Finalização do for
echo ${res[@]} #Manda todos os valores contido no vetor “res”

