# !/bin/bash
# The shell script to generate the fabbonachi series.

clear
echo "-----Fibbonachi Series-----"
echo
read -p "Enter a number (for sequence) : " num
echo
a=0
b=1
c=1
echo "The Fibbonachi Series Upto $num terms is : "
if [ $num = 0 ]; then
    echo $a
elif [ $num = 1 ]; then
    echo $b
else
    i=2
    echo $a
    echo $b
    while [ $num -gt $i ]; do
        c=$(($a + $b))
        echo $c
        a=$b
        b=$c
        i=$(($i + 1))
    done
fi
echo
