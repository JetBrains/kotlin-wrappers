package example.query

import js.coroutines.promise
import tanstack.query.core.QueryFunction
import tanstack.query.core.QueryKey
import web.abort.toCoroutineScope

fun <D> createQueryFunction(
    block: suspend () -> D,
): QueryFunction<D, QueryKey, Nothing> =
    QueryFunction { context ->
        context.signal
            .toCoroutineScope()
            .promise { block() }
    }
