@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
)

package js.iterable

external interface JsIteratorLike<out T> {
    fun next(): IteratorResult<T, *>
}
