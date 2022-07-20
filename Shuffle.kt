// .shufled() built in function creates a shuffled version of a list or array
// Only mutable lists can be shuffled in-place.
// Immutable lists cannot be shuffled in-place.



fun main() {
	val x = listOf(1,2,3,4,5,6)
    
	val y = x.shuffled()
    
    println("$x -> $y")
}

// Output: 1,2,3,4,5,6 -> 6,3,1,2,5,4 (or other random order)