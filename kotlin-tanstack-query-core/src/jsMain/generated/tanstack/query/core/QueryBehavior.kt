// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject

@JsPlainObject
external interface QueryBehavior<TQueryFnData, TError, TData, TQueryKey : QueryKey> {
    val onFetch: (context: FetchContext<TQueryFnData, TError, TData, TQueryKey>, query: Query<*, *, *, *>) -> Unit
}
