// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt
import io.kotest.matchers.shouldBe
import io.kotest.core.spec.style.FreeSpec


typealias Triangle = Triple<Double,Double,Double>

// Add isValidTriangle() and triangleArea() functions here

fun isValidTriangle(triangle: Triangle): FreeSpec{
    var a = triangle.first
    var b = triangle.second
    var c = triangle.third

    (a >= b+c || b >= a+c || c >= a+b) shouldBe true
}

fun triangleArea(triangle: Triangle): Double{
        isValidTriangle(triangle)
        var a = triangle.first
        var b = triangle.second
        var c = triangle.third
        var total = a + b + c
        var semp = (total / 2)
        var area = Math.sqrt(semp*(semp - a)*(semp-b)*(semp-c))
        return area
}
    
