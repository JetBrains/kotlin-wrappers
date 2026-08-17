// Automatically generated - do not modify!

package web.codecs

import js.reflect.unsafeCast
import js.union.JsUnion

@JsUnion
sealed /* union */
external interface CodecState

inline val CodecState.Companion.closed: CodecState
    get() = unsafeCast("closed")

inline val CodecState.Companion.configured: CodecState
    get() = unsafeCast("configured")

inline val CodecState.Companion.unconfigured: CodecState
    get() = unsafeCast("unconfigured")
