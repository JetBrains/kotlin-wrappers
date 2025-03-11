package wrappers.example.query

import js.coroutines.internal.IsolatedCoroutineScope
import js.coroutines.promise
import kotlinx.coroutines.cancel
import tanstack.query.core.QueryFunction
import tanstack.query.core.QueryKey
import web.events.addHandler

fun <D> createQueryFunction(
    block: suspend () -> D,
): QueryFunction<D, QueryKey, Nothing> =
    QueryFunction { context ->
        val scope = IsolatedCoroutineScope()

        context.signal.abortEvent.addHandler {
            scope.cancel()
        }

        scope.promise { block() }
    }
