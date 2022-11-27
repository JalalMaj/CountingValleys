fun countingValleys(steps: Int, path: String): Int {
    var valCount = 0
    var count = 0
    var valley = 0
    val char = path.toCharArray()
    for (x in 0 until path.length) {
        if (char[x].toUpperCase() == 'U') {
            count++
        } else if (char[x].toUpperCase() == 'D') {
            count--
        }
        if (count == 0 && valCount < count) {
            valley++
        }
        valCount = count
    }
    return valley
}
fun main(args: Array<String>) {
    val steps = readLine()!!.trim().toInt()

    val path = readLine()!!

    val result = countingValleys(steps, path)

    println(result)
}