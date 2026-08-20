// Automatically generated - do not modify!

package web.vtt

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/vertical)
 */
@JsUnion
sealed /* union */
external interface DirectionSetting

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/vertical#sect)
 */
inline val DirectionSetting.Companion.none: DirectionSetting
    get() = unsafeCast("")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/vertical#lr)
 */
inline val DirectionSetting.Companion.lr: DirectionSetting
    get() = unsafeCast("lr")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/vertical#rl)
 */
inline val DirectionSetting.Companion.rl: DirectionSetting
    get() = unsafeCast("rl")
