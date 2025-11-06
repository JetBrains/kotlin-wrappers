package vscode

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job

fun CancellationToken.toCoroutineScope(): CoroutineScope {
    val job = Job()

    if (isCancellationRequested) {
        job.cancel()
    } else {
        onCancellationRequested {
            job.cancel()
        }
    }

    return CoroutineScope(job)
}
