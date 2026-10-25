// Task 7.7.1: statistics functions
import kotlin.io.path.Path
import kotlin.io.path.forEachLine

fun median (nums : List<Float>): Float{
    val sortedNums = nums.sorted()
    val mid = (nums.size) / 2
    if (nums.size % 2 == 1){ // if odd
        return sortedNums[mid] // middle num
    }
    else{
        
        return (sortedNums[mid - 1] + sortedNums[mid])/2 // mean of two middle numbers
    }
}
fun stats (nums : List<Float>){
    println("Minimum: ${values.min()}")
    println("Maximum: ${values.max()}")
    println("Mean:    ${values.average()}")
    println("Median:  ${median(values)}")
}
