// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject
import web.abort.AbortSignal

@JsPlainObject
external interface QueryFunctionContext<TQueryKey : QueryKey, TPageParam> {
    val queryKey: TQueryKey
    val signal: AbortSignal
    val pageParam: TPageParam?
    val direction: FetchDirection?
    val meta: QueryMeta?
}
