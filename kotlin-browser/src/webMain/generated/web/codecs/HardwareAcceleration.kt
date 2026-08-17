// Automatically generated - do not modify!

package web.codecs

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface HardwareAcceleration

inline val HardwareAcceleration.Companion.noPreference: HardwareAcceleration
    get() = unsafeCast("no-preference")

inline val HardwareAcceleration.Companion.preferHardware: HardwareAcceleration
    get() = unsafeCast("prefer-hardware")

inline val HardwareAcceleration.Companion.preferSoftware: HardwareAcceleration
    get() = unsafeCast("prefer-software")
