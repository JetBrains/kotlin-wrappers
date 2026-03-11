package react.internal

import js.internal.InternalApi
import kotlinx.coroutines.CoroutineScope
import react.Cleanup

@InternalApi
fun createCleanupCallback(
    block: suspend CoroutineScope.() -> Unit,
): () -> Cleanup = {
    runIsolatedJob(block)
}

internal fun <P1> createCleanupCallback(
    block: suspend CoroutineScope.(P1) -> Unit,
): (P1) -> Cleanup = { p1 ->
    runIsolatedJob { block(p1) }
}

internal fun <P1, P2> createCleanupCallback(
    block: suspend CoroutineScope.(P1, P2) -> Unit,
): (P1, P2) -> Cleanup = { p1, p2 ->
    runIsolatedJob { block(p1, p2) }
}
