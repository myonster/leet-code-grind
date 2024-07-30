# LeetCode Problem Solutions

Welcome to my LeetCode problem solutions repository! This README is designed to help me revise and keep track of the problems I’ve solved, their complexities, and other relevant details.

## Table of Contents

1. [Easy Problems](#easy-problems)
2. [Medium Problems](#medium-problems)
3. [Hard Problems](#hard-problems)

## Problem Categories

### Easy Problems

#### 1. **Two Sum** 🟢
- **Complexity**: 
  - **Time**: O(n)
  - **Space**: O(n)
- **Extra Notes**: 
  - Use a hash map to store the difference between the target and each element.
- **Explanation**:
  - Iterate through the array and check if the current element’s complement (target - current element) exists in the hash map.
- **Tags**: `#array`, `#hashmap`

#### 2. **Best Time to Buy and Sell Stock** 🟢
- **Complexity**: 
  - **Time**: O(n)
  - **Space**: O(1)
- **Extra Notes**: 
  - Keep track of the minimum price and calculate the maximum profit at each step.
- **Explanation**:
  - Iterate through the prices and update the minimum price and maximum profit accordingly.
- **Tags**: `#array`, `#dynamic-programming`

#### 3. **Reverse Linked List** 🟢
- **Complexity**: 
  - **Time**: O(n)
  - **Space**: O(1)
- **Extra Notes**: 
  - Use three pointers to reverse the linked list in place.
- **Explanation**:
  - Traverse the list while changing the next pointers to point to the previous node.
- **Tags**: `#linkedlist`, `#in-place`

#### 4. **Climbing Stairs** 🟢
- **Complexity**: 
  - **Time**: O(n)
  - **Space**: O(1)
- **Extra Notes**: 
  - Similar to the Fibonacci sequence, where each state depends on the previous two states.
- **Explanation**:
  - Use two variables to keep track of the number of ways to reach the current and previous steps.
- **Tags**: `#dynamic-programming`, `#fibonacci`

### Medium Problems

#### 1. **Longest Substring Without Repeating Characters** 🟡
- **Complexity**: 
  - **Time**: O(n)
  - **Space**: O(min(n, m)), where m is the size of the character set.
- **Extra Notes**: 
  - Use a sliding window approach to keep track of the current substring without duplicates.
- **Explanation**:
  - Expand the window by moving the right pointer, and shrink it by moving the left pointer when a duplicate character is found.
- **Tags**: `#string`, `#sliding-window`

#### 2. **Binary Tree Inorder Traversal** 🟡
- **Complexity**: 
  - **Time**: O(n)
  - **Space**: O(n)
- **Extra Notes**: 
  - Can be done iteratively using a stack or recursively.
- **Explanation**:
  - Traverse the left subtree, visit the root, and then traverse the right subtree.
- **Tags**: `#tree`, `#traversal`

#### 3. **Number of Islands** 🟡
- **Complexity**: 
  - **Time**: O(n * m)
  - **Space**: O(min(n, m))
- **Extra Notes**: 
  - Use Depth-First Search (DFS) to mark all adjacent lands.
- **Explanation**:
  - Iterate through the grid, and for each land cell, perform a DFS to mark all connected land cells.
- **Tags**: `#graph`, `#dfs`, `#bfs`

### Hard Problems

#### 1. **LRU Cache** 🔴
- **Complexity**: 
  - **Time**: O(1) for both get and put operations.
  - **Space**: O(capacity)
- **Extra Notes**: 
  - Use a combination of a hash map and a doubly linked list.
- **Explanation**:
  - The hash map provides fast access, while the doubly linked list maintains the order of elements.
- **Tags**: `#cache`, `#design`
