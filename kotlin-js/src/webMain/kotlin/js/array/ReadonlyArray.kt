package js.array

import kotlin.js.JsAny
import kotlin.js.JsArray

typealias ReadonlyArray<T> = JsArray<out T>

expect operator fun <T : JsAny> ReadonlyArray<T>.iterator(): Iterator<T>

expect fun <T : JsAny> ReadonlyArray<T>.asSequence(): Sequence<T>
