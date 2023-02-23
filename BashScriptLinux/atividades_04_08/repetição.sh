#!/bin/bash
num=1
while [ $num -lt 10000 ]
do
	num=$(($num*2))
	echo "$num"
done
