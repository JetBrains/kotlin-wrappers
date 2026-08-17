package web.presentation

import js.reflect.unsafeCast
import js.union.JsUnion
import web.experimental.ExperimentalWebApi

@JsUnion
@ExperimentalWebApi
sealed /* union */
external interface PresentationConnectionCloseReason

@ExperimentalWebApi
inline val PresentationConnectionCloseReason.Companion.error: PresentationConnectionCloseReason
    get() = unsafeCast("error")

@ExperimentalWebApi
inline val PresentationConnectionCloseReason.Companion.closed: PresentationConnectionCloseReason
    get() = unsafeCast("closed")

@ExperimentalWebApi
inline val PresentationConnectionCloseReason.Companion.wentaway: PresentationConnectionCloseReason
    get() = unsafeCast("wentaway")
