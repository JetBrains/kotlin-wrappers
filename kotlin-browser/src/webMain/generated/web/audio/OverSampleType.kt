// Automatically generated - do not modify!

package web.audio

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface OverSampleType

inline val OverSampleType.Companion.x2: OverSampleType
    get() = unsafeCast("2x")

inline val OverSampleType.Companion.x4: OverSampleType
    get() = unsafeCast("4x")

inline val OverSampleType.Companion.none: OverSampleType
    get() = unsafeCast("none")
