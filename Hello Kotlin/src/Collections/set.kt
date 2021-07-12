package Collections

fun main() {
    //kotlin set interface unordered collection of elements
    //does not support duplicate elements
    //immutable

    val set1 = setOf<Any>(1, 2, 3, 4, 5)
    println(set1)
    println(set1.isEmpty())
    println(set1.drop(2))
    println(set1.elementAt(2))
    //mutableset interface
    println("\n")
    mutableSet()
    println("\n")
    hashset()

}

fun hashset() {
    val hset1= hashSetOf<Any>(1,2,3,4,5,6)
    hset1.add(7)
    println(hset1)
}

fun mutableSet() {
    val mset1 = mutableSetOf<Any>(1,2,3,4,5)
    mset1.add(6)
    println(mset1)
    //.remove(),

}
