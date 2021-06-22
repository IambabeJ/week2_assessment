fun main(args: Array<String>) {
   var dog = Animal("black", 9)
    println(dog.getSkinColor())

}

 class Animal{
     private var skinColor : String = ""
     var legNo : Int = 0

    constructor( skinColor: String, legNo :Int){
        this.skinColor = skinColor
        this.legNo = legNo
    }
//    fun get ():Int{
//        return this.legNo
//     }
fun getSkinColor () : String{
    return this.skinColor
}

 }