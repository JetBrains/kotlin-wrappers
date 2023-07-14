// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package tanstack.query.core

import js.core.ReadonlyArray
import js.promise.Promise

external interface MutationCacheConfig {
    var onError: (error: Any?, variables: Any?, context: Any?, mutation: Mutation<*, *, *, *>) -> Promise<*>?
    var onSuccess: (data: Any?, variables: Any?, context: Any?, mutation: Mutation<*, *, *, *>) -> Promise<*>?
    var onMutate: (variables: Any?, mutation: Mutation<*, *, *, *>) -> Promise<*>?
    var onSettled: (data: Any?, error: Any?, variables: Any?, context: Any?, mutation: Mutation<*, *, *, *>) -> Promise<*>?
}

external interface NotifyEventMutationAdded : NotifyEvent {
    override var type: NotifyEventType /* 'added' */
    var mutation: Mutation<*, *, *, *>
}

external interface NotifyEventMutationRemoved : NotifyEvent {
    override var type: NotifyEventType /* 'removed' */
    var mutation: Mutation<*, *, *, *>
}

external interface NotifyEventMutationObserverAdded : NotifyEvent {
    override var type: NotifyEventType /* 'observerAdded' */
    var mutation: Mutation<*, *, *, *>
    var observer: MutationObserver<*, *, *, *>
}

external interface NotifyEventMutationObserverRemoved : NotifyEvent {
    override var type: NotifyEventType /* 'observerRemoved' */
    var mutation: Mutation<*, *, *, *>
    var observer: MutationObserver<*, *, *, *>
}

external interface NotifyEventMutationObserverOptionsUpdated : NotifyEvent {
    override var type: NotifyEventType /* 'observerOptionsUpdated' */
    var mutation: Mutation<*, *, *, *>
    var observer: MutationObserver<*, *, *, *>
}

external interface NotifyEventMutationUpdated : NotifyEvent {
    override var type: NotifyEventType /* 'updated' */
    var mutation: Mutation<*, *, *, *>
    var action: MutationAction<*, *, *, *>
}

typealias MutationCacheNotifyEvent = Union /* NotifyEventMutationAdded | NotifyEventMutationRemoved | NotifyEventMutationObserverAdded | NotifyEventMutationObserverRemoved | NotifyEventMutationObserverOptionsUpdated | NotifyEventMutationUpdated */

typealias MutationCacheListener = (event: MutationCacheNotifyEvent) -> Unit

open external class MutationCache(config: MutationCacheConfig = definedExternally) : Subscribable<MutationCacheListener> {
    open var config: MutationCacheConfig
    open fun <TData, TError, TVariables, TContext> build(
        client: QueryClient,
        options: MutationOptions<TData, TError, TVariables, TContext>,
        state: MutationState<TData, TError, TVariables, TContext> = definedExternally,
    ): Mutation<TData, TError, TVariables, TContext>

    open fun add(mutation: Mutation<*, *, *, *>)
    open fun remove(mutation: Mutation<*, *, *, *>)
    open fun clear()
    open fun getAll(): ReadonlyArray<Mutation<*, *, *, *>>
    open fun <TData, TError, TVariables, TContext> find(filters: MutationFilters): Mutation<TData, TError, TVariables, TContext>?
    open fun findAll(filters: MutationFilters): ReadonlyArray<Mutation<*, *, *, *>>
    open fun notify(event: MutationCacheNotifyEvent)
    open fun resumePausedMutations(): Promise<Any?>
}
