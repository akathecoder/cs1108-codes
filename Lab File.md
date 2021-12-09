# CS1108 Lab File

| Name        | Sparsh Agarwal      |
| ----------- | ------------------- |
| Roll No.    | 2019BtechCSE052     |
| Course Code | CS1108              |
| Instructor  | Dr. Gireesh Kaushik |

## Lab 1: Basic Linux Commands

### Experiment 1

Execution of various shell related commands.

- `cat /etc/shells`

  Listing the shells available on the system

  ```shell
  /bin/sh
  /bin/bash
  /usr/bin/bash
  /bin/rbash
  /usr/bin/rbash
  /bin/dash
  /usr/bin/dash
  ```

- `echo $SHELL`
  Determining your Default shell

  ```shell
  /bin/bash
  ```

### Experiment 2

Execution of various time related commands

- `cal`

  Displat calendar of current month

  ```shell
       September 2021
  Su Mo Tu We Th Fr Sa
          1  2  3  4
  5  6  7  8  9 10 11
  12 13 14 15 16 17 18
  19 20 21 22 23 24 25
  26 27 28 29 30
  ```

- `cal 08 2008`

  Display calendar of August 2008

  ```shell
        August 2008
  Su Mo Tu We Th Fr Sa
                1  2
  3  4  5  6  7  8  9
  10 11 12 13 14 15 16
  17 18 19 20 21 22 23
  24 25 26 27 28 29 30
  31

  ```

- `cal 2008`

  To display calendar of entire year of 2008

  ```shell
                                2008
      January               February               March
  Su Mo Tu We Th Fr Sa  Su Mo Tu We Th Fr Sa  Su Mo Tu We Th Fr Sa
       1  2  3  4  5                  1  2                     1
  6  7  8  9 10 11 12   3  4  5  6  7  8  9   2  3  4  5  6  7  8
  13 14 15 16 17 18 19  10 11 12 13 14 15 16   9 10 11 12 13 14 15
  20 21 22 23 24 25 26  17 18 19 20 21 22 23  16 17 18 19 20 21 22
  27 28 29 30 31        24 25 26 27 28 29     23 24 25 26 27 28 29
                                              30 31

       April                  May                   June
  Su Mo Tu We Th Fr Sa  Su Mo Tu We Th Fr Sa  Su Mo Tu We Th Fr Sa
       1  2  3  4  5               1  2  3   1  2  3  4  5  6  7
  6  7  8  9 10 11 12   4  5  6  7  8  9 10   8  9 10 11 12 13 14
  13 14 15 16 17 18 19  11 12 13 14 15 16 17  15 16 17 18 19 20 21
  20 21 22 23 24 25 26  18 19 20 21 22 23 24  22 23 24 25 26 27 28
  27 28 29 30           25 26 27 28 29 30 31  29 30


        July                 August              September
  Su Mo Tu We Th Fr Sa  Su Mo Tu We Th Fr Sa  Su Mo Tu We Th Fr Sa
       1  2  3  4  5                  1  2      1  2  3  4  5  6
  6  7  8  9 10 11 12   3  4  5  6  7  8  9   7  8  9 10 11 12 13
  13 14 15 16 17 18 19  10 11 12 13 14 15 16  14 15 16 17 18 19 20
  20 21 22 23 24 25 26  17 18 19 20 21 22 23  21 22 23 24 25 26 27
  27 28 29 30 31        24 25 26 27 28 29 30  28 29 30
                        31

      October               November              December
  Su Mo Tu We Th Fr Sa  Su Mo Tu We Th Fr Sa  Su Mo Tu We Th Fr Sa
          1  2  3  4                     1      1  2  3  4  5  6
  5  6  7  8  9 10 11   2  3  4  5  6  7  8   7  8  9 10 11 12 13
  12 13 14 15 16 17 18   9 10 11 12 13 14 15  14 15 16 17 18 19 20
  19 20 21 22 23 24 25  16 17 18 19 20 21 22  21 22 23 24 25 26 27
  26 27 28 29 30 31     23 24 25 26 27 28 29  28 29 30 31
                        30

  ```

- `date`

  Displaying the system date

  ```shell
  Sunday 12 September 2021 08:46:13 AM IST
  ```

- `date +%d`

  To display only the current date

  ```shell
  12
  ```

- `date +'%d %m'`

  To display current date and month

  ```shell
  12 09
  ```

### Experiment 3

Execution of various calculator related commands

`bc`

Opens the command line calculator

