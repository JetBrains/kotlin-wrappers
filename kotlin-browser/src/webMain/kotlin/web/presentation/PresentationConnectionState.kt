@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.presentation

import js.reflect.unsafeCast

sealed external interface PresentationConnectionState {
    companion object
}

inline val PresentationConnectionState.Companion.connecting: PresentationConnectionState
    get() = unsafeCast("connecting")

inline val PresentationConnectionState.Companion.connected: PresentationConnectionState
    get() = unsafeCast("connected")

inline val PresentationConnectionState.Companion.closed: PresentationConnectionState
    get() = unsafeCast("closed")

inline val PresentationConnectionState.Companion.terminated: PresentationConnectionState
    get() = unsafeCast("terminated")
