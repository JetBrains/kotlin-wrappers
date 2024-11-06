// Automatically generated - do not modify!

package web.cssom

import js.reflect.unsafeCast

sealed external interface Percentage :
    Length

inline val Number.pct: Percentage
    get() = unsafeCast("${this}%")
