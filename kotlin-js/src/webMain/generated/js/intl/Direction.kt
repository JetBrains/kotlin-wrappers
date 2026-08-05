// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import js.reflect.unsafeCast

@JsName("NaN")
sealed /* union */
external interface Direction {
    companion object
}

inline val Direction.Companion.ltr: Direction
    get() = unsafeCast("ltr")

inline val Direction.Companion.rtl: Direction
    get() = unsafeCast("rtl")
