package tanstack.router.core

import js.reflect.unsafeCast

sealed /* union */
external interface Preload {
    companion object
}

inline val Preload.Companion.`false`: Preload
    get() = unsafeCast("false")

inline val Preload.Companion.intent: Preload
    get() = unsafeCast("intent")

inline val Preload.Companion.viewport: Preload
    get() = unsafeCast("viewport")

inline val Preload.Companion.render: Preload
    get() = unsafeCast("render")
