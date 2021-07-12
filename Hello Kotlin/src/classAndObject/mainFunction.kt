package classAndObject

fun main(){
    var holder1=Account()
    holder1.insert(1,"holder 1")
    holder1.display()
    val holder2=Account.AccountNestedClass()
    holder2.insert(12)
    holder2.display()
    val holder3=Account().AccountInnerClass()
    holder3.insert(14)
    holder3.display()

}