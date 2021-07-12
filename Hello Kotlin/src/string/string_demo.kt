package string

fun main() {
    string_demo()
    getCharFromString(2, "aakansha")
}

fun string_demo() {
    //string is immuatable object which means you can not change
    val name: String = "aakansha singh"
    val name2: String = "aakansha singh"
    val name3 = buildString { append("aakansha singh") }// this is use to create object  somewhere else in memory
    print("this is to check that weather they are stored in same address or not :")
    println(name === name2)
    print("this is to check weather they are equal or not : ")
    println(name == name2)
    print("this is to check that weather they are stored in same address or not :")
    println(name3 === name2)
    print("this is to check weather they are equal or not : ")
    println(name3==name2)
}

fun getCharFromString(index: Int, str: String) {
    if (index > str.length) println("index is not right")
    else println("char at $index is " + str.get(index))

}
