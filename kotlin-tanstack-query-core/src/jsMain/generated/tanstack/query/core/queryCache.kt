// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package tanstack.query.core

import js.core.ReadonlyArray

external interface QueryCacheConfig {
    var onError: (error: Any, query: Query<*, *, *, *>) -> Unit
    var onSuccess: (data: Any, query: Query<*, *, *, *>) -> Unit
}

external interface NotifyEventQueryAdded {
    var type: Type /* 'added' */
    var query: Query<*, *, *, *>
}

external interface NotifyEventQueryRemoved {
    var type: Type /* 'removed' */
    var query: Query<*, *, *, *>
}

external interface NotifyEventQueryUpdated {
    var type: Type /* 'updated' */
    var query: Query<*, *, *, *>
    var action: Action<*, *>
}

external interface NotifyEventQueryObserverAdded {
    var type: Type /* 'observerAdded' */
    var query: Query<*, *, *, *>
    var observer: QueryObserver<*, *, *, *, *>
}

external interface NotifyEventQueryObserverRemoved {
    var type: Type /* 'observerRemoved' */
    var query: Query<*, *, *, *>
    var observer: QueryObserver<*, *, *, *, *>
}

external interface NotifyEventQueryObserverResultsUpdated {
    var type: Type /* 'observerResultsUpdated' */
    var query: Query<*, *, *, *>
}

external interface NotifyEventQueryObserverOptionsUpdated {
    var type: Type /* 'observerOptionsUpdated' */
    var query: Query<*, *, *, *>
    var observer: QueryObserver<*, *, *, *, *>
}

typealias QueryCacheNotifyEvent = Union /* NotifyEventQueryAdded | NotifyEventQueryRemoved | NotifyEventQueryUpdated | NotifyEventQueryObserverAdded | NotifyEventQueryObserverRemoved | NotifyEventQueryObserverResultsUpdated | NotifyEventQueryObserverOptionsUpdated */

typealias QueryCacheListener = (event: QueryCacheNotifyEvent) -> Unit

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
    open fun <TQueryFnData, TError, TData, TQueyKey : QueryKey> get(queryHash: String): Query<TQueryFnData, TError, TData, TQueyKey>?
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
