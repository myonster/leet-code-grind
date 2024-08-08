## Leetcode-problems by Myonster

**Link to [Google Spreadsheet](https://docs.google.com/spreadsheets/d/1vq68s0KxSqiKH7z1yNyLRWM813CaiUfC0Ec-g0j7f5w/edit?usp=sharing)**

<br>

## Solved LeetCode Problems

| Date    | #    | Name                                                      | Topics                                   | Difficulty | Link                                                                                             |
| ------- | ---- | --------------------------------------------------------- | ---------------------------------------- | ---------- | ------------------------------------------------------------------------------------------------ |
| 7/26/24 | 389  | Find the Difference                                       | Hash Table String Bit Manipulation Sort  | Easy       | [Here](https://leetcode.com/problems/find-the-difference/)                                       |
| 7/18/24 | 2971 | Merge Strings Alternately                                 | Two Pointers String                      | Easy       | [Here](https://leetcode.com/problems/merge-strings-alternately/)                                 |
|
<br>

8ms beats 92.59%
no.459 Repeated Substring Pattern 8/5/24
(better to use two pointer) my solution runs O(nlogn) but we can do it in O(n)

0ms beats 100%
no.66 Plus One 8/5/24
done iteratively

runtime: 0ms beats 100%
no. 1822 Signs of the Product on an Array
simple

runtime: 3ms beats 14%
no.1502 Can Make Arithmetic Progression From Sequence
simple 1. sort 2. check a[0] - a[1] and continue traversing

runtime: 1ms beats 98.59%
no.896 Monotonic Array
simple 1. set up 2 boolean condition => 1.presence of trend 2.increasing/decreasing ==> there will be a scenario where it just starts from 0 diff

runtime: 10ms beats 10%
no. 13 Roman to Integer
i used hashmap, solutions online used case and switch(have to learn more on this)
but both case it still O(n)

runtime: 0ms beats 100%
no. 58 Length of Last Word
simple built in java string methods => strip() to remove white spaces for edge cases and used lastIndexOf(" ")

runtime: 0ms beats 100%
no. 709. To Lower Case
simple built in syntax for java .toLowerCase();

runtime: 2ms beats 88%
no. 682 Baseball Game
used stack to peek pop and push different operations to maintain O(1) operations to ensure O(N) for the whole algo


runtime: 4ms beats 96.77%
no. 657 Robot Return to Origin
array size of 2 to depict x-y axis => each operation is used as moving along the graph
O(n) time

runtime: 0ms beats 100%
no. 1275 Find Winner on a Tic Tac Toe Game
Array question, i tackle it by giving making an large array so easier to count, there is 4 win con -> horizontal vertical and 2 diagonals for every position if we look at
it from a free space board, so overflowing position counts will be added but it will be +0 count; player A was given positive -1 count for his position
and player B was given -1 for his position, then we can just check if the one of the 4 win con adds up to +3 or -3.

runtime: 1ms beats 22%
no. 1041. Robot Bounded In Circle {MEDIUM}
loop it 4 times to see if it goes back to (0,0) => in recursion to find the last location,
maybe there is a better way?

runtime: 2ms beats 20%
no. 1672 Richest Customer Wealth
O(m x n) => no other way but a question of java optimisation ==> streams parallel better or just 2 iterative for loops?

runtime: 0ms beats 100%
no. 1572 Matrix Diagonal Sum
O(n) => take note of how each index of the array correlates to which number gets selected in the particular row

[1,2,3] 0th index => row[0] = 1  row[length - 1 - *0*] = 3 sum -> 4
[4,5,6] 1st index => row[1] = 5  row[length - 1 - *1*] = 5 sum -> 4 + 5 (but we cannot double add this so always check if the [index] we are calling is the same) 
[7,8,9] 2nd index => row[2] = 9  row[length - 1 - *2*] = 7 sum -> 4 + 5 + 9 +7


runtime: 0ms beats 100%
no. 54 Spiral Matrix
O(nlogn) => travesering the matrices => include directions and boundaries and also extra conditions to handle edge cases
main thing to take note of was to properly handle each change in direction and proper boundary change 

runtime: 0ms beats 100%
no. 1523 Count Odd Numbers in an Interval Range
just need to know the logic of math => (3,7) => 7-3+1 => to get numbers involved and then / 2 and + 1 if both are odd;


### About me

My name is **jeremy** I'm a computing student who loves coding and programming.

one day🙏
Check out my projects: https://github.com/myonster
