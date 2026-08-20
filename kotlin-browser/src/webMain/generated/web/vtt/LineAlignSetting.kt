// Automatically generated - do not modify!

package web.vtt

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/lineAlign)
 */
@JsUnion
sealed /* union */
external interface LineAlignSetting

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/lineAlign#center)
 */
inline val LineAlignSetting.Companion.center: LineAlignSetting
    get() = unsafeCast("center")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/lineAlign#end)
 */
inline val LineAlignSetting.Companion.end: LineAlignSetting
    get() = unsafeCast("end")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VTTCue/lineAlign#start)
 */
inline val LineAlignSetting.Companion.start: LineAlignSetting
    get() = unsafeCast("start")
