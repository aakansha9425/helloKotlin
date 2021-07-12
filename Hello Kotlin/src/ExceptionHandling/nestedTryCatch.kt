package ExceptionHandling

import java.lang.ArithmeticException
import java.lang.IndexOutOfBoundsException

fun main() {
    nestedExceptionFunction()
}

fun nestedExceptionFunction() {
    var arr1: IntArray = intArrayOf(1, 2, 0, 5)
    var arr2: IntArray = intArrayOf(1, 2, 0, 5, 7, 8)
    try {
        for (i in arr2.indices) {
            try {
                println(arr2[i] / arr1[i])
            } catch (e: ArithmeticException) {
                println(e)
            }

        }
    } catch (e: IndexOutOfBoundsException) {
        println(e)
    }
    finally {
        println("by using finally this block will executed every time no matter if try or catch run or not")
    }

}
