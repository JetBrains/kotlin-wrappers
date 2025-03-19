// Automatically generated - do not modify!

package tanstack.query.core

import js.iterable.AsyncIterable

// @JsPlainObject
// Details - https://youtrack.jetbrains.com/issue/KT-70664
external interface StreamedQueryOptions<TQueryFnData, TQueryKey : QueryKey> {
    var queryFn: (QueryFunctionContext<TQueryKey, *>) -> AsyncIterable<TQueryFnData>
    var refetchMode: RefetchMode?
}
