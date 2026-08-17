// Automatically generated - do not modify!

package web.serial

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface ParityType

inline val ParityType.Companion.even: ParityType
    get() = unsafeCast("even")

inline val ParityType.Companion.none: ParityType
    get() = unsafeCast("none")

inline val ParityType.Companion.odd: ParityType
    get() = unsafeCast("odd")
