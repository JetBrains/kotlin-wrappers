// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject

@JsPlainObject
external interface InfiniteQueryObserverOptions<TQueryFnData, TError, TData, TQueryData, TQueryKey : QueryKey, TPageParam>
    : QueryObserverOptions<TQueryFnData, TError, TData, InfiniteData<TQueryData, TPageParam>, TQueryKey, TPageParam>,
    InfiniteQueryPageParamsOptions<TQueryFnData, TPageParam>
