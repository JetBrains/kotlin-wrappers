// Automatically generated - do not modify!

package csstype

sealed external interface Time : TimeProperty

inline val Number.ms: Time
    get() = "${this}ms".unsafeCast<Time>()

inline val Number.s: Time
    get() = "${this}s".unsafeCast<Time>()
