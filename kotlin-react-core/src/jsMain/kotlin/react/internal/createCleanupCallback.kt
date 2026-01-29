package react.internal

import react.Cleanup
import react.CleanupScope

internal fun createCleanupCallback(
    block: suspend CleanupScope.() -> Unit,
): () -> Cleanup = callback@{
    val job = isolatedJob(block)

    return@callback {
        job.cancel()
    }
}

internal fun <P1> createCleanupCallback(
    block: suspend CleanupScope.(P1) -> Unit,
): (P1) -> Cleanup = callback@{ p1 ->
    val job = isolatedJob { block(p1) }

    return@callback {
        job.cancel()
    }
}

internal fun <P1, P2> createCleanupCallback(
    block: suspend CleanupScope.(P1, P2) -> Unit,
): (P1, P2) -> Cleanup = callback@{ p1, p2 ->
    val job = isolatedJob { block(p1, p2) }

    return@callback {
        job.cancel()
    }
}
