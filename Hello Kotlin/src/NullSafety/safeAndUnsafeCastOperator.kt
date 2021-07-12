package NullSafety

fun main(){

    //to cast from one data type to another we need as operator
    var name:Any? =null
    var name2:String?=name as String?
    println(name2)


    val num :Int?=name as? Int
    println(num)

}