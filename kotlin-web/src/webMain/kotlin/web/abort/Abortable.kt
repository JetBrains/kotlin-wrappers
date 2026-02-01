package web.abort

import js.objects.JsPlainObject
import kotlinx.coroutines.CoroutineScope
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
