#Autor: Lucas Gabriel Flores
# IDescrição: imprimir a lista de frutas com seus respectivos preços, só que em orde, alfabética

#Lista de fruta:1 Laranja 2,00
               # 2 Maçã 3,50
               # 3 Açaí 7,00
               # 4 Tangerina 4,00
               # 5 Abacaxi 4,50
               # 6 Caju 6,00
               # 7 Mamão 2,30
               # 8 Pitanga 4,30
               # 9 Romã 8,50
               # 10 Acerola 6,30
               # 11 Graviola 3,80
               
#!/bin/bash
fruta=$(cut -d" " -f2-3 ListaDeFruta.txt | sort)
touch listaEmOrdem.txt
echo $fruta > listaEmOrdem.txt 
