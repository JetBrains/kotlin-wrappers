@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.presentation

import js.reflect.unsafeCast
import web.experimental.ExperimentalWebApi

@ExperimentalWebApi
sealed external interface PresentationConnectionState {
    companion object
}

@ExperimentalWebApi
inline val PresentationConnectionState.Companion.connecting: PresentationConnectionState
    get() = unsafeCast("connecting")

@ExperimentalWebApi
inline val PresentationConnectionState.Companion.connected: PresentationConnectionState
    get() = unsafeCast("connected")

@ExperimentalWebApi
inline val PresentationConnectionState.Companion.closed: PresentationConnectionState
    get() = unsafeCast("closed")

@ExperimentalWebApi
inline val PresentationConnectionState.Companion.terminated: PresentationConnectionState
    get() = unsafeCast("terminated")
