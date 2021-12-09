# !/bin/bash
# The shell script to perform Arithmatic Operations using two Numbers.

clear
echo "-----Arithmatic Operations-----"
echo
echo "Choose a Operation from the list : "
echo " 1. Addition : "
echo " 2. Subtraction : "
echo " 3. Multiplication : "
echo " 4. Division : "
echo " 5. Modules : "
echo
read -p "Enter a number (1-5) : " option
echo
read -p "Enter a Number A : " numA
read -p "Enter a Number B : " numB
echo

case "$option" in
1)
    echo Addition: $numA + $numB = $(expr $numA + $numB)
    ;;
2)
    echo Subtraction: $numA - $numB = $(expr $numA - $numB)
    ;;
3)
    echo Multiplication: $numA "*" $numB = $(expr $numA\*$numB)
    ;;
4)
    echo Division: $numA / $numB = $(expr $numA / $numB)
    ;;
5)
    echo Modules: $numA % $numB = $(expr $numA % $numB)
    ;;
*)
    echo "Enter proper option (1-5)..."
    ;;
esac
echo
