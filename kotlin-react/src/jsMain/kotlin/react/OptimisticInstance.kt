package react

import js.array.component1
import js.array.component2
import react.raw.OptimisticInstanceRaw

value class OptimisticInstance<T, A>(
    @PublishedApi
    internal val state: OptimisticInstanceRaw<T, A>,
) {
    inline operator fun component1(): T =
        state.component1()

    inline operator fun component2(): (A) -> Unit =
        state.component2()
}
