// Automatically generated - do not modify!

package web.audio

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface DistanceModelType

inline val DistanceModelType.Companion.exponential: DistanceModelType
    get() = unsafeCast("exponential")

inline val DistanceModelType.Companion.inverse: DistanceModelType
    get() = unsafeCast("inverse")

inline val DistanceModelType.Companion.linear: DistanceModelType
    get() = unsafeCast("linear")
