package tanstack.router.core

import js.reflect.unsafeCast

sealed /* union */
external interface TrailingSlash {
    companion object
}

inline val TrailingSlash.Companion.always: TrailingSlash
    get() = unsafeCast("always")

inline val TrailingSlash.Companion.never: TrailingSlash
    get() = unsafeCast("never")

inline val TrailingSlash.Companion.preserve: TrailingSlash
    get() = unsafeCast("preserve")
