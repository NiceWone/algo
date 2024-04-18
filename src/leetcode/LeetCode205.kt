package leetcode

fun main() {
    val a = "bbbaaaba"
    val b = "aaabbbba"
    println(isIsomorphic(a, b))
}

fun isIsomorphic(s: String, t: String): Boolean {
//    println( s.toSet())
//    println( (s zip t))
//    println( (t zip s))
//    println( (s zip t).toSet())
    if (s.length != t.length) return false
    var d = ""
    var e = ""
    val map = mutableMapOf<Char, Int>()
    val map2 = mutableMapOf<Char, Int>()
    var count = 0
    var count2 = 0
    for ((index, _) in s.withIndex()) {
        d += map.getOrPut(s[index]) { count++ }.toString()
        e += map2.getOrPut(t[index]) { count2++ }.toString()
        if (d != e) return false
    }
    return true

}


