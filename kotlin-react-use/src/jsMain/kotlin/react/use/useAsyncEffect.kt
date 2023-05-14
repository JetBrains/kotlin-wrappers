package react.use

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.launch
import react.useEffect
import kotlin.coroutines.EmptyCoroutineContext

/**
 * [Original](https://developer.android.com/jetpack/compose/side-effects#launchedeffect)
 */
fun useAsyncEffect(
    vararg dependencies: Any?,
    block: suspend () -> Unit,
) {
    useEffect(dependencies = dependencies) {
        val scope = CoroutineScope(EmptyCoroutineContext)
        val job = scope.launch {
            block()
        }

        cleanup(job::cancel)
    }
}
