// Automatically generated - do not modify!

package tanstack.query.core

import js.iterable.AsyncIterable
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface StreamedQueryParams<TQueryFnData, TData, TQueryKey : QueryKey> {
    val streamFn: (QueryFunctionContext<TQueryKey, *>) -> AsyncIterable<TQueryFnData>
    val refetchMode: RefetchMode?
    val reducer: ((acc: TData, chunk: TQueryFnData) -> TData)?
    val initialValue: TData?
}
