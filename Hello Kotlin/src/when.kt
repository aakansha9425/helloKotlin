fun main() {
//it is same as switch statement in other languages
    var number = 7
    var numberProvider = when(number) {
        1 -> {//to use multiline inside
            "one"}
        2,6 -> "two"  // when u have to provide multiple condition at once
        3 -> "three"
        4 -> "four"
        in 5..10 -> "five-ten" // when u want to provide a range of input
        else -> "invalid number"
    }

    println(numberProvider)
}