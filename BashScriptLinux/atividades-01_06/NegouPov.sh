Autor: Lucas Gabriel Flores
Descrição: Vê se o número é positivo ou negativo

#!/bin/bash
echo "Digite um número qualquer"
read x

if [ $x -ge 0 ]
then
        echo "$x é positivo"
else
        echo "$x é negativo"
fi
