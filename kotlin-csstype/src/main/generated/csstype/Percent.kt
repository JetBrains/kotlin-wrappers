// Automatically generated - do not modify!

package csstype

sealed external interface Percent :
    Length

inline val Number.pct: Percent
    get() = "${this}%".unsafeCast<Percent>()
