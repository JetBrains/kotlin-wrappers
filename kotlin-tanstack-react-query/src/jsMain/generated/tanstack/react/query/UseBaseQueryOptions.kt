// Automatically generated - do not modify!

package tanstack.react.query

import js.objects.JsPlainObject
import tanstack.query.core.QueryKey
import tanstack.query.core.QueryObserverOptions

@JsPlainObject
external interface UseBaseQueryOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey>
    : QueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey, Any?> {
    val subscribed: Boolean?
}
