// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject

@JsPlainObject
external interface InfiniteQueryPageParamsOptions<TQueryFnData, TPageParam>
    : InitialPageParam<TPageParam> {
    val getPreviousPageParam: GetPreviousPageParamFunction<TPageParam, TQueryFnData>?
    val getNextPageParam: GetNextPageParamFunction<TPageParam, TQueryFnData>
}
