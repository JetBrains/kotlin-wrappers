// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.codecs

import js.reflect.unsafeCast

sealed external interface BitrateMode {
    companion object
}

inline val BitrateMode.Companion.constant: BitrateMode
    get() = unsafeCast("constant")

inline val BitrateMode.Companion.variable: BitrateMode
    get() = unsafeCast("variable")
