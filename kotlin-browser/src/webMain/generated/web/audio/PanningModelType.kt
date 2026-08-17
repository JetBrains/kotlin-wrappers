// Automatically generated - do not modify!

package web.audio

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface PanningModelType

inline val PanningModelType.Companion.HRTF: PanningModelType
    get() = unsafeCast("HRTF")

inline val PanningModelType.Companion.equalpower: PanningModelType
    get() = unsafeCast("equalpower")
