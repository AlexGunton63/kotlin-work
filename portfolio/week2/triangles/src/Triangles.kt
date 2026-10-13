// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle): Boolean{
    var a = triangle.first.toFloat()
    var b = triangle.second.toFloat()
    var c = triangle.third.toFloat()

    if(a > b+c || b > a+c || c > a+b){
        return false
    }
    return true
}

fun triangleArea(triangle: Triangle): Double{
    var a = triangle.first.toFloat()
    var b = triangle.second.toFloat()
    var c = triangle.third.toFloat()
    var total = a + b + c
    var semp = (total / 2).toDouble()
    var area = Math.sqrt(semp*(semp - a)*(semp-b)*(semp-c))
    return area
}