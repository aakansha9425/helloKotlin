package NullSafety

fun  main(){
    functionToCheckString()
}

fun functionToCheckString() {
    //is operator is to check the type of a varibale wheather it is a string or int ,.....
    var str:Any=10
    if (str is String){
        println("this is string and having length ${str.length}")
    }else{
        println("str is not a string")
    }
}
