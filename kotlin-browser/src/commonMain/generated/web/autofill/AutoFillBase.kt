// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.autofill

import js.reflect.unsafeCast

sealed external interface AutoFillBase :
    AutoFill {
    companion object
}

inline val AutoFillBase.Companion.none: AutoFillBase
    get() = unsafeCast("none")

inline val AutoFillBase.Companion.off: AutoFillBase
    get() = unsafeCast("off")

inline val AutoFillBase.Companion.on: AutoFillBase
    get() = unsafeCast("on")
