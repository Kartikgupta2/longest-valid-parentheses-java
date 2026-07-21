# longest-valid-parentheses-java


## Problem
Given a string containing only '(' and ')', return the length of the longest valid (well-formed) parentheses substring.

## Solution
This solution uses a stack to efficiently track valid parentheses and computes the maximum valid substring length.

- Language: Java
- Time Complexity: O(n)
- Space Complexity: O(n)

## Example

Input:
```
(() 
```
Output:
```
2
```

Input:
```
)()())
```
Output:
```
4
```

Input:
```

```
Output:
```
0
```
