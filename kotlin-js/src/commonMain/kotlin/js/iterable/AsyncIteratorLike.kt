@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
)

package js.iterable

import js.promise.Promise

external interface AsyncIteratorLike<out T> {
    fun next(): Promise<IteratorResult<T, *>>
}
