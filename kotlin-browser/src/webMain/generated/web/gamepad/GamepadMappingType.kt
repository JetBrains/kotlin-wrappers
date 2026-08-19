// Automatically generated - do not modify!

package web.gamepad

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/mapping)
 */
@JsUnion
sealed /* union */
external interface GamepadMappingType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/mapping#sect)
 */
inline val GamepadMappingType.Companion.none: GamepadMappingType
    get() = unsafeCast("")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/mapping#standard)
 */
inline val GamepadMappingType.Companion.standard: GamepadMappingType
    get() = unsafeCast("standard")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/Gamepad/mapping#xr-standard)
 */
inline val GamepadMappingType.Companion.xrStandard: GamepadMappingType
    get() = unsafeCast("xr-standard")
