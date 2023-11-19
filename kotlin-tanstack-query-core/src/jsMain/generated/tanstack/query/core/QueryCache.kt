// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

package tanstack.query.core

import js.core.ReadonlyArray

open external class QueryCache(config: QueryCacheConfig = definedExternally) : Subscribable<QueryCacheListener> {
    open var config: QueryCacheConfig
    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> build(
        client: QueryClient,
        options: QueryOptions<TQueryFnData, TError, TData, TQueryKey>,
        state: QueryState<TData, TError> = definedExternally,
    ): Query<TQueryFnData, TError, TData, TQueryKey>

    open fun add(query: Query<*, *, *, *>)
    open fun remove(query: Query<*, *, *, *>)
    open fun clear()
    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> get(queryHash: String): Query<TQueryFnData, TError, TData, TQueryKey>?
    open fun getAll(): ReadonlyArray<Query<*, *, *, *>>
    open fun <TQueryFnData, TError, TData> find(
        arg1: QueryKey,
        arg2: QueryFilters = definedExternally,
    ): Query<TQueryFnData, TError, TData, *>?

    open fun findAll(
        queryKey: QueryKey = definedExternally,
        filters: QueryFilters = definedExternally,
    ): ReadonlyArray<Query<*, *, *, *>>

    open fun findAll(filters: QueryFilters = definedExternally): ReadonlyArray<Query<*, *, *, *>>
    open fun findAll(
        arg1: Any /* QueryKey | QueryFilters */ = definedExternally,
        arg2: QueryFilters = definedExternally,
    ): ReadonlyArray<Query<*, *, *, *>>

    open fun notify(event: QueryCacheNotifyEvent)
    open fun onFocus()
    open fun onOnline()
}
