Autor: Lucas Gabriel Flores
Descrição: imprime Números entre a váriavel que vai ser lida pelo comando e o número 1. Caso usuário coloque um numero negativo, ele virará 42

#!/bin/bash
echo "Digite um número!"
read n

if [ $n -lt 0 ]

then
        n=42 
fi

        if [ $n -gt 0 ]

        then
