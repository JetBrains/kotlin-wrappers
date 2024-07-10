package react.use

import kotlinx.coroutines.CoroutineScope
import react.internal.createCleanupCallback
import react.rawUseEffect

/**
 * [Original](https://developer.android.com/jetpack/compose/side-effects#launchedeffect)
 */
fun useAsyncEffect(
    vararg dependencies: Any?,
    block: suspend CoroutineScope.() -> Unit,
) {
    rawUseEffect(
        effect = createCleanupCallback(block),
        dependencies = dependencies,
    )
}
