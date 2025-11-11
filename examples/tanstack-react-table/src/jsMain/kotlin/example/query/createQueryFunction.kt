package example.query

import js.coroutines.promise
import tanstack.query.core.QueryFunction
import tanstack.query.core.QueryKey
import web.abort.asCoroutineScope

fun <D> createQueryFunction(
    block: suspend () -> D,
): QueryFunction<D, QueryKey, Nothing> =
    QueryFunction { context ->
        context.signal
            .asCoroutineScope()
            .promise { block() }
    }
