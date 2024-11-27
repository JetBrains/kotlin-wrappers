// Automatically generated - do not modify!

package tanstack.query.core

import js.promise.PromiseResult
import js.reflect.unsafeCast

@JsExternalInheritorsOnly
sealed external interface QueryFunctionOrSkipToken<out T, out TQueryKey : QueryKey, out TPageParam>

sealed external interface QueryFunction<out T, out TQueryKey : QueryKey, out TPageParam> :
    QueryFunctionOrSkipToken<T, TQueryKey, TPageParam>

inline fun <T, TQueryKey : QueryKey, TPageParam> QueryFunction(
    noinline value: (context: QueryFunctionContext<TQueryKey, TPageParam>) -> PromiseResult<T>,
): QueryFunction<T, TQueryKey, TPageParam> =
    unsafeCast(value)
