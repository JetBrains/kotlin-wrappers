// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.audio

import js.reflect.unsafeCast

sealed external interface PanningModelType {
    companion object
}

inline val PanningModelType.Companion.HRTF: PanningModelType
    get() = unsafeCast("HRTF")

inline val PanningModelType.Companion.equalpower: PanningModelType
    get() = unsafeCast("equalpower")