```shell
bc 1.07.1
Copyright 1991-1994, 1997, 1998, 2000, 2004, 2006, 2008, 2012-2017 Free Software Foundation, Inc.
This is free software with ABSOLUTELY NO WARRANTY.
For details type `warranty'.
```

Inside that command line, on executing these simple math problems

- `((50.1 + 65.12) * 30.3)`

  ```shell
  3491.166
  ```

- `l(2000)`

  ```shell
  7.60090245954208236147
  ```

- `sqrt(40)`

  ```shell
  6.32455532033675866399
  ```

### Experiment 4

Execution of various basic bash commands

- `echo "Hi, I am learning Linux commands"`

  ```shell
  Hi, I am learning Linux commands
  ```

- `x=5`

  `echo "The value of x is $x"`

  ```shell
  The value of x is 5
  ```

- `` echo "Current time is `date +"%T" `" ``

  ```shell
  Current time is 09:01:31
  ```

- `who`

  This command is used to display list and information of the users currently logged into
  the system.

  ```shell
  sparsh   :0           2021-09-12 08:36 (:0)
  ```

- `whoami`

  Display logged in user's username

  ```shell
  sparsh
  ```

### Experiment 5

Execution of various files and directories commands

- `echo $HOME`

  Checking your home directory

  ```shell
  /home/sparsh
  ```

- `pwd`

  Checking your current directory

  ```shell
  /home/sparsh
  ```

- `mkdir cities`

  Creating a directory named cities

- `cd cities`

  change directory

- `pwd`

  ```shell
  /home/sparsh/cities
  ```

- `mkdir Ahmedabad Surat Baroda`

  Create multiple sub directries

- `ls`

  List all subdirectries

  ```shell
  Ahmedabad  Baroda  Surat
  ```

- `cat > about_cities`

  `This directory contains information about three cities of Gujarat state, Ahmedabad, Baroda and Surat.`

  Press `[CTRL + D]`

- `ls`

  ```shell
  about_cities  Ahmedabad  Baroda  Surat
  ```

- `cat about_cities`

  Displays content of the specified file

  ```shell
  This directory contains information about three cities of Gujarat state, Ahmedabad,
  Baroda and Surat.
  ```

- `cat >> about_cities`

  `Surat is known as diamond city of India.`

  Press `[CTRL + D]`

  Concatinates in the specified file

- `cat about_cities`

  ```shell
  This directory contains information about three cities of Gujarat state, Ahmedabad,
  Baroda and Surat.
  Surat is known as diamond city of India.
  ```

- `ls *a`

  Display all files which start with a

  ```shell
  about_cities
  ```

- `cp about_cities newfile`

  After execution of above command, an exact copy of about_cities will be created with the
  name newfile. If a destination file (newfile) does not exist , it will first be created before
  copying takes place. If not, it will simply be overwritten without any warning from the
  system.

- `ls`

  ```shell
  about_cities  Ahmedabad  Baroda  newfile  Surat
  ```

- `cat newfile`

  ```shell
  This directory contains information about three cities of Gujarat state, Ahmedabad,
  Baroda and Surat.
  Surat is known as diamond city of India.
  ```

- `mv about_cities cities.txt`

  The move command can be used for renaming a file or directory.
  For example, to rename the file about_cities to cities.txt , execute the following
  command.

  If the destination file does not exist it will be created. Note than mv does not creates a
  copy of a file, instead it just renames it. Thus no additional space is consumed on disk
  during renaming

- `ls`

  ```shell
  Ahmedabad  Baroda  cities.txt  newfile  Surat
  ```

- `rm newfile`

  The rm command is used to delete one or more files.

- `ls`

  ```shell
  Ahmedabad  Baroda  cities.txt  Surat
  ```

- `wc cities.txt -l`

  Counts the number of lines in cities.txt

  ```shell
  3 cities.txt
  ```

- `wc cities.txt -l -w -c`

  Counts the number of lines, words and characters

  ```shell
  3  22 144 cities.txt
  ```

### Experiment 6

Execution of various file permissions commands

- `ls cities.txt -l`

  ```shell
  -rw-rw-r-- 1 sparsh sparsh 144 Sep 12 09:13 cities.txt
  ```

- `chmod ugo-w cities.txt`

  `ls cities.txt -l`

  ```shell
  -r--r--r-- 1 sparsh sparsh 144 Sep 12 09:13 cities.txt
  ```

- `chmod u+wx cities.txt`

  `ls cities.txt -l`

  ```shell
  -rwxr--r-- 1 sparsh sparsh 144 Sep 12 09:13 cities.txt
  ```

- `wc -c cities.txt`

  ```shell
  144 cities.txt.gz
  ```

  `gzip cities.txt`

  `ls`

  ```shell
  Ahmedabad  Baroda  cities.txt.gz  Surat
  ```

  `wc -c cities.txt.gz`

  ```shell
  144 cities.txt.gz
  ```

### Exercises

1. **What is Terminal window in Linux?**  
   A terminal window, also referred to as a terminal emulator, is a text-only window in
   a graphical user interface (GUI) that emulates a console. This is a window that provides
   the look and response of a dedicated text monitor in a graphical display.
2. **What is command prompt?**  
    A command prompt, also referred to simply as a prompt, is a short text message at the
   start of the command line on a command line interface.  
    The functions of a command prompt are :

   - to inform the user that the system is ready for the next command, data element
     or other input and
   - to help the user plan and execute subsequent operations.

3. **Describe shell. Name any three Linux shells.**
   - A shell is the command-line interface.
   - Shell is a user program, or an environment provided for user interaction. It is a
     command language interpreter that accepts/issues commands, understands it,
     talks to the kernel to execute it and displays results on a screen as instructed.
   - Numerous shells are available to work on the Linux systems, but the shells
     available on a particular system may vary. Some popular shells are **Bourne shell
     (sh) , C shell (csh and tcsh) , Korn shell (ksh) and bash (sh) shell**.
4. **Explain piping giving example.**

   - A pipe is a form of redirection (transfer of standard output to some other destination) that is used in Linux and other Unix-like operating systems to send the output of one command/program/process to another command/program/process for further processing by using the pipe character ‘|’.
   - It can also be visualized as a temporary connection between two or more
     commands/ programs/ processes.
   - This direct connection between commands/ programs/ processes allows them to
     operate simultaneously and permits data to be transferred between them
     continuously rather than having to pass it through temporary text files or through the display screen.
   - Pipes are unidirectional i.e data flows from left to right through the pipeline.

5. **What is redirection? Mention its usage giving example.**

   - Redirection can be defined as changing the way from where commands read input
     to where commands send output. You can redirect input and output of a
     command.
   - For redirection, meta characters are used. Redirection can be into a file (shell
     meta characters are angle brackets '<', '>') or a program (shell meta characters
     are pipe symbol '|').
   - The ‘<‘ symbol is used for input(STDIN) redirection
   - The ‘>‘ symbol is used for output (STDOUT) redirection.
   - “>>” appends output to an existing file.

6. **List the filter commands in Linux. Why they are categorized as filters.**
   - Filters are programs that take plain text(either stored in a file or produced by
     another program) as standard input, transforms it into a meaningful format, and
     then returns it as standard output.
   - Linux comes with various filters like head, tail, cut, paste, sort, uniq etc.
   - Some of the most commonly used filters are :
     - **cat:** Displays the text of the file line by line.
     - **head:** Displays the first n lines of the specified text files. If the number of lines is not specified then by default prints first 10 lines.
     - **tail:** It works the same way as head, just in reverse order. The only difference in tail is, it returns the lines from bottom to up.
     - **Sort:** Sorts the lines alphabetically by default but there are many options available to modify the sorting mechanism.
     - **uniq:** Removes duplicate lines. uniq has a limitation that it can only remove continuous duplicate lines(although this can be fixed by the use of piping)
     - **wc:** wc command gives the number of lines, words and characters in the data.
     - **grep:** grep is used to search a particular information from a text file.
     - **nl:** nl is used to number the lines of our text data.
     - **sed:** sed stands for stream editor. It allows us to apply search and replace
       operation on our data effectively

## Lab 2: Basic Linux commands with outputs

### Experiment 7

To study the various commands operated in vi editor in LINUX.

The Vi editor is a visual editor used to create and edit text, files, documents and
programs. It displays the content of files on the screen and allows a user to add, delete or change part of text . There are three modes available in the Vi editor, they are `Command mode` and `Input (or insert) mode`.

#### Starting Vi

The Vi editor is invoked by giving the following commands in LINUX prompt.

`vi <filename>` or `vi`

This command would open a display screen with 25 lines and with tilt (~) symbol at the
start of each line. The first syntax would save the file in the filename mentioned and for the next the filename must be mentioned at the end.

#### Commands in Vi

##### INSERTING AND REPLACING COMMANDS

| Commands | Syntax    | Description                                                                                        |
| -------- | --------- | -------------------------------------------------------------------------------------------------- |
| ESC      | `<ESC>`   | To move editor from command node to edit mode, you have to press the key.                          |
| ESC a    | `<ESC> a` | This command is used to move the edit mode and start to append after the current character.        |
| ESC A    | `<ESC> A` | This command is also used to append the file , but this command append at the end of current line. |
| ESC i    | `<ESC> i` | This command is used to insert the text before the current cursor position.                        |
| ESC I    | `<ESC> I` | This command is used to insert at the beginning of the current line.                               |
| ESC o    | `<ESC> o` | This command is insert a blank line below the current line & allow insertion of contents.          |
| ESC O    | `<ESC> O` | This command is used to insert a blank line above & allow insertion of contents.                   |
| ESC r    | `<ESC> r` | This command is to replace the particular character with the given characters.                     |
| ESC R    | `<ESC> R` | This command is used to replace the particular text with a given text.                             |
| ESC s    | `<ESC> s` | This command replaces a single character with a group of character .                               |
| ESC S    | `<ESC> S` | This command is used to replace a current linewith group of characters.                            |

##### CURSOR MOVEMENT IN Vi

| Commands | Syntax                    | Description                                                                                                                                                                        |
| -------- | ------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| ESC h    | `<ESC> h` `<ESC> nh`      | This command is used to move to the previous character typed. It is used to move to left of the text . It can also use to move character by character (or) a number of characters. |
| ESC l    | `<ESC> l` `<ESC> nl`      | This command is used to move to the right of the cursor (i.e.) to the next character. It can also be used to move the cursor for a number of characters.                           |
| ESC j    | `<ESC> j` `<ESC> nj`      | This command is used to move down a single line or a number of lines.                                                                                                              |
| ESC k    | `<ESC> k` `<ESC> nk`      | This command is used to move up a single line or a number of lines.                                                                                                                |
| ENTER    | `<ESC> <Enter>` `<ESC> n` | Enter This command will move the cursor to the starting of next lines or a group of lines mentioned.                                                                               |
| ESC +    | `<ESC> +` `<ESC> n+`      | This command is used to move to the beginning of the next line.                                                                                                                    |
| ESC -    | `<ESC> -` `<ESC> n-`      | This command is used to move to the beginning of the previous line.                                                                                                                |
| ESC 0    | `<ESC> 0`                 | This command will bring the cursor to the beginning of the same current line.                                                                                                      |
| ESC $    | `<ESC> $`                 | This command will bring the cursor to the end of the current line.                                                                                                                 |
| ESC ^    | `<ESC> ^`                 | This command is used to move to first character of first lines.                                                                                                                    |
| ESC b    | `<ESC> b` `<ESC> nb`      | This command is used to move back to the previous word (or) a number of words.                                                                                                     |
| ESC e    | `<ESC> e` `<ESC> ne`      | This command is used to move towards and replace the cursor at last character of the word (or) no of words.                                                                        |
| ESC w    | `<ESC> w` `<ESC> nw`      | This command is used to move forward by a single word or a group of words.                                                                                                         |

##### DELETING THE TEXT FROM Vi

| Commands | Syntax                 | Description                                                                                            |
| -------- | ---------------------- | ------------------------------------------------------------------------------------------------------ |
| ESC x    | `<ESC> x` `<ESC> nx`   | To delete a character to right of current cursor positions , this command is used.                     |
| ESC X    | `<ESC> X` `<ESC> nX`   | To delete a character to left of current cursor positions , this command is used.                      |
| ESC dw   | `<ESC> dw` `<ESC> ndw` | This command is to delete a single word or number of words to right of current cursor position.        |
| ESC db   | `<ESC> db` `<ESC> ndb` | This command is to delete a single word to the left of the current cursor position.                    |
| ESC dd   | `<ESC> dd` `<ESC> ndd` | This command is used to delete the current line (or) a number of line below the current line.          |
| ESC d$   | `<ESC> d$`             | This command is used to delete the text from current cursor position to last character of current line |

##### SAVING AND QUITTING FROM Vi

| Commands | Syntax                 | Description                                                                     |
| -------- | ---------------------- | ------------------------------------------------------------------------------- |
| ESC :w   | `<ESC> :w`             | To save the given text present in the file.                                     |
| ESC :q!  | `<ESC> :q!`            | To quit the given text without saving.                                          |
| ESC :wq  | `<ESC> :wq <filename>` | This command quits the vi editor after saving the text in the mentioned file.   |
| ESC :q   | `<ESC> :q`             | This command would quit the window but it would ask for again to save the file. |

### Experiment 8

#### Write a shell script program to find the Maximum three numbers

```bash
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
```

Output

```shell
-----Find the Greatest among three numbers-----

 Enter Number A : 12
 Enter Number B : 23
 Enter Number C : 44


