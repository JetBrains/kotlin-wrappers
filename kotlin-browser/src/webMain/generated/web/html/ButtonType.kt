// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.html

import js.reflect.unsafeCast

sealed external interface ButtonType {
    companion object
}

inline val ButtonType.Companion.submit: ButtonType
    get() = unsafeCast("submit")

inline val ButtonType.Companion.reset: ButtonType
    get() = unsafeCast("reset")

inline val ButtonType.Companion.button: ButtonType
    get() = unsafeCast("button")
