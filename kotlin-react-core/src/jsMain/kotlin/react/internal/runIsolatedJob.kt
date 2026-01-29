package react.internal

import js.coroutines.internal.IsolatedCoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.launch
import react.Cleanup
import react.CleanupScope

internal fun runIsolatedJob(
    block: suspend CleanupScope.() -> Unit,
): Cleanup {
    var cleanup: Cleanup? = null
    val saveCleanup: (Cleanup) -> Unit = { value ->
        require(cleanup == null) {
            "Cleanup already set!"
        }

        cleanup = value
    }

    val job = IsolatedCoroutineScope()
        .launch(
            start = CoroutineStart.UNDISPATCHED,
            block = { block(CleanupScope(this, saveCleanup)) },
        )

    return {
        cleanup?.invoke()
        job.cancel()
    }
}
