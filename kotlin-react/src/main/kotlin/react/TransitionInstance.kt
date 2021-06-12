@file:Suppress("NOTHING_TO_INLINE")

package react

class TransitionInstance
private constructor() {
    inline operator fun component1(): Boolean = asDynamic()[0] // isPending
    inline operator fun component2(): () -> Unit = asDynamic()[1] // startTransition
}

external interface TransitionOptions {
    var timeoutMs: Int
}