44 is the Greatest Number...
```

#### Write a shell script program for comparison of strings

```bash
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
```

Output

```shell
-----Check if Strings are Equal-----

 Enter String A : hello
 Enter String B : hello


Both the Strings are equal...
```

```shell
-----Check if Strings are Equal-----

 Enter String A : hello
 Enter String B : world


Strings are not equal...
```

#### Perform Arithmetic operation using CASE

```bash
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

```

Output

```shell
-----Arithmatic Operations-----

Choose a Operation from the list :
 1. Addition :
 2. Subtraction :
 3. Multiplication :
 4. Division :
 5. Modules :

Enter a number (1-5) : 1

Enter a Number A : 2
Enter a Number B : 3

Addition: 2 + 3 = 5
```

```shell
-----Arithmatic Operations-----

Choose a Operation from the list :
 1. Addition :
 2. Subtraction :
 3. Multiplication :
 4. Division :
 5. Modules :

Enter a number (1-5) : 2

Enter a Number A : 4
Enter a Number B : 1

Subtraction: 4 - 1 = 3
```

```shell
-----Arithmatic Operations-----

Choose a Operation from the list :
 1. Addition :
 2. Subtraction :
 3. Multiplication :
 4. Division :
 5. Modules :

Enter a number (1-5) : 3

