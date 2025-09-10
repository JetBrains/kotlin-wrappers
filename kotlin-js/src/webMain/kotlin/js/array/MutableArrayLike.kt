@file:Suppress(
    "NON_ABSTRACT_MEMBER_OF_EXTERNAL_INTERFACE",
)

package js.array

import kotlin.js.JsAny
import kotlin.js.definedExternally

external interface MutableArrayLike<T : JsAny?> :
    ArrayLike<T> {

    operator fun set(
        index: Int,
        value: T,
    ): Unit = definedExternally
}
