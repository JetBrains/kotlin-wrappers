@file:Suppress(
    "WRONG_JS_INTEROP_TYPE",
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.array

import kotlin.js.definedExternally
import seskar.js.JsNativeSetter

external interface MutableArrayLike<T> :
    ArrayLike<T> {

    @JsNativeSetter
    operator fun set(
        index: Int,
        value: T,
    ): Unit = definedExternally
}
