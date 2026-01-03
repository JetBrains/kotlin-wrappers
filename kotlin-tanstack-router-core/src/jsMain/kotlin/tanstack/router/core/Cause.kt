package tanstack.router.core

import js.reflect.unsafeCast

sealed /* union */
external interface Cause {
    companion object
}

inline val Cause.Companion.preload: Cause
    get() = unsafeCast("preload")

inline val Cause.Companion.enter: Cause
    get() = unsafeCast("enter")

inline val Cause.Companion.stay: Cause
    get() = unsafeCast("stay")
