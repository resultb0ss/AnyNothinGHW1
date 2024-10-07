fun main() {
    val firstStr:Any = "{([])}"
    val secondStr:Any = "{(])}"
    val thirdStr:Any = "{([])}"
    println(firstStr == secondStr)
    println(firstStr == thirdStr)
}