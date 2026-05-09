package js.array

expect fun <T : JsAny?> jsArrayOf(
    vararg elements: T,
): ReadonlyArray<T>
