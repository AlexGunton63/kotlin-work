// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt
//import io.kotest.assertions.assertSoftly
//import io.kotest.matchers.shouldBe

typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle): Boolean{
    var a = triangle.first
    var b = triangle.second
    var c = triangle.third

    if(a >= b+c || b >= a+c || c >= a+b){
        return false
    }
    else{
        return true
    }
}

fun triangleArea(triangle: Triangle): Double{
    if(!isValidTriangle(triangle)){
        //assertSoftly{
        throw IllegalArgumentException("Invalid triangle : $triangle")
        //}
    }
    var a = triangle.first
    var b = triangle.second
    var c = triangle.third
    var total = a + b + c
    var semp = (total / 2)
    var area = Math.sqrt(semp*(semp - a)*(semp-b)*(semp-c))
    return area
}