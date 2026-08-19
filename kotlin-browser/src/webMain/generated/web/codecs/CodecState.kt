// Automatically generated - do not modify!

package web.codecs

import js.reflect.unsafeCast
import js.union.JsUnion

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/state)
 */
@JsUnion
sealed /* union */
external interface CodecState

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/state#closed)
 */
inline val CodecState.Companion.closed: CodecState
    get() = unsafeCast("closed")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/state#configured)
 */
inline val CodecState.Companion.configured: CodecState
    get() = unsafeCast("configured")

/**
 * [MDN Reference](https://developer.mozilla.org/docs/Web/API/AudioDecoder/state#unconfigured)
 */
inline val CodecState.Companion.unconfigured: CodecState
    get() = unsafeCast("unconfigured")
