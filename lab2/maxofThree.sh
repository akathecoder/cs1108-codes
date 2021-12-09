# !/bin/bash
# A shell script to find the maximum of the three numbers.

clear
echo "-----Find the Greatest among three numbers-----"
echo
read -p " Enter Number A : " numA
read -p " Enter Number B : " numB
read -p " Enter Number C : " numC
echo
if [ "$numA" -gt "$numB" ] && [ "$numA" -gt "$numC" ]; then
    echo "
$numA is the Greatest Number..."
elif [ "$numB" -gt "$numA" ] && [ "$numB" -gt "$numC" ]; then
    echo "
$numB is the Greatest Number..."
else
    echo "
$numC is the Greatest Number..."
fi
echo
