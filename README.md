# Longest Valid Parentheses (Java)

## Problem
Given a string containing only '(' and ')', return the length of the longest valid (well-formed) parentheses substring.

## Approach
The solution uses a **stack** to keep track of indices of parentheses. It calculates the maximum length of a valid substring while traversing the string only once.

- **Language:** Java
- **Time Complexity:** O(n)
- **Space Complexity:** O(n)

## Examples

**Input:** `(()`  
**Output:** `2`

**Input:** `)()())`  
**Output:** `4`

**Input:** `` (empty string)  
**Output:** `0`

## How to Run

```bash
javac Solution.java
java Solution
```
