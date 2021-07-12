package Collections

fun main() {
    //declare list->immuatble
    val list1 = listOf<Any>(1, "hello", 3.45, 2, 5, 6)
    val list2 = listOf<Any>(1, 3, 6)



    //print list
    println(list1)
    println(list2)
    // methods-> containAll,sublist
    println(list1.containsAll(list2))
    println(list1.subList(0,4))
    //println(list1.lastIndexOf(2))
    println(list1.size)
    println(list1.contains(1))
    println(list1.isEmpty())
    println(list1.drop(3))
    println(list1.dropLast(3))
    println(list1)



    //mutable list
    val list3 = mutableListOf<Any>(1,2,3,4,5)
    val list4= mutableListOf<Any>(1,2,3,4,5)
    list3.add("chinki")
    list3.addAll(list4)
    list3.removeAt(2)
    list3.removeAll(list4)
    println(list3)

    println(list3)


}