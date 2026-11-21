package karakum.csstype

fun unitsExtension(
    type: String,
    name: String,
    suffix: String,
): String =
    """
    inline val Int.$name: $type
        get() = unsafeCast("${'$'}{this}$suffix")

    inline val Double.$name: $type
        get() = unsafeCast("${'$'}{this}$suffix")
    """.trimIndent()
