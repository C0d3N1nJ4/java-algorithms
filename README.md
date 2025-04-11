# java-algorithms

This repository contains algorithms for :

1. Arrays
2. Hashmaps
3. Linkedlists
4. Queues
5. Stacks
6. Strings


### 📝 Code Formatting
We use Google Java Format to maintain a consistent code style throughout the project. The formatting is automatically checked as part of the build process using the Spotless Maven Plugin.

**How to Format the Code**

To automatically format your code, run:

```sh
   mvn spotless:apply
```

**How to Check Formatting**
To check if your code is correctly formatted, run:
```sh
   mvn spotless:check
```
If the formatting check fails during the build, use the spotless:apply command to fix the issues.