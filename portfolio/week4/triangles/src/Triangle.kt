// COMP2850 Portfolio: Week 2
// Functions for working with triangle geometry

import kotlin.math.sqrt
//import io.kotest.assertions.assertSoftly
//import io.kotest.matchers.shouldBe

//typealias Triangle = Triple<Double,Double,Double>

class Triangle(val sideA : Double,val sideB: Double,val sideC: Double){

    init{
        require(isValidTriangle()) {"Invalid triangle: $sideA, $sideB, $sideC"}
    }

    val perimeter : Double
        get() = sideA + sideB + sideC
    val semiPerimeter : Double
        get () = perimeter/2
    val area : Double
        get() = Math.sqrt(semiPerimeter*(semiPerimeter - sideA)*(semiPerimeter-sideB)*(semiPerimeter-sideC))

    fun isValidTriangle(): Boolean{
        if(sideA >= sideB+sideC || sideB >= sideA+sideC || sideC >= sideA+sideB){
            return false
        }
        else{
            return true
        }
    }

    override fun toString(): String = "Triangle($sideA, $sideB, $sideC)"
}

