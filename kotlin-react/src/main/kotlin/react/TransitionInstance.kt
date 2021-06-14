@file:Suppress("NOTHING_TO_INLINE")

package react

typealias TransitionFunction = () -> Unit
typealias TransitionStartFunction = (callback: TransitionFunction) -> Unit

class TransitionInstance
private constructor() {
    // isPending
    inline operator fun component1(): Boolean = asDynamic()[0]

    // startTransition
    inline operator fun component2(): TransitionStartFunction = asDynamic()[1]
}
