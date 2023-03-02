Autor: Lucas Gabriel Flores
Descrição: Conta 1 até o 10 de trás para frente

#!/bin/bash
i=10
while [ $i -gt 0 ]
do
        echo "$i"
        i=$(($i-1))
done
