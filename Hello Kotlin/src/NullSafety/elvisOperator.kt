package NullSafety

fun main() {
    //to find the length of any operator we havr used if else instead we can also use elvis operator
    val str: String? = null
    val str2: String? = "chinki"
    val len = str?.length ?: -1
    val len2 = str2?.length ?: -1
    println(len)
    println(len2)

}