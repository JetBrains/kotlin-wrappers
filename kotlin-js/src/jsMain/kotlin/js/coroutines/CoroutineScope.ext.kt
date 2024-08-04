package js.coroutines

import js.promise.DisposablePromise
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
    return DisposablePromise(
        promise = deferred.asPromise(),
        dispose = { deferred.cancel(JsCancellationError()) },
    )
}
