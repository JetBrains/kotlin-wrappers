package example.query

import js.coroutines.promise
import tanstack.query.core.QueryFunction
import tanstack.query.core.QueryKey
import web.coroutines.CoroutineScope

fun <D> createQueryFunction(
    block: suspend () -> D,
): QueryFunction<D, QueryKey, Nothing> =
    QueryFunction { context ->
        CoroutineScope(context.signal)
            .promise { block() }
    }
