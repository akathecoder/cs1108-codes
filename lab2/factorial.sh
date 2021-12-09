# !/bin/bash
# The shell script to calculate the factorial value of a Numbers.

clear
echo "-----Factorial of Number-----"
echo
read -p "Enter a number : " num
echo
num1=$num
fact=1
while [ $num -gt 1 ]; do
    fact=$(($num * $fact))
    num=$(($num - 1))
done
echo "The Factorial of $num1 is : $fact"
echo
