package js.array

actual operator fun <T : JsAny?> ReadonlyArray<T>.iterator(): Iterator<T> =
    asSequence().iterator()

actual fun <T : JsAny?> ReadonlyArray<T>.asSequence(): Sequence<T> =
    (0..size).asSequence().map(::get)
