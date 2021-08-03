#!/bin/bash
var=$(ls -la $1)
tam=${var:0:1}
if [[ $tam == 'd' ]] 
then
	echo "é um diretório!"
elif [[ $tam == '-' ]]
then
	echo "é um arquivo"
fi


