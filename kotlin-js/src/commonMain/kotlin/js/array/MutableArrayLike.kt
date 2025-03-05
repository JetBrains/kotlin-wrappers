@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.array

import js.core.JsAny
import seskar.js.JsNativeSetter
import kotlin.js.definedExternally

external interface MutableArrayLike<T : JsAny?> :
    ArrayLike<T> {

    @JsNativeSetter
    operator fun set(
        index: Int,
        value: T,
    ): Unit = definedExternally
}
