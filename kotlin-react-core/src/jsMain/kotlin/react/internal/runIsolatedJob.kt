package react.internal

import js.coroutines.internal.IsolatedCoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.launch
import react.Cleanup
import react.CleanupScope

internal fun runIsolatedJob(
    block: suspend CleanupScope.() -> Unit,
): Cleanup {
    val job = IsolatedCoroutineScope()
        .launch(
            start = CoroutineStart.UNDISPATCHED,
            block = { block(CleanupScopeImpl(this)) },
        )

    return job::cancel
}
