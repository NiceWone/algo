package leetcode

//[[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]
fun main() {
    var grid: Array<IntArray> = Array(0) { IntArray(0) }
//    val s = readln()
    val s = "[[0,1,0,0],[1,1,1,0],[0,1,0,0],[1,1,0,0]]"
//    val s = "[[1]]"
//    val s = "[[1,0]]"
    var substring = s.substring(1, s.length - 1)
    while (substring.isNotEmpty()) {
        val startIndex = substring.indexOf('[') + 1
        val endIndex = substring.indexOf(']')
        val map = substring.substring(startIndex, endIndex).split(",").map { it.toInt() }
        grid = grid.plus(map.toIntArray())
        substring = substring.substring(endIndex + 1)
    }
//    grid.forEach { it.forEach(::print); println() }
    println(islandPerimeter(grid))
}

fun islandPerimeter(grid: Array<IntArray>): Int {
    var result = 0
    for (i in grid.indices) {
        for (j in 0..<grid[i].size) {
            if (grid[i][j] == 1) {
                result += count(grid, i, j - 1) // top
                result += count(grid, i, j + 1) // bot
                result += count(grid, i - 1, j) // left
                result += count(grid, i + 1, j) // right
            }
        }
    }
    return result
}

fun count(grid: Array<IntArray>, i: Int, j: Int): Int {
    if (((i < 0 || i > (grid.size - 1)) || (j < 0 || j > (grid[i].size - 1))) || grid[i][j] == 0) {
        return 1
    }
    return 0
}


