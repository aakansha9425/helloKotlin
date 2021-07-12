package Collections

fun main(){
    //two ways to declare aray
    val arr1= arrayOf<Int>(1,2,3,4,5)
    val arr2:IntArray= intArrayOf(1,2,3,4)

    println(arr1.get(2))
    arr1.set(2,7)//to set an array element
    printArrays(arr1)
    println(arr1.size)// to get the size



}

fun printArrays(arr: Array<Int>) {
    for (i in arr){
        println(i)
    }
    println()
}

