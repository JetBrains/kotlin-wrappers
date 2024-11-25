package js.array

fun <T> Sequence<T>.toTypedArray(): Array<T> =
    toList().toTypedArray()
