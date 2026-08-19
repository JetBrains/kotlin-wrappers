// Automatically generated - do not modify!

package web.vtt

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/positionAlign)
 */
@JsUnion
sealed /* union */
external interface PositionAlignSetting

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/positionAlign#auto)
 */
inline val PositionAlignSetting.Companion.auto: PositionAlignSetting
    get() = unsafeCast("auto")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/positionAlign#center)
 */
inline val PositionAlignSetting.Companion.center: PositionAlignSetting
    get() = unsafeCast("center")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/positionAlign#line-left)
 */
inline val PositionAlignSetting.Companion.lineLeft: PositionAlignSetting
    get() = unsafeCast("line-left")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/positionAlign#line-right)
 */
inline val PositionAlignSetting.Companion.lineRight: PositionAlignSetting
    get() = unsafeCast("line-right")
