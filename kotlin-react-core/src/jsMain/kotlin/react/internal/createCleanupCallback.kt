package react.internal

import react.Cleanup
import react.CleanupScope

internal fun createCleanupCallback(
    block: suspend CleanupScope.() -> Unit,
): () -> Cleanup = {
    runIsolatedJob(block)
}

internal fun <P1> createCleanupCallback(
    block: suspend CleanupScope.(P1) -> Unit,
): (P1) -> Cleanup = { p1 ->
    runIsolatedJob { block(p1) }
}

internal fun <P1, P2> createCleanupCallback(
    block: suspend CleanupScope.(P1, P2) -> Unit,
): (P1, P2) -> Cleanup = { p1, p2 ->
    runIsolatedJob { block(p1, p2) }
}
