```groovy
def myMethod(List<String> strings) {
  strings.eachWithIndex { str, index ->
    strings[index] = str.toUpperCase()
  }
}

List<String> myList = ['apple', 'banana', 'cherry']
myMethod(myList)
println myList // Output: [APPLE, BANANA, CHERRY]
```