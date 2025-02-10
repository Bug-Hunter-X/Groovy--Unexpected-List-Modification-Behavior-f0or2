```groovy
def myMethod(List<String> strings) {
  strings.each { it.toUpperCase() }
}

List<String> myList = ['apple', 'banana', 'cherry']
myMethod(myList)
println myList // Output: [apple, banana, cherry]
```