// Automatically generated - do not modify!

package tanstack.query.core

import web.abort.AbortSignal

external interface QueryFunctionContext<TQueryKey : QueryKey, TPageParam> {
    var queryKey: TQueryKey
    var signal: AbortSignal
    var pageParam: TPageParam?
    var direction: FetchDirection?
    var meta: QueryMeta?
}
