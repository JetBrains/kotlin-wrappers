// Automatically generated - do not modify!

package web.vtt

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/align)
 */
@JsUnion
sealed /* union */
external interface AlignSetting

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/align#center)
 */
inline val AlignSetting.Companion.center: AlignSetting
    get() = unsafeCast("center")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/align#end)
 */
inline val AlignSetting.Companion.end: AlignSetting
    get() = unsafeCast("end")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/align#left)
 */
inline val AlignSetting.Companion.left: AlignSetting
    get() = unsafeCast("left")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/align#right)
 */
inline val AlignSetting.Companion.right: AlignSetting
    get() = unsafeCast("right")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/align#start)
 */
inline val AlignSetting.Companion.start: AlignSetting
    get() = unsafeCast("start")