Enter a Number A : 2
Enter a Number B : 3

Multiplication: 2 * 3 = 6
```

```shell
-----Arithmatic Operations-----

Choose a Operation from the list :
 1. Addition :
 2. Subtraction :
 3. Multiplication :
 4. Division :
 5. Modules :

Enter a number (1-5) : 4

Enter a Number A : 6
Enter a Number B : 2

Division: 6 / 2 = 3
```

```shell
-----Arithmatic Operations-----

Choose a Operation from the list :
 1. Addition :
 2. Subtraction :
 3. Multiplication :
 4. Division :
 5. Modules :

Enter a number (1-5) : 5

Enter a Number A : 16
Enter a Number B : 3

Modules: 16 % 3 = 1
```

### Experiment 9

#### Calculate the factorial value of a number using shell script

```bash
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
```

Output

```shell
-----Factorial of Number-----

Enter a number : 5

The Factorial of 5 is : 120
```

#### To write a shell program to generate fibonacci series

```bash
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
```

Output

```shell
-----Fibbonachi Series-----

Enter a number (for sequence) : 10

The Fibbonachi Series Upto 10 terms is :
0
1
1
2
3
5
8
13
21
34
```

#### Write a program to draw a Pascal’s Triangle

```bash
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
```

Output

```shell
-----Pascal Traingle-----

Enter a number (for levels) : 9

1
1 1
1 2 1
1 3 3 1
1 4 6 4 1
1 5 10 10 5 1
1 6 15 20 15 6 1
1 7 21 35 35 21 7 1
1 8 28 56 70 56 28 8 1
```

## Lab 4: Write a JAVA program to simulate the following CPU scheduling algorithms to find average waiting time and turnaround time

### First Come First Serve (FCFS)

- A Jobs are executed on first come, first serve basis.
- It is a non-preemptive, pre-emptive scheduling algorithm.
- Easy to understand and implement.
- Its implementation is based on FIFO queue.
- Poor in performance as average wait time is high.

```java
// FCFS scheduling algorithm

package code;

import java.util.*;

public class FCFS {

  static void findWaitingTime(int n, int burstTime[], int waitingTime[]) {
    waitingTime[0] = 0;
    for (int i = 1; i < n; i++) {
      waitingTime[i] = burstTime[i - 1] + waitingTime[i - 1];
    }
  }

  static void findTurnAroundTime(
    int n,
    int burstTime[],
    int waitingTime[],
    int turnAroundTime[]
  ) {
    for (int i = 0; i < n; i++) {
      turnAroundTime[i] = burstTime[i] + waitingTime[i];
    }
  }

  static void findAvgTime(int processes[], int n, int burstTime[]) {
    int waitingTime[] = new int[n];
    int turnAroundTime[] = new int[n];
    int total_waitingTime = 0, total_turnAroundTime = 0;
    findWaitingTime(n, burstTime, waitingTime);
    findTurnAroundTime(n, burstTime, waitingTime, turnAroundTime);
    System.out.printf("\nProcesses BurstTime WaitingTime TurnAroundTime\n");
    for (int i = 0; i < n; i++) {
      total_waitingTime = total_waitingTime + waitingTime[i];
      total_turnAroundTime = total_turnAroundTime + turnAroundTime[i];
      System.out.printf("%d", (i + 1));
      System.out.printf("%d", burstTime[i]);
      System.out.printf("%d ", waitingTime[i]);
      System.out.printf("%d\n", turnAroundTime[i]);
    }
    float s = (float) total_waitingTime / (float) n;
    float t = (float) total_turnAroundTime / (float) n;
    System.out.printf("\nAverage waiting time = %f", s);
    System.out.printf("\n");
    System.out.printf("Average turn around time = %f ", t);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of Process: ");
    int num = sc.nextInt();
    int processes[] = new int[num];
    int burstTime[] = new int[num];
    for (int i = 0; i < num; i++) {
      System.out.print("...Enter the BurstTime for process " + (i + 1) + " : ");
      processes[i] = i + 1;
      burstTime[i] = sc.nextInt();
    }
    findAvgTime(processes, num, burstTime);
    sc.close();
  }
}
```

Output

```shell
Enter number of Process: 4
...Enter the BurstTime for process 1 : 4
...Enter the BurstTime for process 2 : 5
...Enter the BurstTime for process 3 : 1
...Enter the BurstTime for process 4 : 6

Processes BurstTime WaitingTime TurnAroundTime
140 4
254 9
319 10
4610 16

Average waiting time = 5.750000
Average turn around time = 9.750000
```

### Shortest Job First (SJF)

- This is also known as shortest job next, or SJN
- This is a non-preemptive, pre-emptive scheduling algorithm.
- Best approach to minimize waiting time.
- Easy to implement in Batch systems where required CPU time is known in advance.
- Impossible to implement in interactive systems where required CPU time is not known.
- The processer should know in advance how much time process will take.

```java
// Shortest Job first scheduling algorithm
package code;

