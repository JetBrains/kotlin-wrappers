package react.raw

import react.Cleanup
import react.CleanupScope
import react.DependencyList
import react.internal.createCleanupCallback

internal /* raw */
external interface EffectHook {
    operator fun invoke(
        effect: () -> Cleanup?,
        dependencies: DependencyList = definedExternally,
    )
}

internal
operator fun EffectHook.invoke(
    effect: suspend CleanupScope.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    invoke(callback)
}

internal
operator fun EffectHook.invoke(
    effect: suspend CleanupScope.() -> Unit,
    dependencies: DependencyList,
) {
    val callback = createCleanupCallback(effect)
    invoke(callback, dependencies)
}
