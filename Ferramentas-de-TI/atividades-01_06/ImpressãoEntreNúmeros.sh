Autor: Lucas Gabriel Flores
Descrição: imprime Números entre a váriavel que vai ser lida pelo comando e o número 1

#!/bin/bash

echo "Digite um número!"
read n

if [ $n -gt 0 ]
then
        for i in $(seq 1 $n)
        do
                echo "$i"
        done
fi
