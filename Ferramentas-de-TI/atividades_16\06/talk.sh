#Autor Lucas Gabriel Flores

#!/bin/bash

echo "Please talk to me ..." #manda uma mensagem pelo terminal
while true #While no modo true
do
  read INPUT_STRING #espera para o usuário mandar um imput que é inserido na variável
  case $INPUT_STRING in #inicia algumas condições para a variável
	hello)
		echo "Hello yourself!" #caso a variável seja “hello”
		;;
	bye)
		echo "See you again!" #caso seja “bye” fala See you again
		break #quebra o while
		;;
	*)
		echo "Sorry, I don't understand" #Caso a mensagem seja além do que os dois casos, irá ser mandado no terminal
		;;
  	   esac #fecha o case
done #termina o wile
echo #Dá um espaço
echo "That's all folks!" #frase mandado para o terminal


pwrd.sh:
#!/bin/bash

echo "Enter username" #mensagem para o terminal
read username #lê o input do terminal e manda para a variável
echo "Enter password" #manda uma mensagem para o terminal
read password #lê o input e manda para a variável 

if [[ $username == "admin" && $password == "secret" ]] #condição de que para entrar, o username for igual a admin e password for senha
then
        echo "valid user" #fala no terminal “valid user”
else
        echo "invalid user" #Caso não entre na if, irá falar “invalid user “
fi
