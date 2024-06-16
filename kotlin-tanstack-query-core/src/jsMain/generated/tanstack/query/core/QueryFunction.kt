// Automatically generated - do not modify!

@file:Suppress(
    "NOTHING_TO_INLINE",
)

package tanstack.query.core

import js.promise.PromiseResult

@JsExternalInheritorsOnly
sealed external interface QueryFunctionOrSkipToken<out T, out TQueryKey : QueryKey, out TPageParam>

sealed external interface QueryFunction<out T, out TQueryKey : QueryKey, out TPageParam> :
    QueryFunctionOrSkipToken<T, TQueryKey, TPageParam>

inline fun <T, TQueryKey : QueryKey, TPageParam> QueryFunction(
    noinline value: (context: QueryFunctionContext<TQueryKey, TPageParam>) -> PromiseResult<T>,
): QueryFunction<T, TQueryKey, TPageParam> =
    value.unsafeCast<QueryFunction<T, TQueryKey, TPageParam>>()
