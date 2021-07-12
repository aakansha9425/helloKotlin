package ExceptionHandling

import java.lang.ArithmeticException

fun main(){
    arthematicException(10)
}

fun arthematicException(num: Int) {
    // how to handle such type of statemnt s-> var ans=num/0
    try {
        var ans=num/0
    }catch (e:ArithmeticException){
        println(e)
    }

}
