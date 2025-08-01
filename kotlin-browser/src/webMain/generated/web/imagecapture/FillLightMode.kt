// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.imagecapture

import js.reflect.unsafeCast

sealed external interface FillLightMode {
    companion object
}

inline val FillLightMode.Companion.auto: FillLightMode
    get() = unsafeCast("auto")

inline val FillLightMode.Companion.flash: FillLightMode
    get() = unsafeCast("flash")

inline val FillLightMode.Companion.off: FillLightMode
    get() = unsafeCast("off")
