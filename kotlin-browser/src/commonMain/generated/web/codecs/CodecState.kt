// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.codecs

import js.reflect.unsafeCast

sealed external interface CodecState {
    companion object
}

inline val CodecState.Companion.closed: CodecState
    get() = unsafeCast("closed")

inline val CodecState.Companion.configured: CodecState
    get() = unsafeCast("configured")

inline val CodecState.Companion.unconfigured: CodecState
    get() = unsafeCast("unconfigured")
