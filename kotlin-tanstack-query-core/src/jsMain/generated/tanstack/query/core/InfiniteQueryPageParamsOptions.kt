// Automatically generated - do not modify!

package tanstack.query.core

// @JsPlainObject
// Details - https://youtrack.jetbrains.com/issue/KT-70664
external interface InfiniteQueryPageParamsOptions<TQueryFnData, TPageParam>
    : InitialPageParam<TPageParam> {
    var getPreviousPageParam: GetPreviousPageParamFunction<TPageParam, TQueryFnData>?
    var getNextPageParam: GetNextPageParamFunction<TPageParam, TQueryFnData>
}
