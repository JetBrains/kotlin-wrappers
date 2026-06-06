package js.array

actual operator fun <T : JsAny?> ReadonlyArray<T>.iterator(): Iterator<T> =
    asSequence().iterator()

actual fun <T : JsAny?> ReadonlyArray<T>.asSequence(): Sequence<T> =
    (0..<size).asSequence().map(::get)

actual fun <T : JsAny?> ReadonlyArray<T>.toList(): List<T> =
    List(size = size, init = ::get)

actual fun <T : JsAny?> List<T>.toJsArray(): ReadonlyArray<T> {
    val array: JsArray<T> = []
    for (value in this) {
        array.push(value)
    }
    return array
}

actual fun <T : JsAny?> ReadonlyArray<T>.toSet(): Set<T> =
    asSequence().toSet()

actual fun <T : JsAny?> Set<T>.toJsArray(): ReadonlyArray<T> {
    val array: JsArray<T> = []
    for (value in this) {
        array.push(value)
    }
    return array
}
