package csstype

fun <T : Any> many(
    vararg values: T,
): T =
    values.joinToString(",")
        .unsafeCast<T>()
