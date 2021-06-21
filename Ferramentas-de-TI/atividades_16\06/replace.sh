#Autor Lucas Gabriel Flores

#!/bin/bash
Unix=('Debian' 'Red hat' 'Ubuntu' 'Suse' 'Fedora' 'UTS' 'OpenLinux'); #Determinar o conjunto de vetores

echo ${Unix[@]} #Mostra no terminal todos o conjunto de vetores Unix
echo '_____________' #Espaço 
echo ${Unix[@]/Ubuntu/SCO Unix}
