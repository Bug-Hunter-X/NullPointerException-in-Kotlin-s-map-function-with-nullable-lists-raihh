fun main() {
    val list = listOf(1, 2, 3, 4, 5)
    val result = list.map { it * 2 }
    println(result) // Output: [2, 4, 6, 8, 10]

    val emptyList = emptyList<Int>()
    val emptyResult = emptyList.map { it * 2 }
    println(emptyResult) // Output: []

    //This will throw an exception because the list is null
    val nullList: List<Int>? = null
    //val nullResult = nullList.map { it * 2 }
    //println(nullResult)
}