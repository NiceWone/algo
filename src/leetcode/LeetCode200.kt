package leetcode

fun main() {
//    val s = readln()
//    val s = """[
//  ["1","1","1","1","0"],
//  ["1","1","0","1","0"],
//  ["1","1","0","0","0"],
//  ["0","0","0","0","0"]
//]"""
//    val s = """[["1","1","0","0","0"],["1","1","0","0","0"],["0","0","1","0","0"],["0","0","0","1","1"]]"""
    val s = """[["1","1","1","1","0"],["1","1","0","1","0"],["1","1","0","0","0"],["0","0","0","0","0"]]"""
    var substring = s.substring(1, s.length - 1)
    var grid: Array<CharArray> = Array(0) { CharArray(0) }
    while (substring.isNotEmpty()) {
        val startIndex = substring.indexOf('[') + 1
        val endIndex = substring.indexOf(']')
        if (endIndex == -1) break
        val map = substring.substring(startIndex, endIndex)
            .replace("\n", "")
            .replace(",", "")
            .replace("\"", "").toCharArray()
        grid = grid.plus(map)
        substring = substring.substring(endIndex + 1)
    }
    grid.forEach { it.forEach(::print); println() }
    println(numIslands(grid))
}

fun numIslands(grid: Array<CharArray>): Int {
    var result = 0
    for (i in grid.indices) {
        for (j in 0..<grid[i].size) {
            if (grid[i][j] == '1') {
                result++
                eraseIsland(grid, i, j)
            }
        }
    }
    return result
}

private fun eraseIsland(grid: Array<CharArray>, i: Int, j: Int) {
    grid[i][j] = '0'
    if (j - 1 >= 0 && grid[i][j - 1] == '1') {
        eraseIsland(grid, i, j - 1) // top
    }
    if (j + 1 < grid[i].size && grid[i][j + 1] == '1') {
        eraseIsland(grid, i, j + 1) // bot
    }
    if (i - 1 >= 0 && grid[i - 1][j] == '1') {
        eraseIsland(grid, i - 1, j) // left
    }
    if (i + 1 < grid.size && grid[i + 1][j] == '1') {
        eraseIsland(grid, i + 1, j) // right
    }
}


