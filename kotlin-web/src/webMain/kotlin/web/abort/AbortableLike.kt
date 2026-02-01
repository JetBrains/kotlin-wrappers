package web.abort

import js.internal.InternalApi
import kotlinx.coroutines.CoroutineScope

@SubclassOptInRequired(InternalApi::class)
external interface AbortableLike {
    val signal: AbortSignal
}

fun AbortableLike.asCoroutineScope(): CoroutineScope =
    signal.asCoroutineScope()
