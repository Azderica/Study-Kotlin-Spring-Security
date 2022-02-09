data class Text(
    var text: String = "Hello World!!"
)

fun main(args: Array<String>) {
    var message = Text()

    println(message.text)
}