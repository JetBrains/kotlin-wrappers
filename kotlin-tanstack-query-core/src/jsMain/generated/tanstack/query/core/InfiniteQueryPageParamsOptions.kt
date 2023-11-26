// Automatically generated - do not modify!

package tanstack.query.core

external interface InfiniteQueryPageParamsOptions<TQueryFnData, TPageParam>
    : InitialPageParam<TPageParam> {
    var getPreviousPageParam: GetPreviousPageParamFunction<TPageParam, TQueryFnData>
    var getNextPageParam: GetNextPageParamFunction<TPageParam, TQueryFnData>
}
