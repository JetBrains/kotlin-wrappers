// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.gamepad

import js.reflect.unsafeCast

sealed external interface GamepadMappingType {
    companion object
}

inline val GamepadMappingType.Companion.none: GamepadMappingType
    get() = unsafeCast("none")

inline val GamepadMappingType.Companion.standard: GamepadMappingType
    get() = unsafeCast("standard")

inline val GamepadMappingType.Companion.xrStandard: GamepadMappingType
    get() = unsafeCast("xrStandard")
