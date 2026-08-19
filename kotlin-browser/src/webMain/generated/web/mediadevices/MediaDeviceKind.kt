// Automatically generated - do not modify!

package web.mediadevices

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/kind)
 */
@JsUnion
sealed /* union */
external interface MediaDeviceKind

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/kind#audioinput)
 */
inline val MediaDeviceKind.Companion.audioinput: MediaDeviceKind
    get() = unsafeCast("audioinput")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/kind#audiooutput)
 */
inline val MediaDeviceKind.Companion.audiooutput: MediaDeviceKind
    get() = unsafeCast("audiooutput")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/MediaDeviceInfo/kind#videoinput)
 */
inline val MediaDeviceKind.Companion.videoinput: MediaDeviceKind
    get() = unsafeCast("videoinput")
