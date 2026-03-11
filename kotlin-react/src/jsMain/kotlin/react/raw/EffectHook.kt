package react.raw

import kotlinx.coroutines.CoroutineScope
import react.Cleanup
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
    effect: suspend CoroutineScope.() -> Unit,
) {
    val callback = createCleanupCallback(effect)
    invoke(callback)
}

internal
operator fun EffectHook.invoke(
    effect: suspend CoroutineScope.() -> Unit,
    dependencies: DependencyList,
) {
    val callback = createCleanupCallback(effect)
    invoke(callback, dependencies)
}
