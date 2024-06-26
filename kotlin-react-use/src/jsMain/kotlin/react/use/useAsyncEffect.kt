package react.use

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import react.rawUseEffect
import kotlin.coroutines.EmptyCoroutineContext

/**
 * [Original](https://developer.android.com/jetpack/compose/side-effects#launchedeffect)
 */
fun useAsyncEffect(
    vararg dependencies: Any?,
    block: suspend CoroutineScope.() -> Unit,
) {
    rawUseEffect(
        effect = {
            val job = CoroutineScope(EmptyCoroutineContext)
                .launch(block = block)

            job::cancel
        },
        dependencies = dependencies,
    )
}
