data class Text(
    var text: String = "Hello World!!"
)

fun main(args: Array<String>) {
    var message: Text? = Text("Hello Hello")

    message?.let {
        println("Message: ${it.text}")
    }
}