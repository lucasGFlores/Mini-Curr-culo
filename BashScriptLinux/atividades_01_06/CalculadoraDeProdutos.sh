Autor: Lucas Gabriel Flores
Descrição: Esse programa pega os preços de itens que o usuário digita, calcula a média do preço dos prdutos e verifica o produto com o maior preço

#!/bin/bash
i=1
soma=0
maior=0
while [ $i -le 15 ]
do
        echo "digite o valo do ŕoduto $i" 
        read x

        if [ $x -gt $maior ]
        then
            maior=$((x+maior))

        fi

        soma=$((soma+x))
        i=$((i+1))
done
echo "o maior preço é $maior"
soma=$(bc <<< "scale=2; $soma/15")
echo "a média do preço dos produtos é $soma" 
