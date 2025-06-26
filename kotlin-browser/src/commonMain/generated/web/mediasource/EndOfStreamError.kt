// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.mediasource

import js.reflect.unsafeCast

sealed external interface EndOfStreamError {
    companion object
}

inline val EndOfStreamError.Companion.decode: EndOfStreamError
    get() = unsafeCast("decode")

inline val EndOfStreamError.Companion.network: EndOfStreamError
    get() = unsafeCast("network")
