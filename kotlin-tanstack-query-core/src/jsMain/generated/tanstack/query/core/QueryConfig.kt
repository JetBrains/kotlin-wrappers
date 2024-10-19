// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface QueryConfig<TQueryFnData, TError, TData, TQueryKey : QueryKey> {
    val cache: QueryCache
    val queryKey: TQueryKey
    val queryHash: String
    val options: QueryOptions<TQueryFnData, TError, TData, TQueryKey, *>?
    val defaultOptions: QueryOptions<TQueryFnData, TError, TData, TQueryKey, *>?
    val state: QueryState<TData, TError>?
}
