// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mediadevices

import js.reflect.unsafeCast

sealed external interface MediaDeviceKind {
    companion object
}

inline val MediaDeviceKind.Companion.audioinput: MediaDeviceKind
    get() = unsafeCast("audioinput")

inline val MediaDeviceKind.Companion.audiooutput: MediaDeviceKind
    get() = unsafeCast("audiooutput")

inline val MediaDeviceKind.Companion.videoinput: MediaDeviceKind
    get() = unsafeCast("videoinput")
