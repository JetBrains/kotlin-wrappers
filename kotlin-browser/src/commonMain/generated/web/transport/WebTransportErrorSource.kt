// Automatically generated - do not modify!

@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.transport

import js.reflect.unsafeCast

sealed external interface WebTransportErrorSource {
    companion object
}

inline val WebTransportErrorSource.Companion.session: WebTransportErrorSource
    get() = unsafeCast("session")

inline val WebTransportErrorSource.Companion.stream: WebTransportErrorSource
    get() = unsafeCast("stream")
