package react.use

import kotlinx.coroutines.CoroutineScope
import react.useEffect

/**
 * [Original](https://github.com/streamich/react-use/blob/master/src/useUpdateEffect.ts)
 */
fun useUpdateEffect(
    vararg dependencies: Any?,
    effect: suspend CoroutineScope.() -> Unit,
) {
    val isFirstRender = useIsFirstRender()

    useEffect(dependencies = dependencies) {
        if (!isFirstRender) {
            effect()
        }
    }
}
