package js.array

actual inline fun <T> jsArrayOf(
    vararg elements: T,
): ReadonlyArray<T> =
    elements
