// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

package tanstack.query.core

import js.array.ReadonlyArray

open external class QueryCache(config: QueryCacheConfig = definedExternally) : Subscribable<QueryCacheListener> {
    open var config: QueryCacheConfig
    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> build(
        client: QueryClient,
        options: QueryOptions<TQueryFnData, TError, TData, TQueryKey, *>,
        state: QueryState<TData, TError> = definedExternally,
    ): Query<TQueryFnData, TError, TData, TQueryKey>

    open fun add(query: Query<*, *, *, *>)
    open fun remove(query: Query<*, *, *, *>)
    open fun clear()
    open fun <TQueryFnData, TError, TData, TQueryKey : QueryKey> get(queryHash: String): Query<TQueryFnData, TError, TData, TQueryKey>?
    open fun getAll(): ReadonlyArray<Query<*, *, *, *>>
    open fun <TQueryFnData, TError, TData> find(filters: QueryFilters<*, *, *, *>): Query<TQueryFnData, TError, TData, *>?
    open fun findAll(filters: QueryFilters<*, *, *, *> = definedExternally): ReadonlyArray<Query<*, *, *, *>>
    open fun notify(event: QueryCacheNotifyEvent)
    open fun onFocus()
    open fun onOnline()
}
