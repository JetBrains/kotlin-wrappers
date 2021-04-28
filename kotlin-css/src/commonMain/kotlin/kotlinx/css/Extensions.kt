package kotlinx.css

private val CAPITAL_LETTER = Regex("[A-Z]")

fun String.hyphenize(): String =
    replace(CAPITAL_LETTER) {
        "-${it.value.lowercase()}"
    }

operator fun String.times(n: Int): String = repeat(n)
