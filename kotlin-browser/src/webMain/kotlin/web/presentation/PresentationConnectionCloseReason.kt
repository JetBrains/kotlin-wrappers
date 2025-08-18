@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.presentation

import js.reflect.unsafeCast
import web.experimental.ExperimentalWebApi

@ExperimentalWebApi
sealed external interface PresentationConnectionCloseReason {
    companion object
}

@ExperimentalWebApi
inline val PresentationConnectionCloseReason.Companion.error: PresentationConnectionCloseReason
    get() = unsafeCast("error")

@ExperimentalWebApi
inline val PresentationConnectionCloseReason.Companion.closed: PresentationConnectionCloseReason
    get() = unsafeCast("closed")

@ExperimentalWebApi
inline val PresentationConnectionCloseReason.Companion.wentaway: PresentationConnectionCloseReason
    get() = unsafeCast("wentaway")
