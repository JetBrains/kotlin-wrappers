// Automatically generated - do not modify!

package web.cssom

import js.reflect.unsafeCast

sealed external interface Time : TimeProperty

inline val Int.ms: Time
    get() = unsafeCast("${this}ms")

inline val Double.ms: Time
    get() = unsafeCast("${this}ms")

inline val Int.s: Time
    get() = unsafeCast("${this}s")

inline val Double.s: Time
    get() = unsafeCast("${this}s")
