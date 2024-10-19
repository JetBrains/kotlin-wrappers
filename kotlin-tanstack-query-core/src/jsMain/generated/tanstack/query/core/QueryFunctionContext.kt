// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject
import web.abort.AbortSignal

@JsPlainObject
external interface QueryFunctionContext<TQueryKey : QueryKey, TPageParam> {
    var queryKey: TQueryKey
    var signal: AbortSignal
    var pageParam: TPageParam?
    var direction: FetchDirection?
    var meta: QueryMeta?
}
