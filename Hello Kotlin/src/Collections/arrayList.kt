package Collections


fun main(){
    // two ways to declare arraylist
    val alist1= ArrayList<Any>() // with this we can not provide values
    val alist2= arrayListOf<Any>(1,2) //  value can be provided and the rest is same
    alist1.add("chinki")
    alist2.add("dds")
    println(alist1)


}