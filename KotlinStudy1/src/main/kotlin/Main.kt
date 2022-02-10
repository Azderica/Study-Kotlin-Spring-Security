data class Text(
    var text: String = "Hello World!!"
)

fun main(args: Array<String>) {
    val message: Text? = Text()

    var m = when(message) {
        null -> 5
        else -> 0
    }

    println(m)

    message?.let {
        println("Message: ${it.text}")
    }
}