#Autor: Lucas Gabriel Flores
#descrição: O código realiza algumas coisas com o vector

#!/bin/bash
#questão 1
nomes=("fulado" "ciclano" "cleber")
for i in $(seq 0 2)
do
	echo "Oi, eu sou ${nomes[$i]}!"
done
echo "-----------------"
#questão 2
i=0
while [ $i -lt ${#nomes[@]} ]
do
	echo "Oi, eu sou ${nomes[$i]}"
	i=$((i+1))
done
echo "==============="
#questão 3
con=0
x="base"
echo "para sair apente enter"
while [[ -n $x ]]
do
	echo "digite seu nome"
	read x
	vetor[$con]=$x
	con=$((con+1))
done
echo "${#vetor[@]}"

