## Leetcode-problems by Myonster

**Link to [Google Spreadsheet](https://docs.google.com/spreadsheets/d/1vq68s0KxSqiKH7z1yNyLRWM813CaiUfC0Ec-g0j7f5w/edit?usp=sharing)**

---

### Solved LeetCode Problems

| Date    | #    | Name                                                      | Topics                                   | Difficulty | Link                                                                                             |
| ------- | ---- | --------------------------------------------------------- | ---------------------------------------- | ---------- | ------------------------------------------------------------------------------------------------ |
| 7/26/24 | 389  | Find the Difference                                       | Hash Table, String, Bit, Sort            | Easy       | [Here](https://leetcode.com/problems/find-the-difference/)                                       |
| 7/18/24 | 2971 | Merge Strings Alternately                                 | Two Pointers, String                     | Easy       | [Here](https://leetcode.com/problems/merge-strings-alternately/)                                 |
| 8/5/24  | 459  | Repeated Substring Pattern                                | String, Two Pointers                     | Easy       | [Here](https://leetcode.com/problems/repeated-substring-pattern/)                                |
| 8/5/24  | 66   | Plus One                                                  | Array, Math                              | Easy       | [Here](https://leetcode.com/problems/plus-one/)                                                  |
| 8/5/24  | 1822 | Sign of the Product of an Array                           | Array, Math                              | Easy       | [Here](https://leetcode.com/problems/sign-of-the-product-of-an-array/)                           |
| 8/5/24  | 1502 | Can Make Arithmetic Progression From Sequence             | Array, Sorting                           | Easy       | [Here](https://leetcode.com/problems/can-make-arithmetic-progression-from-sequence/)             |
| 8/5/24  | 896  | Monotonic Array                                           | Array                                    | Easy       | [Here](https://leetcode.com/problems/monotonic-array/)                                           |
| 8/5/24  | 13   | Roman to Integer                                          | Hash Table, Math, String                 | Easy       | [Here](https://leetcode.com/problems/roman-to-integer/)                                          |
| 8/5/24  | 58   | Length of Last Word                                       | String                                   | Easy       | [Here](https://leetcode.com/problems/length-of-last-word/)                                       |
| 8/5/24  | 709  | To Lower Case                                             | String                                   | Easy       | [Here](https://leetcode.com/problems/to-lower-case/)                                             |
| 8/5/24  | 682  | Baseball Game                                             | Array, Stack                             | Easy       | [Here](https://leetcode.com/problems/baseball-game/)                                             |
| 8/5/24  | 657  | Robot Return to Origin                                    | String, Simulation                       | Easy       | [Here](https://leetcode.com/problems/robot-return-to-origin/)                                    |
| 8/5/24  | 1275 | Find Winner on a Tic Tac Toe Game                         | Array, Matrix                            | Easy       | [Here](https://leetcode.com/problems/find-winner-on-a-tic-tac-toe-game/)                         |
| 8/5/24  | 1041 | Robot Bounded In Circle                                   | Array, Math, Simulation                  | Medium     | [Here](https://leetcode.com/problems/robot-bounded-in-circle/)                                   |
| 8/5/24  | 1672 | Richest Customer Wealth                                   | Array, Simulation                        | Easy       | [Here](https://leetcode.com/problems/richest-customer-wealth/)                                   |
| 8/5/24  | 1572 | Matrix Diagonal Sum                                       | Array, Matrix                            | Easy       | [Here](https://leetcode.com/problems/matrix-diagonal-sum/)                                       |
| 8/5/24  | 54   | Spiral Matrix                                             | Array, Matrix                            | Medium     | [Here](https://leetcode.com/problems/spiral-matrix/)                                             |
| 8/5/24  | 1523 | Count Odd Numbers in an Interval Range                    | Math                                     | Easy       | [Here](https://leetcode.com/problems/count-odd-numbers-in-an-interval-range/)                    |
| 8/5/24  | 1491 | Average Salary Excluding the Minimum and Maximum Salary   | Array, Math                              | Easy       | [Here](https://leetcode.com/problems/average-salary-excluding-the-minimum-and-maximum-salary/)   |
| 8/5/24  | 860  | Lemonade Change                                           | Array, Greedy                            | Easy       | [Here](https://leetcode.com/problems/lemonade-change/)                                           |
| 8/5/24  | 976  | Largest Perimeter Triangle                                | Array, Math, Greedy                      | Easy       | [Here](https://leetcode.com/problems/largest-perimeter-triangle/)                                |
| 8/5/24  | 1232 | Check if It Is a Straight Line                            | Array, Math, Geometry                    | Easy       | [Here](https://leetcode.com/problems/check-if-it-is-a-straight-line/)                            |
| 8/5/24  | 67   | Add Binary                                                | String, Math                             | Easy       | [Here](https://leetcode.com/problems/add-binary/)                                                |
| 8/5/24  | 43   | Multiply Strings                                          | String, Math                             | Medium     | [Here](https://leetcode.com/problems/multiply-strings/)                                          |

---

### Performance Notes

- **8ms beats 92.59%**  
**Problem**: no.459 Repeated Substring Pattern (8/5/24)  
**Note**: Better to use two pointers. My solution runs O(nlogn) but can be optimized to O(n).

- **0ms beats 100%**  
**Problem**: no.66 Plus One (8/5/24)  
**Note**: Done iteratively.

- **0ms beats 100%**  
**Problem**: no. 1822 Signs of the Product on an Array  
**Note**: Simple.

- **3ms beats 14%**  
**Problem**: no.1502 Can Make Arithmetic Progression From Sequence  
**Note**: Simple, sort and check a[0] - a[1] and continue traversing.

- **1ms beats 98.59%**  
**Problem**: no.896 Monotonic Array  
**Note**: Simple, set up 2 boolean conditions (presence of trend, increasing/decreasing). There will be a scenario where it just starts from 0 diff.

- **10ms beats 10%**  
**Problem**: no. 13 Roman to Integer  
**Note**: Used hashmap, online solutions used case and switch (need to learn more on this). Both approaches are still O(n).

- **0ms beats 100%**  
**Problem**: no. 58 Length of Last Word  
**Note**: Used built-in Java string methods like `strip()` to remove white spaces for edge cases and `lastIndexOf(" ")`.

- **0ms beats 100%**  
**Problem**: no. 709 To Lower Case  
**Note**: Simple built-in syntax for Java `.toLowerCase()`.

- **2ms beats 88%**  
**Problem**: no. 682 Baseball Game  
**Note**: Used stack to peek, pop, and push different operations to maintain O(1) operations and ensure O(N) for the whole algo.

- **4ms beats 96.77%**  
**Problem**: no. 657 Robot Return to Origin  
**Note**: Used an array size of 2 to depict x-y axis, each operation is like moving along the graph. O(n) time.

- **0ms beats 100%**  
**Problem**: no. 1275 Find Winner on a Tic Tac Toe Game  
**Note**: Array question. Tackled it by making a large array for easier counting. There are 4 win conditions (horizontal, vertical, and 2 diagonals). Player A was given a positive +1 count for his position and player B was given -1. Check if one of the 4 win conditions adds up to +3 or -3.

- **1ms beats 22%**  
**Problem**: no. 1041 Robot Bounded In Circle {MEDIUM}  
**Note**: Loop it 4 times to see if it goes back to (0,0) in recursion to find the last location. There might be a better way.

- **2ms beats 20%**  
**Problem**: no. 1672 Richest Customer Wealth  
**Note**: O(m x n), question of Java optimization (streams parallel better or just 2 iterative for loops?).

- **0ms beats 100%**  
**Problem**: no. 1572 Matrix Diagonal Sum  
**Note**: O(n). Note how each index of the array correlates to which number gets selected in the particular row.

- **0ms beats 100%**  
**Problem**: no. 54 Spiral Matrix  
**Note**: O(nlogn). Traversing the matrices, include directions and boundaries. Also, handle edge cases properly.

- **0ms beats 100%**  
**Problem**: no. 1523 Count Odd Numbers in an Interval Range  
**Note**: Math logic: (3,7) => 7-3+1 => to get numbers involved, then /2 and +1 if both are odd.

- **2ms beats 5%**  
**Problem**: no.1491 Average Salary Excluding the Minimum and Maximum Salary  
**Note**: Learned about `Integer.MAX_VALUE` and `Integer.MIN_VALUE`. Could be faster without factoring `BigDecimal`.

- **2ms beats 95.30%**  
**Problem**: no. 860 Lemonade Change  
**Note**: Simple math with if-else and switch-case conditions. Use the $10 to change $20 first if possible.

- **2ms beats 98.58%**  
**Problem**: no. 976 Largest Perimeter Triangle  
**Note**: Sum of 2 sides must be bigger than one side. Sort array and check from the back for optimization.

- **0ms beats 100%**  
**Problem**: no. 1232 Check if It Is a Straight Line  
**Note**: Focus on math. y = mx + c, 3 flagging conditions: run=0 (horizontal line), rise=0 (vertical line), rise/run (normal slope).

- **3ms beats 25%**  
**Problem**: no. 67 Add Binary  
**Note**: Tackled different string lengths with `StringBuilder`, reverse and setLength, but need to find a more efficient way.

- **3ms beats 59.14%**  
**Problem**: no. 43 Multiply Strings  
**Note**: Traditional multiplication algorithm, no BigInteger or direct int conversion. O(m+n) space, O(m*n) time.

---

### About Me

My name is **Jeremy**. I'm a computing student who loves coding and programming.

**Check out my projects**: [My GitHub](https://github.com/myonster)

---