import java.util.*;

public class SJF {

  static void arrangeArrival(int num, int[][] mat) {
    for (int i = 0; i < num; i++) {
      for (int j = 0; j < num - i - 1; j++) {
        if (mat[j][1] > mat[j + 1][1]) {
          for (int k = 0; k < 5; k++) {
            int temp = mat[j][k];
            mat[j][k] = mat[j + 1][k];
            mat[j + 1][k] = temp;
          }
        }
      }
    }
  }

  static void completionTime(int num, int[][] mat) {
    int temp, val = -1;
    mat[0][3] = mat[0][1] + mat[0][2];
    mat[0][5] = mat[0][3] - mat[0][1];
    mat[0][4] = mat[0][5] - mat[0][2];
    for (int i = 1; i < num; i++) {
      temp = mat[i - 1][3];
      int low = mat[i][2];
      for (int j = i; j < num; j++) {
        if (temp >= mat[j][1] && low >= mat[j][2]) {
          low = mat[j][2];
          val = j;
        }
      }
      mat[val][3] = temp + mat[val][2];
      mat[val][5] = mat[val][3] - mat[val][1];
      mat[val][4] = mat[val][5] - mat[val][2];
      for (int k = 0; k < 6; k++) {
        int tem = mat[val][k];
        mat[val][k] = mat[i][k];
        mat[i][k] = tem;
      }
    }
  }

  static void findAvgTime(int num, int[][] mat) {
    int total_waitingTime = 0, total_turnAroundTime = 0;
    for (int i = 0; i < num; i++) {
      total_waitingTime = total_waitingTime + mat[i][4];
      total_turnAroundTime = total_turnAroundTime + mat[i][5];
    }
    float s = (float) total_waitingTime / (float) num;
    float t = (float) total_turnAroundTime / (float) num;
    System.out.printf("\nAverage waiting time = %f", s);
    System.out.printf("\n");
    System.out.printf("Average turn around time = %f ", t);
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of Process: ");
    int num = sc.nextInt();
    int[][] mat = new int[num][6];
    for (int i = 0; i < num; i++) {
      System.out.println("...Process " + (i + 1) + "...");
      System.out.print("\tProcess Id: ");
      mat[i][0] = sc.nextInt();
      System.out.print("\tArrival Time: ");
      mat[i][1] = sc.nextInt();
      System.out.print("\tBurst Time: ");
      mat[i][2] = sc.nextInt();
    }
    System.out.println("Before Arrange...");
    System.out.println("Process ID\tArrival Time\tBurst Time");
    for (int i = 0; i < num; i++) {
      System.out.printf("%d\t\t%d\t\t%d\n", mat[i][0], mat[i][1], mat[i][2]);
    }
    arrangeArrival(num, mat);
    completionTime(num, mat);
    System.out.println("Final Result...");
    System.out.println(
      "Process ID\tArrival Time\tBurst Time\tWaiting Time\tTurnaround Time"
    );
    for (int i = 0; i < num; i++) {
      System.out.printf(
        "%d\t\t%d\t\t%d\t\t%d\t\t%d\n",
        mat[i][0],
        mat[i][1],
        mat[i][2],
        mat[i][4],
        mat[i][5]
      );
    }
    findAvgTime(num, mat);
    sc.close();
  }
}
```

Output

```shell
Enter number of Process: 4
...Process 1...
        Process Id: 1
        Arrival Time: 2
        Burst Time: 4
...Process 2...
        Process Id: 2
        Arrival Time: 5
        Burst Time: 6
...Process 3...
        Process Id: 3
        Arrival Time: 7
        Burst Time: 2
...Process 4...
        Process Id: 4
        Arrival Time: 2
        Burst Time: 6
Before Arrange...
Process ID      Arrival Time    Burst Time
1               2               4
2               5               6
3               7               2
4               2               6
Final Result...
Process ID      Arrival Time    Burst Time      Waiting Time    Turnaround Time
1               2               4               0               4
2               5               6               1               7
3               7               2               5               7
4               2               6               12              18

Average waiting time = 4.500000
Average turn around time = 9.000000
```

### Round Robin Scheduling (RRS)

- Round Robin is the preemptive process scheduling algorithm.
- Each process is provided a fix time to execute, it is called a quantum.
- Once a process is executed for a given time period, it is preempted and other process executes for a given time period.
- Context switching is used to save states of preempted processes .

```java
// RR scheduling algorithm

package code;

import java.util.Scanner;

public class RoundRobin {

  static void findWaitingTime(
    int processes[],
    int n,
    int burstTime[],
    int waitingTime[],
    int quantum
  ) {
    int rem_burstTime[] = new int[n];
    for (int i = 0; i < n; i++) {
      rem_burstTime[i] = burstTime[i];
    }
    int t = 0;
    while (true) {
      boolean done = true;
      for (int i = 0; i < n; i++) {
        if (rem_burstTime[i] > 0) {
          done = false;
          if (rem_burstTime[i] > quantum) {
            t += quantum;
            rem_burstTime[i] -= quantum;
          } else {
            t = t + rem_burstTime[i];
            waitingTime[i] = t - burstTime[i];
            rem_burstTime[i] = 0;
          }
        }
      }
      if (done == true) break;
    }
  }

  static void findTurnAroundTime(
    int processes[],
    int n,
    int burstTime[],
    int waitingTime[],
    int turnAroundTime[]
  ) {
    for (int i = 0; i < n; i++) turnAroundTime[i] =
      burstTime[i] + waitingTime[i];
  }

