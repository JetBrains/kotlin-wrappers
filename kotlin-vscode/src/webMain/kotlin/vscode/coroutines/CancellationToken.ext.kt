package vscode.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import vscode.CancellationToken

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
