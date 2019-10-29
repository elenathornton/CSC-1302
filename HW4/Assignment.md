## Homework 4

1. Write a program that calls a recursive method called multiply that takes two integer parameters a and b, where a and b are both positive integers. You can only use the +
or – for multiplication.

2. Write a program that calls a recursive method called writeSequence that accepts an integer n as a parameter and prints a symmetric sequence of n numbers with descending integers ending in 1 followed by ascending integers beginning with 1, as in the table below:

|Call				|Output				|
|--- 				|---   				|
|writeSequence(1);	|1					|
|writeSequence(2);	|1 1				|
|writeSequence(3);	|2 1 2				|
|writeSequence(4);	|2 1 1 2			|
|writeSequence(5);	|3 2 1 2 3			|
|writeSequence(6);	|3 2 1 1 2 3		|
|writeSequence(7);	|4 3 2 1 2 3 4		|
|writeSequence(8);	|4 3 2 1 1 2 3 4	|
|writeSequence(9);	|5 4 3 2 1 2 3 4 5	|
|writeSequence(10);	|5 4 3 2 1 1 2 3 5	|

Notice that for odd numbers the sequence has a single 1 in the middle while for even values it has two 1s in the middle. A client using this method would have to call println to print the line of output.
