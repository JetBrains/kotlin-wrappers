package csstype

fun <T : Any> array(
    vararg values: T,
): T =
    values.joinToString(" ")
        .unsafeCast<T>()
