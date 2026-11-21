// Automatically generated - do not modify!

package web.cssom

import js.reflect.unsafeCast

sealed external interface Percentage :
    Length

inline val Int.pct: Percentage
    get() = unsafeCast("${this}%")

inline val Double.pct: Percentage
    get() = unsafeCast("${this}%")
