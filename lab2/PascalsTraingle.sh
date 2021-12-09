# !/bin/bash
# The shell script to generate the Pascal Traingle.

clear
echo "-----Pascal Traingle-----"
echo
read -p "Enter a number (for levels) : " num
echo
arr=(1)
# print all the values in array (arr)(sepated by spaces)
echo ${arr[*]}
for ((i = 1; i < $num; i++)); do
    arr1=(1)
    # ${#arr[@]} = lenght of array (arr)
    for ((j = 0; j < ${#arr[@]} - 1; j++)); do
        sum=$((${arr[$j]} + ${arr[$j + 1]}))
        arr1+=($sum)
    done
    # append new value(1) to an array(arr1)
    arr1+=(1)
    echo ${arr1[*]}
    # make a copy of an array to a variable.
    arr=(${arr1[@]})
done
echo
