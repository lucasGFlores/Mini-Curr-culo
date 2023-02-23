Autor: Lucas Gabriel Flores
Descrição: Lê o ano atual e sua data de nascimento, com o intuito de ver sua idade para saber se você pode ou não votar

#!/bin/bash
echo "Digite o ano atual"
read x

echo "Digite o ano que você nasceu"

read y

idade=$(($x-$y))

if [ $idade -ge 16 ]
then
        echo "você pode votar"
else
        echo "você é muito novo para votar"
fi
