@file:Suppress(
    "NESTED_CLASS_IN_EXTERNAL_INTERFACE",
)

package web.presentation

import js.reflect.unsafeCast

sealed external interface PresentationStyle {
    companion object
}

inline val PresentationStyle.Companion.connecting: PresentationStyle
    get() = unsafeCast("connecting")

inline val PresentationStyle.Companion.connected: PresentationStyle
    get() = unsafeCast("connected")

inline val PresentationStyle.Companion.closed: PresentationStyle
    get() = unsafeCast("closed")

inline val PresentationStyle.Companion.terminated: PresentationStyle
    get() = unsafeCast("terminated")
