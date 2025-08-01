// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.audio

import js.reflect.unsafeCast

sealed external interface AudioContextState {
    companion object
}

inline val AudioContextState.Companion.closed: AudioContextState
    get() = unsafeCast("closed")

inline val AudioContextState.Companion.interrupted: AudioContextState
    get() = unsafeCast("interrupted")

inline val AudioContextState.Companion.running: AudioContextState
    get() = unsafeCast("running")

inline val AudioContextState.Companion.suspended: AudioContextState
    get() = unsafeCast("suspended")
