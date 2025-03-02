@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
)

package js.collections

external interface MutableSetLike<T> : ReadonlySet<T> {
    fun add(value: T)
    fun clear()
    fun delete(value: T): Boolean
}
