package web.abort

import kotlinx.coroutines.currentCoroutineContext
import kotlinx.coroutines.job

internal suspend fun getCompletionAbortSignal(): AbortSignal {
    val controller = AbortController()

    currentCoroutineContext().job.invokeOnCompletion {
        controller.abort()
    }

    return controller.signal
}
