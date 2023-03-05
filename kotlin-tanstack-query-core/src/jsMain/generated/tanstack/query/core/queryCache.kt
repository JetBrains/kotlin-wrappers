// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package tanstack.query.core

import js.core.ReadonlyArray

external interface QueryCacheConfig {
    var onError: (error: Any, query: Query<*, *, *, *>) -> Unit
    var onSuccess: (data: Any, query: Query<*, *, *, *>) -> Unit
    var onSettled: (data: Any?, error: Any?, query: Query<*, *, *, *>) -> Unit
}

external interface NotifyEventQueryAdded : NotifyEvent {
    override var type: NotifyEventType /* 'added' */
    var query: Query<*, *, *, *>
}

external interface NotifyEventQueryRemoved : NotifyEvent {
    override var type: NotifyEventType /* 'removed' */
    var query: Query<*, *, *, *>
}

external interface NotifyEventQueryUpdated : NotifyEvent {
    override var type: NotifyEventType /* 'updated' */
    var query: Query<*, *, *, *>
    var action: Action<*, *>
}

external interface NotifyEventQueryObserverAdded : NotifyEvent {
    override var type: NotifyEventType /* 'observerAdded' */
    var query: Query<*, *, *, *>
    var observer: QueryObserver<*, *, *, *, *>
}

external interface NotifyEventQueryObserverRemoved : NotifyEvent {
    override var type: NotifyEventType /* 'observerRemoved' */
    var query: Query<*, *, *, *>
    var observer: QueryObserver<*, *, *, *, *>
}

external interface NotifyEventQueryObserverResultsUpdated : NotifyEvent {
    override var type: NotifyEventType /* 'observerResultsUpdated' */
    var query: Query<*, *, *, *>
}

external interface NotifyEventQueryObserverOptionsUpdated : NotifyEvent {
    override var type: NotifyEventType /* 'observerOptionsUpdated' */
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
