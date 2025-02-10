# Groovy List Modification Bug

This repository demonstrates a common Groovy gotcha related to list modification within methods.  The `myMethod` function attempts to convert strings to uppercase but fails to change the original list because of the way Groovy handles method invocations.

The `bug.groovy` file showcases the issue, and the solution is presented in `bugSolution.groovy`.

## How to reproduce the bug

1. Clone this repository.
2. Run `groovy bug.groovy`. Observe the output list remains unchanged.

## Solution

The `bugSolution.groovy` file provides the corrected implementation.