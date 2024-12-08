package react.internal

import kotlinx.coroutines.CoroutineScope
import react.Cleanup

fun createCleanupCallback(
    block: suspend CoroutineScope.() -> Unit,
): () -> Cleanup? = callback@{
    val job = isolatedJob(block)

    return@callback {
        job.cancel()
    }
}
