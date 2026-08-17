package web.presentation

import js.reflect.unsafeCast
import js.union.JsUnion
import web.experimental.ExperimentalWebApi

@JsUnion
@ExperimentalWebApi
sealed /* union */
external interface PresentationConnectionState

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
