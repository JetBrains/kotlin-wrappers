package react

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import kotlinx.coroutines.awaitCancellation
import kotlinx.coroutines.currentCoroutineContext

class CleanupScope
internal constructor(
    private val source: CoroutineScope,
    private val saveCleanup: (Cleanup) -> Unit,
) : CoroutineScope by source {

    suspend fun awaitCleanup(
        block: () -> Unit,
    ): Nothing {
        check(currentCoroutineContext()[Job] === source) {
            "awaitCleanup() can only be invoked from the cleanup context"
        }

        saveCleanup(block)

        awaitCancellation()
    }
}
