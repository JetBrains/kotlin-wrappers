package react.internal

import js.internal.InternalApi
import kotlinx.coroutines.CoroutineScope
import react.Cleanup

@InternalApi
fun createCleanupCallback(
    block: suspend CoroutineScope.() -> Unit,
): () -> Cleanup = callback@{
    val job = isolatedJob(block)

    return@callback {
        job.cancel()
    }
}

@InternalApi
fun <T> createCleanupCallback(
    block: suspend CoroutineScope.(T) -> Unit,
): (T) -> Cleanup = callback@{ p1 ->
    val job = isolatedJob { block(p1) }

    return@callback {
        job.cancel()
    }
}
