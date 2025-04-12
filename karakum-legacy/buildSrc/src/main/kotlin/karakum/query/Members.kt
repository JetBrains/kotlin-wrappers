package karakum.query

fun getMemberName(source: String): String =
    source.substringBefore("?:")
        .substringBefore(":")
        .substringBefore("<")
        .substringBefore("(")
        .removePrefix("protected ")
        .removePrefix("abstract ")

fun safeName(name: String): String =
    when (name) {
        "continue" -> "`$name`"
        else -> name
    }
