// COMP2850 Portfolio: Week 1
// Program to compute area of a triangle

import kotlin.math.sqrt
import kotlin.system.exitProcess

fun main (args: Array<Float>)
{
    if (args.size != 3){
        println("Error: values for a, b, c required on command line")
        exitProcess(1)
    }
    else{
        var area: Float = 0.0
        var semp: Float = 0.0
        var total = args[0] + args[1] + args[2]
        semp = (total / 2).toFloat()
        area = Math.sqrt(semp*(semp - args[0])*(semp-args[1])*(semp-args[2]))
        println("Area = %.5f" .format(area))
    }
}
//./kotlin build && python check.py
//./kotlin run 3.0 4.0 5.0