package NullSafety

import java.lang.Exception
import java.lang.NullPointerException

fun main(){
    var name: String ="aakansha singh "     // it is a non nullable type string , to make it nullable we have to add '?'
    var name2:String?="chinki "
    println(name)
    println(name2)
    // name= null will give error to us as it is nullable type
    name2=null
    println(name2)
    // if the value of string is null so you  can not directly find the length of  a string
    //but you can create your scnerio
    if (name2!=null){
        println(name2.length)
    }else
    {
        println("-1")
    }
}