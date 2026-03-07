package react.raw

import react.Cleanup
import react.DependencyList

internal /* raw */
external interface EffectHook {
    operator fun invoke(
        effect: () -> Cleanup?,
        dependencies: DependencyList = definedExternally,
    )
}
