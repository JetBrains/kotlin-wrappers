// Automatically generated - do not modify!

package tanstack.react.query

import tanstack.query.core.InfiniteQueryObserverOptions
import tanstack.query.core.QueryKey

// @JsPlainObject
// Details - https://youtrack.jetbrains.com/issue/KT-70664
external interface UseInfiniteQueryOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey, TPageParam>
    : InfiniteQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey, TPageParam> {
    var subscribed: Boolean?
}
