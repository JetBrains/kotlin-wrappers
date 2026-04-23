package js.array

actual operator fun <T : JsAny> ReadonlyArray<T>.iterator(): Iterator<T> =
    asSequence().iterator()

actual fun <T : JsAny> ReadonlyArray<T>.asSequence(): Sequence<T> {
    var index = 0
    return generateSequence {
        if (index < length) {
            get(index++)
        } else null
    }
}
