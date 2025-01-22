# Kotlin Map Function and Nullable Lists

This repository demonstrates a common error encountered when using the `map` function in Kotlin with nullable lists.  The code showcases the problem and provides a solution to handle potential `NullPointerExceptions`. 

## Problem

The `map` function in Kotlin is a powerful tool for transforming lists, but if the list is nullable and you don't handle the null case, a `NullPointerException` can occur. This is demonstrated in `bug.kt`.

## Solution

The solution presented in `bugSolution.kt` demonstrates how to safely handle nullable lists by using the safe call operator (`?.`) and the elvis operator (`?:`).  This ensures that the code executes gracefully even if the list is null.