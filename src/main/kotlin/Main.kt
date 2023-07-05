fun main(){
    val myStack=Stack()
    println( myStack.peek())
    println( myStack.pop())
    println( myStack.isEmpty())
    println( myStack.push(34))
    println( myStack.push(12))
    println( myStack.peek())
    println( myStack.push(3))
    println( myStack.push(7))
    println( myStack.pop())
    println( myStack.peek())
    var x=myStack.pop()
    var y=myStack.pop()
//    nullable or a null  nullion  operator
    var z=x!!+y!!
    println(z)

    var str = "Hello"

    var reverse = reverse(str)

    println(reverse)




}
//LAST IN LAST OUT
class Stack{
    var data = mutableListOf<Int>()
    fun push(value:Int){
        data.add(value)

    }
//    NULLABLE ?
//    pop removes an item
    fun pop():Int?{
        if( data .isEmpty()){
            return  null
        }
//    remove an item in a particula place
    val top=data[data.lastIndex]
    data.removeAt(data.lastIndex)
    return top

    }
//    the item at the top
    fun peek():Int ?{
        if (data .isEmpty()){
            return  null
        }
        return  data[data.lastIndex]

    }

    fun isEmpty():Boolean?{
        return data.isEmpty()
    }
}
fun reverse(str: String): String {
    var reverse = ""

    for (i in str.length - 1 downTo 0) {
        reverse += str[i]
    }

    return reverse
}
fun reveerseWithStack(str:Stack):String{
    val stack=Stack()
        for (character in str){
            stack.push(character)
        }
   val result= mutableListOf<Char>()
    while (!stack.isEmpty()){
        result.add(stack.pop()!!)
    }
    return  result.joinToString ("")
}


