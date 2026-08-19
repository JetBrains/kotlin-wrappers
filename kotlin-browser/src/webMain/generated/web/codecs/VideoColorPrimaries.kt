// Automatically generated - do not modify!

package web.codecs

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/primaries)
 */
@JsUnion
sealed /* union */
external interface VideoColorPrimaries

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/primaries#bt470bg)
 */
inline val VideoColorPrimaries.Companion.bt470bg: VideoColorPrimaries
    get() = unsafeCast("bt470bg")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/primaries#bt709)
 */
inline val VideoColorPrimaries.Companion.bt709: VideoColorPrimaries
    get() = unsafeCast("bt709")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/VideoColorSpace/primaries#smpte170m)
 */
inline val VideoColorPrimaries.Companion.smpte170m: VideoColorPrimaries
    get() = unsafeCast("smpte170m")
