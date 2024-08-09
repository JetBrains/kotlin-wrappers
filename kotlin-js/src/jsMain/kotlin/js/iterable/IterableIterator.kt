@file:Suppress(
    "INTERFACE_WITH_SUPERCLASS",
)

package js.iterable

sealed external interface IterableIterator<out T> :
    JsIterator<T>
