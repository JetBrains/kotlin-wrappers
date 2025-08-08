package example.query

import js.coroutines.promise
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.cancel
import tanstack.query.core.QueryFunction
import tanstack.query.core.QueryKey
import web.abort.abortEvent
import web.events.addHandler
import kotlin.coroutines.EmptyCoroutineContext

fun <D> createQueryFunction(
    block: suspend () -> D,
): QueryFunction<D, QueryKey, Nothing> =
    QueryFunction { context ->
        val scope = CoroutineScope(EmptyCoroutineContext)

        context.signal.abortEvent.addHandler {
            scope.cancel()
        }

        scope.promise { block() }
    }