  static void findAvgTime(
    int processes[],
    int n,
    int burstTime[],
    int quantum
  ) {
    int waitingTime[] = new int[n], turnAroundTime[] = new int[n];
    int total_waitingTime = 0, total_turnAroundTime = 0;
    findWaitingTime(processes, n, burstTime, waitingTime, quantum);
    findTurnAroundTime(processes, n, burstTime, waitingTime, turnAroundTime);
    System.out.println(
      "\nProcesses " + " Burst time " + " Waiting time " + " Turn around time"
    );
    for (int i = 0; i < n; i++) {
      total_waitingTime = total_waitingTime + waitingTime[i];
      total_turnAroundTime = total_turnAroundTime + turnAroundTime[i];
      System.out.println(
        " " +
        (i + 1) +
        "\t\t" +
        burstTime[i] +
        "\t " +
        waitingTime[i] +
        "\t\t " +
        turnAroundTime[i]
      );
    }
    System.out.println(
      "\nAverage waiting time = " + (float) total_waitingTime / (float) n
    );
    System.out.println(
      "Average turn around time = " + (float) total_turnAroundTime / (float) n
    );
  }

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter number of Process: ");
    int num = sc.nextInt();
    System.out.print("Enter value of Quantum: ");
    int quantum = sc.nextInt();
    int processes[] = new int[num];
    int burstTime[] = new int[num];
    for (int i = 0; i < num; i++) {
      System.out.print("...Enter the BurstTime for process " + (i + 1) + " : ");
      processes[i] = i + 1;
      burstTime[i] = sc.nextInt();
    }
    findAvgTime(processes, num, burstTime, quantum);
    sc.close();
  }
}
```

Output

```shell
Enter number of Process: 4
Enter value of Quantum: 3
...Enter the BurstTime for process 1 : 2
...Enter the BurstTime for process 2 : 4
...Enter the BurstTime for process 3 : 1
...Enter the BurstTime for process 4 : 5

Processes  Burst time  Waiting time  Turn around time
 1              2        0               2
 2              4        6               10
 3              1        5               6
 4              5        7               12

Average waiting time = 4.5
Average turn around time = 7.5
```

### Priority Based Scheduling (PBS)

- Priority scheduling is a non-preemptive algorithm and one of the most common scheduling algorithms in batch systems.
- Each process is assigned a priority. Process with highest priority is to be executed first and so on.
- Processes with same priority are executed on first come first served basis.
- Priority can be decided based on memory requirements, time requirements or any other resource requirement.

```java
// Priority Scheduling algorithm

package code;

import java.util.Scanner;

public class Priority {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter Number of Process: ");
    int numberOfProcess = sc.nextInt();
    int[] process = new int[numberOfProcess];
    int burstTime[] = new int[numberOfProcess];
    int priority[] = new int[numberOfProcess];
    for (int i = 0; i < numberOfProcess; i++) {
      System.out.println("...Process " + (i + 1) + "...");
      System.out.print("\tProcess Id : ");
      process[i] = sc.nextInt();
      System.out.print("\tBurst Time Time : ");
      burstTime[i] = sc.nextInt();
      System.out.print("\tPriority : ");
      priority[i] = sc.nextInt();
    }
    int temp;
    int temp2;
    for (int i = 0; i < numberOfProcess - 1; i++) {
      for (int j = 0; j < numberOfProcess - 1; j++) {
        if (priority[j] > priority[j + 1]) {
          temp = priority[j];
          priority[j] = priority[j + 1];
          priority[j + 1] = temp;
          temp = burstTime[j];
          burstTime[j] = burstTime[j + 1];
          burstTime[j + 1] = temp;
          temp2 = process[j];
          process[j] = process[j + 1];
          process[j + 1] = temp2;
        }
      }
    }
    int TAT[] = new int[numberOfProcess + 1];
    int waitingTime[] = new int[numberOfProcess + 1];
    for (int i = 0; i < numberOfProcess; i++) {
      TAT[i] = burstTime[i] + waitingTime[i];
      waitingTime[i + 1] = TAT[i];
    }
    int totalWT = 0;
    int totalTAT = 0;
    double avgWT;
    double avgTAT;
    System.out.println(
      "Process ID\tBurst Time\tWaiting Time\tTurn Around Time"
    );
    for (int i = 0; i < numberOfProcess; i++) {
      System.out.println(
        process[i] +
        "\t\t" +
        burstTime[i] +
        "\t\t" +
        waitingTime[i] +
        "\t\t" +
        (TAT[i])
      );
      totalTAT += (waitingTime[i] + burstTime[i]);
      totalWT += waitingTime[i];
    }
    avgWT = totalWT / (double) numberOfProcess;
    avgTAT = totalTAT / (double) numberOfProcess;
    System.out.println("\n Average Waiting Time: " + avgWT);
    System.out.println(" Average Turn Around Time: " + avgTAT);
    sc.close();
  }
}
```

Output

```shell
Enter Number of Process: 4
...Process 1...
        Process Id : 1
        Burst Time Time : 2
        Priority : 1
...Process 2...
        Process Id : 2
        Burst Time Time : 4
        Priority : 6
...Process 3...
        Process Id : 3
        Burst Time Time : 8
        Priority : 2
...Process 4...
        Process Id : 4
        Burst Time Time : 7
        Priority : 3
Process ID      Burst Time      Waiting Time    Turn Around Time
1               2               0               2
3               8               2               10
4               7               10              17
2               4               17              21

 Average Waiting Time: 7.25
 Average Turn Around Time: 12.5
```

## Lab 5: Write a JAVA program to implement the Producer & consumer Problem (Semaphore)

```java
package code;

import java.util.concurrent.Semaphore;

class Q {

  // an item
  int item;

  // semCon initialized with 0 permits
  // to ensure put() executes first
  static Semaphore semCon = new Semaphore(0);

  static Semaphore semProd = new Semaphore(1);

  // to get an item from buffer
  void get() {
    try {
      // Before consumer can consume an item,
      // it must acquire a permit from semCon
      semCon.acquire();
    } catch (InterruptedException e) {
      System.out.println("InterruptedException caught");
    }

    // consumer consuming an item
    System.out.println("Consumer consumed item : " + item);

    // After consumer consumes the item,
    // it releases semProd to notify producer
    semProd.release();
  }

