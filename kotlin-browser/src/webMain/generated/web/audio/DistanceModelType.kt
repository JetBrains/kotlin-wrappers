// Automatically generated - do not modify!

package web.audio

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/distanceModel)
 */
@JsUnion
sealed /* union */
external interface DistanceModelType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/distanceModel#exponential)
 */
inline val DistanceModelType.Companion.exponential: DistanceModelType
    get() = unsafeCast("exponential")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/distanceModel#inverse)
 */
inline val DistanceModelType.Companion.inverse: DistanceModelType
    get() = unsafeCast("inverse")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/distanceModel#linear)
 */
inline val DistanceModelType.Companion.linear: DistanceModelType
    get() = unsafeCast("linear")
