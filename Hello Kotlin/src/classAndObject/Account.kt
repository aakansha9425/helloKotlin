package classAndObject

class Account {
     var aid:Int=0
    private var adesc:String=""

    fun insert(aid:Int,adesc:String){
        this.aid=aid
        this.adesc=adesc
    }
    fun display(){
        println("Account id ${aid}\nAccount Description : ${adesc}")
    }

    class AccountNestedClass{
        private var nestedId=0
        fun insert(aid:Int){
            this.nestedId=aid
        }
        fun display(){
            //u can not access outer member such as aid and adesc
            println("Account Nested class id ${nestedId}\n")
        }

    }
    inner class AccountInnerClass{
        private var inneId=0
        fun insert(aid:Int){
            this.inneId=aid
        }
        fun display(){
            println("AccountInner class id ${inneId}\naid:  ${aid}")
        }

    }
}