// Automatically generated - do not modify!

package web.audio

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/panningModel)
 */
@JsUnion
sealed /* union */
external interface PanningModelType

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/panningModel#HRTF)
 */
inline val PanningModelType.Companion.HRTF: PanningModelType
    get() = unsafeCast("HRTF")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/PannerNode/panningModel#equalpower)
 */
inline val PanningModelType.Companion.equalpower: PanningModelType
    get() = unsafeCast("equalpower")
