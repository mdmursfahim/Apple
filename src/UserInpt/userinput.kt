package UserInpt

import java.util.Scanner

fun main(){
    var scan = Scanner(System.`in`)
    var a = scan.nextInt()
    var b = scan.nextInt()


 //  var a = readLine()!!.toInt()
 //  var b = readLine()!!.toInt()

    var sum = a+b
    var sub = a-b
    var mult = a*b
    var div = a/b
    var mod = a%b.toDouble()
    println(sum)
    println(sub)
    println(mult)
    println(div)
    println(mod)

}