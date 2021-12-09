# !/bin/bash
# The shell script to compare two Strings.

clear
echo "-----Check if Strings are Equal-----"
echo
read -p " Enter String A : " stringA
read -p " Enter String B : " stringB
echo
if [ "$stringA" = "$stringB" ]; then
    echo "
Both the Strings are equal..."
else
    echo "
Strings are not equal..."
fi
echo
