// Automatically generated - do not modify!

package web.audio

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface AudioContextState

inline val AudioContextState.Companion.closed: AudioContextState
    get() = unsafeCast("closed")

inline val AudioContextState.Companion.interrupted: AudioContextState
    get() = unsafeCast("interrupted")

inline val AudioContextState.Companion.running: AudioContextState
    get() = unsafeCast("running")

inline val AudioContextState.Companion.suspended: AudioContextState
    get() = unsafeCast("suspended")