  // to put an item in buffer
  void put(int item) {
    try {
      // Before producer can produce an item,
      // it must acquire a permit from semProd
      semProd.acquire();
    } catch (InterruptedException e) {
      System.out.println("InterruptedException caught");
    }

    // producer producing an item
    this.item = item;

    System.out.println("Producer produced item : " + item);

    // After producer produces the item,
    // it releases semCon to notify consumer
    semCon.release();
  }
}

// Producer class
class Producer implements Runnable {

  Q q;

  Producer(Q q) {
    this.q = q;
    new Thread(this, "Producer").start();
  }

  public void run() {
    for (
      int i = 0;
      i < 5;
      i++
    ) q.put(i); // producer put items
  }
}

// Consumer class
class Consumer implements Runnable {

  Q q;

  Consumer(Q q) {
    this.q = q;
    new Thread(this, "Consumer").start();
  }

  public void run() {
    for (
      int i = 0;
      i < 5;
      i++
    ) q.get(); // consumer get items
  }
}

// Driver class
class PC {

  public static void main(String args[]) {
    // creating buffer queue
    Q q = new Q();

    // starting consumer thread
    new Consumer(q);

    // starting producer thread
    new Producer(q);
  }
}
```

Output

```shell
Producer produced item : 0
Consumer consumed item : 0
Producer produced item : 1
Consumer consumed item : 1
Producer produced item : 2
Consumer consumed item : 2
Producer produced item : 3
Consumer consumed item : 3
Producer produced item : 4
Consumer consumed item : 4
```

## Lab 6: Write a JAVA program to implement banker’s algorithm for dead lock avoidance

```java
package code;

class BankersAlgorithm {

  static int P = 5;
  static int R = 3;

  //Function to find the need of each process
  static void calculateNeed(int need[][], int maxm[][], int allot[][]) {
    for (int i = 0; i < P; i++) {
      for (int j = 0; j < R; j++) {
        need[i][j] = maxm[i][j] - allot[i][j];
      }
    }
  }

  //Function to find the system is in safe state or not
  static boolean isSafe(
    int processes[],
    int avail[],
    int maxm[][],
    int allot[][]
  ) {
    int[][] need = new int[P][R];
    calculateNeed(need, maxm, allot);
    boolean[] finish = new boolean[P];
    int[] safeSeq = new int[P];
    int[] work = new int[R];
    for (int i = 0; i < R; i++) {
      work[i] = avail[i];
    }

    int count = 0;
    while (count < P) {
      boolean found = false;
      for (int p = 0; p < P; p++) {
        if (finish[p] == false) {
          int j;
          for (j = 0; j < R; j++) {
            if (need[p][j] > work[j]) {
              break;
            }
          }

          if (j == R) {
            for (int k = 0; k < R; k++) {
              work[k] += allot[p][k];
            }
            safeSeq[count++] = p;
            finish[p] = true;
            found = true;
          }
        }
      }

      if (found == false) {
        System.out.print("System is not in safe state");
        return false;
      }
    }

    System.out.print("System is in safe state.\nSafe" + " sequence is: ");
    for (int i = 0; i < P; i++) {
      System.out.print(safeSeq[i] + " ");
    }

    return true;
  }

  public static void main(String[] args) {
    int processes[] = { 0, 1, 2, 3, 4 };
    int avail[] = { 3, 3, 2 };
    int maxm[][] = {
      { 7, 5, 3 },
      { 3, 2, 2 },
      { 9, 0, 2 },
      { 2, 2, 2 },
      { 4, 3, 3 },
    };

    int allot[][] = {
      { 0, 1, 0 },
      { 2, 0, 0 },
      { 3, 0, 2 },
      { 2, 1, 1 },
      { 0, 0, 2 },
    };

    isSafe(processes, avail, maxm, allot);
  }
}
```

Output

```shell
System is in safe state.
Safe sequence is: 1 3 4 0 2
```

## Lab 7: Write a JAVA program to simulate page replacement algorithms

### FIFO

```java
package code.lab7;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

class FIFO {

  // Method to find page faults using FIFO
  static int pageFaults(int pages[], int n, int capacity) {
    // To represent set of current pages. We use
    // an unordered_set so that we quickly check
    // if a page is present in set or not
    HashSet<Integer> s = new HashSet<>(capacity);

    // To store the pages in FIFO manner
    Queue<Integer> indexes = new LinkedList<>();

    // Start from initial page
    int page_faults = 0;
    for (int i = 0; i < n; i++) {
      // Check if the set can hold more pages
      if (s.size() < capacity) {
        // Insert it into set if not present
        // already which represents page fault
        if (!s.contains(pages[i])) {
          s.add(pages[i]);

          // increment page fault
          page_faults++;

          // Push the current page into the queue
          indexes.add(pages[i]);
        }
      }
      // If the set is full then need to perform FIFO
      // i.e. remove the first page of the queue from
      // set and queue both and insert the current page
      else {
        // Check if current page is not already
        // present in the set
        if (!s.contains(pages[i])) {
          //Pop the first page from the queue
          int val = indexes.peek();

          indexes.poll();

          // Remove the indexes page
          s.remove(val);

          // insert the current page
          s.add(pages[i]);

          // push the current page into
          // the queue
          indexes.add(pages[i]);

          // Increment page faults
          page_faults++;
        }
      }
    }

    return page_faults;
  }

  public static void main(String args[]) {
    int pages[] = { 7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2 };

    int capacity = 4;
    System.out.println(pageFaults(pages, pages.length, capacity));
  }
}
```

Output

```shell
7
```

### LRU

```java
package code.lab7;

import java.util.ArrayList;

public class LRU {

