// Automatically generated - do not modify!

@file:Suppress(
    "UNUSED_TYPEALIAS_PARAMETER",
)

package tanstack.query.core

import web.abort.AbortSignal

external interface QueryFunctionContext<TQueryKey : QueryKey, TPageParam> {
    var queryKey: TQueryKey
    var signal: AbortSignal
    var pageParam: TPageParam
    var meta: QueryMeta?
}
