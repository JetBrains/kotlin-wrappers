@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package pako

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed external interface To {
    companion object
}

inline val To.Companion.string: To
    get() = unsafeCast("string")
