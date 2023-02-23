#Autor Lucas Gabriel Flores

#!/bin/sh
while read input_text  #lê o input do terminal e manda para uma variável
do
  case $input_text in #condições para caso a variável seja um dos estados abaixo
        hello)     echo English    #caso seja “hello” fale‘English’
               ;;
        howdy)          echo American   #caso a variável seja “howdy” o computador irá falar ‘American’
                ;;
        gday)           echo Australian  #caso seja ‘gday’ ele vai falar ‘Australian’ no terminal
                ;;
        bonjour)        echo French #caso seja ‘bonjour’ ele vai    falar no terminal “French”  
               ;;
        "guten tag")    echo German #caso seja ‘guten tag’ ele vai falar no terminal “German”     
              ;;
        *)              echo Unknown Language: $input_text #Se ele não detectar nenhuma linguagem, 
                                                           #ele vai falar no terminal ‘Unknown Language’ e mostra a variável também
                ;;
   
esac #termino do case
done ​< myfile.txt #mandar para o case um arquivo de texto

myfile.txt: #Arquivo de texto com os inputs
this file is called myfile.txt and we are using it as an example input.
hello
gday
bonjour
hola
