package vscode.coroutines

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Job
import vscode.CancellationToken

fun CoroutineScope(
    token: CancellationToken,
): CoroutineScope {
    val job = Job()

    if (token.isCancellationRequested) {
        job.cancel()
    } else {
        token.onCancellationRequested {
            job.cancel()
        }
    }

    return CoroutineScope(job)
}
