// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess
//./kotlin build && python check.py
//./kotlin run 3.0 4.0 5.0

fun main (args: Array<String>){
    if (args.size != 3){
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    else{
        var a = args[0].toFloat()
        var b = args[1].toFloat()
        var c = args[2].toFloat()
        var total = a + b + c
        var semp = (total / 2).toDouble()
        var area = Math.sqrt(semp*(semp - a)*(semp-b)*(semp-c))
        println("Area = %.5f" .format(area))
    }
}
