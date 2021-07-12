package functions

fun main(){
    //when nothing passed
    default_args()
    //when one passed
    default_args(7)
    //u can not use char in first place
    //default_args('k')
    //to use char at first place u have to use the argument name (named arguments
    default_args(letter = 'k')
    default_args(7,'j')
}

fun default_args(num:Int =5,letter:Char='x'){
    println("the   values are  $num and $letter")
}