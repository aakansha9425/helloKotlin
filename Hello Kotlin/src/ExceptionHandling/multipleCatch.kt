package ExceptionHandling

import java.lang.ArithmeticException
import java.lang.Exception
import java.lang.NullPointerException

fun main(){
    multipleExceptionFunction(10)
}

fun multipleExceptionFunction(num: Int) {
    try {
        var ans=num/0
        print(ans)

        //Exception will be handles top to down if one catch block get run other will not be runned
    }catch (e:Exception){
        println("main class of Exception")
    }catch (e:ArithmeticException){
        println(e)
    }catch (e:NullPointerException){
        println(e)
    }

}
