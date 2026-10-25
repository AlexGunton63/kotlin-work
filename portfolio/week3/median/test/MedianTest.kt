// COMP2850 Portfolio: Week 3
// Tests for median()

import io.kotest.core.spec.style.FreeSpec
import io.kotest.assertions.throwables.shouldThrow
import io.kotest.matchers.shouldBe
import io.kotest.matchers.floats.plusOrMinus

const val tolerance = 0.000001f

@Suppress("Unused")
class MedianTest : FreeSpec({
    "Exception when size=0" {
        shouldThrow<IllegalArgumentException> {
            median(listOf())
        }
    }

    // Write four more tests here  

    "Single element returns itself"{
        median(listOf(3.5f))shouldBe(3.5f plusOrMinus tolerance)
    }

    "Odd number of elements returns the middle element" {
        median(listOf(1f, 2f, 3f, 4f, 5f))shouldBe(3f plusOrMinus tolerance)
    }

    "Even number of elements returns the mean of the two middle elements" {
        median(listOf(1f, 2f, 3f, 4f))shouldBe(2.5f plusOrMinus tolerance)
    }

    "Unsorted data is sorted before correctly before calculating the median" {
        median(listOf(10f, 2f, 7f, 3f, 0f))shouldBe(3f plusOrMinus tolerance)
    }
    
    
})
