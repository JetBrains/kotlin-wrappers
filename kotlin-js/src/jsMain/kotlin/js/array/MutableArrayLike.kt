@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.array

import seskar.js.JsNative

external interface MutableArrayLike<T> : ArrayLike<T> {
    @JsNative
    operator fun set(
        index: Int,
        value: T,
    ): Unit = definedExternally
}
