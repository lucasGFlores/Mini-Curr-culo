#autor Lucas Gabriel Flores

#!/bin/bash
INPUT_STRING=”hello” #declaração da variável
while [[ $INPUT_STRING != "bye" ]] # condição do while, sendo que a variável ativa a condição
do
  echo "Please type something in (bye to quit)" #o programa manda uma     mensagem no terminal
  read INPUT_STRING #lê o que será escrito no terminal e mandará o resultado para a variável "INPUT_STRING"
  echo "You typed:  $INPUT_STRING" #mostra no terminal  a variável string usando echo
done
