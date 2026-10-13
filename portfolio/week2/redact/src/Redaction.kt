// COMP2850 Portfolio: Week 2
// Function to redact sensitive information in a string
fun redact(input: String, text: String, char: Char = 'X'):String{

    val output = input.replace(text,char.toString().repeat(text.length))
    return output
}