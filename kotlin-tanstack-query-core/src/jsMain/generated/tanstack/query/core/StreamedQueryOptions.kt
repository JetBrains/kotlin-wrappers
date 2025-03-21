// Automatically generated - do not modify!

package tanstack.query.core

import js.iterable.AsyncIterable
import js.objects.JsPlainObject

@JsPlainObject
external interface StreamedQueryOptions<TQueryFnData, TQueryKey : QueryKey> {
    val queryFn: (QueryFunctionContext<TQueryKey, *>) -> AsyncIterable<TQueryFnData>
    val refetchMode: RefetchMode?
}
