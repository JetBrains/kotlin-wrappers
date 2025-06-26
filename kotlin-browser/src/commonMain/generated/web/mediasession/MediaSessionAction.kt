// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mediasession

import js.reflect.unsafeCast

sealed external interface MediaSessionAction {
    companion object
}

inline val MediaSessionAction.Companion.nexttrack: MediaSessionAction
    get() = unsafeCast("nexttrack")

inline val MediaSessionAction.Companion.pause: MediaSessionAction
    get() = unsafeCast("pause")

inline val MediaSessionAction.Companion.play: MediaSessionAction
    get() = unsafeCast("play")

inline val MediaSessionAction.Companion.previoustrack: MediaSessionAction
    get() = unsafeCast("previoustrack")

inline val MediaSessionAction.Companion.seekbackward: MediaSessionAction
    get() = unsafeCast("seekbackward")

inline val MediaSessionAction.Companion.seekforward: MediaSessionAction
    get() = unsafeCast("seekforward")

inline val MediaSessionAction.Companion.seekto: MediaSessionAction
    get() = unsafeCast("seekto")

inline val MediaSessionAction.Companion.skipad: MediaSessionAction
    get() = unsafeCast("skipad")

inline val MediaSessionAction.Companion.stop: MediaSessionAction
    get() = unsafeCast("stop")
