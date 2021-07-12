package functions

var a = 10

fun  main(){
    // there are two types of function 1)standard library function(which is defined already in the compiler)
    //2)user defined function(which is defined by the user itself)

    //standard library function
    println(Math.max(12,45))
    //user defined function
    println(greaternum(12,45))
    //user defined function without parameter
    greaternum2()
    //recursion function
    rec()
    println(fact(5))
    println(recsum(100000,0))



}

// user defined function parameterized
fun greaternum(a:Int,  b :Int):Int{
    if(a>b){
        return a
    }else{
        return b
    }
}

// user defined function without parameterized

fun greaternum2(){
    var a=43
    var b = 46
    if(a>b){
        print("$a")
    }else{
        print("$b")
    }
}

// recurrsion fun
fun rec(){
    a--
    if(a>=8){
        println("$a")
        rec()
    }
}

// factorial function using recurssion
fun fact(num:Int):Long{
    return if(num==1) num.toLong()
    else{
        num*fact(num-1)
    }
}

//sum of n numbers using recurssion
//this is normal recurssion so if we provide large number such as 100000 it will give us error that stack is overflow
// to overcome this problem we used tail recursion in which the calculated result will be pass as arguments
fun recsum(num:Int):Long{
    return if(num==1){
        num.toLong()
    }else{
        num+recsum(num-1)
    }
}

tailrec fun recsum(num:Int,answer:Long=0):Long{
    return if(num==0) answer
    else{
        recsum((num-1),num+answer)
    }

}