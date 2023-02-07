package react.use

import react.EffectBuilder
import react.useEffect

/**
 * [Original](https://github.com/streamich/react-use/blob/master/src/useUpdateEffect.ts)
 */
fun useUpdateEffect(
    vararg dependencies: Any?,
    effect: EffectBuilder.() -> Unit,
) {
    val isFirstRender = useIsFirstRender()

    useEffect(dependencies = dependencies) {
        if (!isFirstRender) {
            effect()
        }
    }
}
