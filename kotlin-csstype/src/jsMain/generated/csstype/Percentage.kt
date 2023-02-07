// Automatically generated - do not modify!

package csstype

sealed external interface Percentage :
    Length

inline val Number.pct: Percentage
    get() = "${this}%".unsafeCast<Percentage>()
