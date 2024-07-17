package react.internal

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.launch
import kotlin.coroutines.EmptyCoroutineContext

internal fun launchIsolatedJob(
    block: suspend CoroutineScope.() -> Unit,
): Job {
    val scope = CoroutineScope(
        context = EmptyCoroutineContext,
    )

    return scope.launch(block = block)
}
