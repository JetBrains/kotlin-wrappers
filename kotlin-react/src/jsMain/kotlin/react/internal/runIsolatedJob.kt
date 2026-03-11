package react.internal

import js.coroutines.internal.IsolatedCoroutineScope
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.launch
import react.Cleanup

internal fun runIsolatedJob(
    block: suspend CoroutineScope.() -> Unit,
): Cleanup {
    val job = IsolatedCoroutineScope()
        .launch(
            start = CoroutineStart.UNDISPATCHED,
            block = block,
        )

    return job::cancel
}