  public static void main(String[] args) {
    int capacity = 4;
    int arr[] = { 7, 0, 1, 2, 0, 3, 0, 4, 2, 3, 0, 3, 2 };

    // To represent set of current pages.We use
    // an Arraylist
    ArrayList<Integer> s = new ArrayList<>(capacity);
    int count = 0;
    int page_faults = 0;
    for (int i : arr) {
      // Insert it into set if not present
      // already which represents page fault
      if (!s.contains(i)) {
        // Check if the set can hold equal pages
        if (s.size() == capacity) {
          s.remove(0);
          s.add(capacity - 1, i);
        } else s.add(count, i);
        // Increment page faults
        page_faults++;
        ++count;
      } else {
        // Remove the indexes page
        s.remove((Object) i);
        // insert the current page
        s.add(s.size(), i);
      }
    }
    System.out.println(page_faults);
  }
}
```

Output

```shell
6
```

## Lab 8: Write a C programs to simulate disk scheduling algorithms

### FCFS

```java
package code.lab8;

class FCFS {

  static int size = 8;

  static void FCFS(int arr[], int head) {
    int seek_count = 0;
    int distance, cur_track;

    for (int i = 0; i < size; i++) {
      cur_track = arr[i];

      // calculate absolute distance
      distance = Math.abs(cur_track - head);

      // increase the total count
      seek_count += distance;

      // accessed track is now new head
      head = cur_track;
    }

    System.out.println("Total number of " + "seek operations = " + seek_count);

    // Seek sequence would be the same
    // as request array sequence
    System.out.println("Seek Sequence is");

    for (int i = 0; i < size; i++) {
      System.out.println(arr[i]);
    }
  }

  public static void main(String[] args) {
    // request array
    int arr[] = { 176, 79, 34, 60, 92, 11, 41, 114 };
    int head = 50;

    FCFS(arr, head);
  }
}
```

Output

```shell
Total number of seek operations = 510
Seek Sequence is
176
79
34
60
92
11
41
114
```

### SSTF

```java
package code.lab8;

class node {

  // represent difference between
  // head position and track number
  int distance = 0;

  // true if track has been accessed
  boolean accessed = false;
}

public class SSTF {

  // Calculates difference of each
  // track number with the head position
  public static void calculateDifference(int queue[], int head, node diff[]) {
    for (int i = 0; i < diff.length; i++) diff[i].distance =
      Math.abs(queue[i] - head);
  }

  // find unaccessed track
  // which is at minimum distance from head
  public static int findMin(node diff[]) {
    int index = -1, minimum = Integer.MAX_VALUE;

    for (int i = 0; i < diff.length; i++) {
      if (!diff[i].accessed && minimum > diff[i].distance) {
        minimum = diff[i].distance;
        index = i;
      }
    }
    return index;
  }

  public static void shortestSeekTimeFirst(int request[], int head) {
    if (request.length == 0) return;

    // create array of objects of class node
    node diff[] = new node[request.length];

    // initialize array
    for (int i = 0; i < diff.length; i++) diff[i] = new node();

    // count total number of seek operation
    int seek_count = 0;

    // stores sequence in which disk access is done
    int[] seek_sequence = new int[request.length + 1];

    for (int i = 0; i < request.length; i++) {
      seek_sequence[i] = head;
      calculateDifference(request, head, diff);

      int index = findMin(diff);

      diff[index].accessed = true;

      // increase the total count
      seek_count += diff[index].distance;

      // accessed track is now new head
      head = request[index];
    }

    // for last accessed track
    seek_sequence[seek_sequence.length - 1] = head;

    System.out.println("Total number of seek operations = " + seek_count);

    System.out.println("Seek Sequence is");

    // print the sequence
    for (int i = 0; i < seek_sequence.length; i++) System.out.println(
      seek_sequence[i]
    );
  }

  public static void main(String[] args) {
    // request array
    int arr[] = { 176, 79, 34, 60, 92, 11, 41, 114 };
    shortestSeekTimeFirst(arr, 50);
  }
}
```

Output

```shell
Total number of seek operations = 204
Seek Sequence is
50
41
34
11
60
79
92
114
176
```

### SCAN

```java
package code.lab8;

import java.util.*;

class SCAN {

  static int size = 8;
  static int disk_size = 200;

  static void SCAN(int arr[], int head, String direction) {
    int seek_count = 0;
    int distance, cur_track;
    Vector<Integer> left = new Vector<Integer>(), right = new Vector<Integer>();
    Vector<Integer> seek_sequence = new Vector<Integer>();

    // appending end values
    // which has to be visited
    // before reversing the direction
    if (direction == "left") left.add(0); else if (
      direction == "right"
    ) right.add(disk_size - 1);

    for (int i = 0; i < size; i++) {
      if (arr[i] < head) left.add(arr[i]);
      if (arr[i] > head) right.add(arr[i]);
    }

    // sorting left and right vectors
    Collections.sort(left);
    Collections.sort(right);

    // run the while loop two times.
    // one by one scanning right
    // and left of the head
    int run = 2;
    while (run-- > 0) {
      if (direction == "left") {
        for (int i = left.size() - 1; i >= 0; i--) {
          cur_track = left.get(i);

          // appending current track to seek sequence
          seek_sequence.add(cur_track);

          // calculate absolute distance
          distance = Math.abs(cur_track - head);

          // increase the total count
          seek_count += distance;

          // accessed track is now the new head
          head = cur_track;
        }
        direction = "right";
      } else if (direction == "right") {
        for (int i = 0; i < right.size(); i++) {
          cur_track = right.get(i);

          // appending current track to seek sequence
          seek_sequence.add(cur_track);

          // calculate absolute distance
          distance = Math.abs(cur_track - head);

          // increase the total count
          seek_count += distance;

          // accessed track is now new head
          head = cur_track;
        }
        direction = "left";
      }
    }

    System.out.print("Total number of seek operations = " + seek_count + "\n");

    System.out.print("Seek Sequence is" + "\n");

    for (int i = 0; i < seek_sequence.size(); i++) {
      System.out.print(seek_sequence.get(i) + "\n");
    }
  }

  public static void main(String[] args) {
    // request array
    int arr[] = { 176, 79, 34, 60, 92, 11, 41, 114 };
    int head = 50;
    String direction = "left";

    SCAN(arr, head, direction);
  }
}
```

Output

```shell
Total number of seek operations = 226
Seek Sequence is
41
34
11
0
60
79
92
114
176
```

---
