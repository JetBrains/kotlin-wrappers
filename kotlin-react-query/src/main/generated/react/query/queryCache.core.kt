// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.query

import kotlinx.js.ReadonlyArray

external interface QueryCacheConfig {
    var onError: (error: Any, query: Query<*, *, *, *>) -> Unit
    var onSuccess: (data: Any, query: Query<*, *, *, *>) -> Unit
}

external interface NotifyEventQueryAdded {
    var type: Type /* 'queryAdded' */
    var query: Query<*, *, *, *>
}

external interface NotifyEventQueryRemoved {
    var type: Type /* 'queryRemoved' */
    var query: Query<*, *, *, *>
}

external interface NotifyEventQueryUpdated {
    var type: Type /* 'queryUpdated' */
    var query: Query<*, *, *, *>
    var action: Action<*, *>
}

external interface NotifyEventObserverAdded {
    var type: Type /* 'observerAdded' */
    var query: Query<*, *, *, *>
    var observer: QueryObserver<*, *, *, *, *>
}

external interface NotifyEventObserverRemoved {
    var type: Type /* 'observerRemoved' */
    var query: Query<*, *, *, *>
    var observer: QueryObserver<*, *, *, *, *>
}

external interface NotifyEventObserverResultsUpdated {
    var type: Type /* 'observerResultsUpdated' */
    var query: Query<*, *, *, *>
}

typealias QueryCacheNotifyEvent = Union /* NotifyEventQueryAdded | NotifyEventQueryRemoved | NotifyEventQueryUpdated | NotifyEventObserverAdded | NotifyEventObserverRemoved | NotifyEventObserverResultsUpdated */

typealias QueryCacheListener = (event: QueryCacheNotifyEvent?) -> Unit

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
        arg1: dynamic = definedExternally,
        arg2: QueryFilters = definedExternally,
    ): ReadonlyArray<Query<*, *, *, *>>

    open fun notify(event: QueryCacheNotifyEvent)
    open fun onFocus()
    open fun onOnline()
}
