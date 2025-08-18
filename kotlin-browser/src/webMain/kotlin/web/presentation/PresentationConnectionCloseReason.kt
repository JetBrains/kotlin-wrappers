@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.presentation

import js.reflect.unsafeCast

sealed external interface PresentationConnectionCloseReason {
    companion object
}

inline val PresentationConnectionCloseReason.Companion.error: PresentationConnectionCloseReason
    get() = unsafeCast("error")

inline val PresentationConnectionCloseReason.Companion.closed: PresentationConnectionCloseReason
    get() = unsafeCast("closed")

inline val PresentationConnectionCloseReason.Companion.wentaway: PresentationConnectionCloseReason
    get() = unsafeCast("wentaway")
