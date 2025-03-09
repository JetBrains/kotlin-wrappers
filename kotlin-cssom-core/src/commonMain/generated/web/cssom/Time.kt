// Automatically generated - do not modify!

package web.cssom

import js.reflect.unsafeCast

sealed external interface Time : TimeProperty

inline val Number.ms: Time
    get() = unsafeCast("${this}ms")

inline val Number.s: Time
    get() = unsafeCast("${this}s")
