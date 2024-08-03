package js.coroutines

import js.promise.DisposablePromise
import js.promise.Promise
import js.promise.flatCatch
import kotlinx.coroutines.CancellationException
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.CoroutineStart
import kotlinx.coroutines.async
import kotlin.coroutines.CoroutineContext
import kotlin.coroutines.EmptyCoroutineContext

fun <T> CoroutineScope.promise(
    context: CoroutineContext = EmptyCoroutineContext,
    start: CoroutineStart = CoroutineStart.DEFAULT,
    block: suspend CoroutineScope.() -> T,
): DisposablePromise<T> {
    val deferred = async(context, start, block)
    val promise = deferred.asPromise()
        .flatCatch { error ->
            val reason = (error as? CancellationException)?.cause
                ?: JsCancellationError()

            Promise.reject(reason)
        }

    return DisposablePromise(
        promise = promise,
        dispose = { deferred.cancel() },
    )
}
