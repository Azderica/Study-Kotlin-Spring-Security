data class Text(
    var text: String = "Hello World!!"
)

fun main(args: Array<String>) {
    var message: Text? = null

    // null 이면 null 이 출력되는 코드 - null safe
    println(message?.text)
}