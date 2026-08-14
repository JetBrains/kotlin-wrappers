// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package js.intl

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface CompactDisplay {
    companion object
}

inline val CompactDisplay.Companion.short: CompactDisplay
    get() = unsafeCast("short")

inline val CompactDisplay.Companion.long: CompactDisplay
    get() = unsafeCast("long")
