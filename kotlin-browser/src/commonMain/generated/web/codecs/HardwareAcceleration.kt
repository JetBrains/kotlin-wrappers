// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.codecs

import js.reflect.unsafeCast

sealed external interface HardwareAcceleration {
    companion object
}

inline val HardwareAcceleration.Companion.noPreference: HardwareAcceleration
    get() = unsafeCast("noPreference")

inline val HardwareAcceleration.Companion.preferHardware: HardwareAcceleration
    get() = unsafeCast("preferHardware")

inline val HardwareAcceleration.Companion.preferSoftware: HardwareAcceleration
    get() = unsafeCast("preferSoftware")
