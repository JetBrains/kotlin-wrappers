// Automatically generated - do not modify!

package web.cssom

sealed external interface Percentage :
    Length

inline val Number.pct: Percentage
    get() = "${this}%".unsafeCast<Percentage>()
