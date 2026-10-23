# Top Most Asked Coding Interview Questions (Ranked by Frequency)

## Tier 1: Previous Interview

### 1. Move Zeros
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.
* **Category:** Arrays
* **Input:** `nums = [2,7,0,15,0,11]`
* **Output:** `[0,0,2,7,15,11]`
---

## Tier 1: Core Essentials (Highest Frequency)

### 1. Two Sum
Given an array of integers `nums` and an integer `target`, return indices of the two numbers such that they add up to `target`.
* **Category:** Arrays / Hashing
* **Input:** `nums = [2,7,11,15]`, `target = 9`
* **Output:** `[0,1]`

### 2. Valid Parentheses
Given a string `s` containing just the characters `'('`, `')'`, `'{'`, `'}'`, `'['` and `']'`, determine if the input string is valid.
* **Category:** Stacks
* **Input:** `s = "()[]{}"`
* **Output:** `true`

### 3. Best Time to Buy and Sell Stock
Given an array `prices` where `prices[i]` is the price of a given stock on the $i^{\text{th}}$ day, find the maximum profit you can achieve from a single transaction.
* **Category:** Arrays / Dynamic Programming
* **Input:** `prices = [7,1,5,3,6,4]`
* **Output:** `5`

### 4. Reverse Linked List
Given the head of a singly linked list, reverse the list, and return the reversed list's head.
* **Category:** Linked Lists
* **Input:** `head = [1,2,3,4,5]`
* **Output:** `[5,4,3,2,1]`

### 5. Merge Two Sorted Lists
Merge two sorted linked lists and return it as a sorted list by splicing together the nodes of the first two lists.
* **Category:** Linked Lists
* **Input:** `list1 = [1,2,4]`, `list2 = [1,3,4]`
* **Output:** `[1,1,2,3,4,4]`

### 6. Number of Islands
Given an $m \times n$ 2D binary grid representing a map of `'1'`s (land) and `'0'`s (water), return the number of islands.
* **Category:** Graphs (BFS / DFS)
* **Input:** `grid = [["1","1","0"],["1","1","0"],["0","0","1"]]`
* **Output:** `2`

### 7. Longest Substring Without Repeating Characters
Given a string `s`, find the length of the longest substring without repeating characters.
* **Category:** Sliding Window
* **Input:** `s = "abcabcbb"`
* **Output:** `3`

### 8. Maximum Subarray (Kadane's Algorithm)
Given an integer array `nums`, find the subarray with the largest sum, and return its sum.
* **Category:** Dynamic Programming / Greedy
* **Input:** `nums = [-2,1,-3,4,-1,2,1,-5,4]`
* **Output:** `6`

---

## Tier 2: Frequently Tested Patterns

### 9. 3Sum
Given an integer array `nums`, return all unique triplets `[nums[i], nums[j], nums[k]]` such that their sum equals `0`.
* **Category:** Two Pointers
* **Input:** `nums = [-1,0,1,2,-1,-4]`
* **Output:** `[[-1,-1,2],[-1,0,1]]`

### 10. Container With Most Water
Find two lines on a grid that together with the x-axis form a container holding the most water.
* **Category:** Two Pointers
* **Input:** `height = [1,8,6,2,5,4,8,3,7]`
* **Output:** `49`

### 11. Linked List Cycle
Determine if a given linked list contains a cycle.
* **Category:** Fast & Slow Pointers
* **Input:** `head = [3,2,0,-4]`, `pos = 1`
* **Output:** `true`

### 12. Product of Array Except Self
Return an array `answer` such that `answer[i]` is equal to the product of all elements of `nums` except `nums[i]`, without using division.
* **Category:** Prefix Sum
* **Input:** `nums = [1,2,3,4]`
* **Output:** `[24,12,8,6]`

### 13. Subarray Sum Equals K
Return the total number of contiguous subarrays whose sum equals `k`.
* **Category:** Prefix Sum + Hash Map
* **Input:** `nums = [1,1,1]`, `k = 2`
* **Output:** `2`

### 14. Merge Intervals
Given an array of intervals, merge all overlapping intervals.
* **Category:** Merge Intervals
* **Input:** `intervals = [[1,3],[2,6],[8,10],[15,18]]`
* **Output:** `[[1,6],[8,10],[15,18]]`

### 15. Binary Tree Level Order Traversal
Return the level order traversal of a binary tree's nodes' values (level by level, left to right).
* **Category:** Tree BFS
* **Input:** `root = [3,9,20,null,null,15,7]`
* **Output:** `[[3],[9,20],[15,7]]`

### 16. Kth Largest Element in an Array
Find the $k^{\text{th}}$ largest element in an unsorted array.
* **Category:** Heap / Priority Queue
* **Input:** `nums = [3,2,1,5,6,4]`, `k = 2`
* **Output:** `5`

### 17. Search in Rotated Sorted Array
Search for a `target` value in an ascending array that has been rotated at an unknown pivot in $O(\log n)$ time.
* **Category:** Modified Binary Search
* **Input:** `nums = [4,5,6,7,0,1,2]`, `target = 0`
* **Output:** `4`

### 18. Subsets
Given an integer array `nums` of unique elements, return all possible subsets (the power set).
* **Category:** Backtracking
* **Input:** `nums = [1,2,3]`
* **Output:** `[[],[1],[2],[1,2],[3],[1,3],[2,3],[1,2,3]]`

### 19. Coin Change
Return the fewest number of coins needed to make up a target amount.
* **Category:** Dynamic Programming
* **Input:** `coins = [1,2,5]`, `amount = 11`
* **Output:** `3`

### 20. Course Schedule
Determine if you can finish all courses given a list of prerequisite pairs (topological sort / cycle detection).
* **Category:** Graph DFS/BFS
* **Input:** `numCourses = 2`, `prerequisites = [[1,0]]`
* **Output:** `true`