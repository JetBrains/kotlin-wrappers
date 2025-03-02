@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
)

package js.collections

import js.array.ArrayLike

external interface ListLike<out T> :
    ArrayLike<T>,
    CollectionLike<Int, T>
