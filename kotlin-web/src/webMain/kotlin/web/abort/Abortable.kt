package web.abort

import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.async
import kotlinx.js.JsPlainObject
import kotlin.coroutines.EmptyCoroutineContext

@JsPlainObject
external interface Abortable {
    /**
     * When provided the corresponding `AbortController` can be used to cancel an asynchronous action.
     */
    var signal: AbortSignal?
}

fun Abortable?.asCoroutineScope(): CoroutineScope =
    this?.signal?.asCoroutineScope()
        ?: CoroutineScope(EmptyCoroutineContext)

suspend fun <R> Abortable?.coroutineScope(
    block: suspend CoroutineScope.() -> R,
): R =
    asCoroutineScope()
        .async(block = block)
        .await()
