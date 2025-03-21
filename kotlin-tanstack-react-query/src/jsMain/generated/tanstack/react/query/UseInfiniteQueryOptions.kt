// Automatically generated - do not modify!

package tanstack.react.query

import js.objects.JsPlainObject
import tanstack.query.core.InfiniteQueryObserverOptions
import tanstack.query.core.QueryKey

@JsPlainObject
external interface UseInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey, TPageParam>
    : InfiniteQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey, TPageParam> {
    val subscribed: Boolean?
}
