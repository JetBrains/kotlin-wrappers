package js.array

typealias ReadonlyArray<T> = JsArray<out T>

expect operator fun <T : JsAny?> ReadonlyArray<T>.iterator(): Iterator<T>

expect fun <T : JsAny?> ReadonlyArray<T>.asSequence(): Sequence<T>

expect fun <T : JsAny?> ReadonlyArray<T>.toList(): List<T>
