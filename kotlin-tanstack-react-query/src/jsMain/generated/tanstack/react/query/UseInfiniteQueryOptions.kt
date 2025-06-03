// Automatically generated - do not modify!

package tanstack.react.query

import js.objects.JsPlainObject
import tanstack.query.core.InfiniteQueryObserverOptions
import tanstack.query.core.QueryKey

@JsPlainObject
external interface UseInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryKey : QueryKey, TPageParam> :
    InfiniteQueryObserverOptions<TQueryFnData, TError, TData, TQueryKey, TPageParam> {
    val subscribed: Boolean?
}
