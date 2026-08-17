// Automatically generated - do not modify!

package web.mediadevices

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface MediaDeviceKind

inline val MediaDeviceKind.Companion.audioinput: MediaDeviceKind
    get() = unsafeCast("audioinput")

inline val MediaDeviceKind.Companion.audiooutput: MediaDeviceKind
    get() = unsafeCast("audiooutput")

inline val MediaDeviceKind.Companion.videoinput: MediaDeviceKind
    get() = unsafeCast("videoinput")
