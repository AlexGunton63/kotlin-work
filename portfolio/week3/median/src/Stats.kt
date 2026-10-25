// Task 7.7.1: statistics functions
import kotlin.io.path.Path
import kotlin.io.path.forEachLine

fun median (nums : List<Float>): Float{
    require(nums.isNotEmpty()) {"File is empty"}
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
    println("Minimum: ${nums.min()}")
    println("Maximum: ${nums.max()}")
    println("Mean:    ${nums.average()}")
    println("Median:  ${median(nums)}")
}
