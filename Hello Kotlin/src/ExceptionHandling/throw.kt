package ExceptionHandling

import java.lang.ArithmeticException

fun main(){
    throwExceptionFunction()
}

fun throwExceptionFunction() {
    var age=16
    if (age<18) throw ArithmeticException("your age is less apply after getting older")
    else println("yeahh! you get your license")

}
