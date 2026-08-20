// Automatically generated - do not modify!

package web.audio

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/state)
 */
@JsUnion
sealed /* union */
external interface AudioContextState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/state#closed)
 */
inline val AudioContextState.Companion.closed: AudioContextState
    get() = unsafeCast("closed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/state#interrupted)
 */
inline val AudioContextState.Companion.interrupted: AudioContextState
    get() = unsafeCast("interrupted")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/state#running)
 */
inline val AudioContextState.Companion.running: AudioContextState
    get() = unsafeCast("running")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/BaseAudioContext/state#suspended)
 */
inline val AudioContextState.Companion.suspended: AudioContextState
    get() = unsafeCast("suspended")
