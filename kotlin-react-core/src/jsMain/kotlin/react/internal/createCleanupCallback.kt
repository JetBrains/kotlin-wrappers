package react.internal

import kotlinx.coroutines.CoroutineScope
import react.Cleanup

internal fun createCleanupCallback(
    block: suspend CoroutineScope.() -> Unit,
): () -> Cleanup = callback@{
    val job = isolatedJob(block)

    return@callback {
        job.cancel()
    }
}

internal fun <T> createCleanupCallback(
    block: suspend CoroutineScope.(T) -> Unit,
): (T) -> Cleanup = callback@{ p1 ->
    val job = isolatedJob { block(p1) }

    return@callback {
        job.cancel()
    }
}
