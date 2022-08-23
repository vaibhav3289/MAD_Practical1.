fun main(){
    println("enter any number:")
    var x:Int = readLine()!!.toInt()
    if(x%2==0)
    {
        println("$x is a even number.")
    }
    else
    {
        println("$x is odd number.")
    }
}