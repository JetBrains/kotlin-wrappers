// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package tanstack.query.core

import kotlinx.js.ReadonlyArray
import kotlin.js.Promise

external interface MutationCacheConfig {
    var onError: (error: Any, variables: Any, context: Any, mutation: Mutation<*, *, *, *>) -> Unit
    var onSuccess: (data: Any, variables: Any, context: Any, mutation: Mutation<*, *, *, *>) -> Unit
    var onMutate: (variables: Any, mutation: Mutation<*, *, *, *>) -> Unit
}

external interface NotifyEventMutationAdded {
    var type: Type /* 'added' */
    var mutation: Mutation<*, *, *, *>
}

external interface NotifyEventMutationRemoved {
    var type: Type /* 'removed' */
    var mutation: Mutation<*, *, *, *>
}

external interface NotifyEventMutationObserverAdded {
    var type: Type /* 'observerAdded' */
    var mutation: Mutation<*, *, *, *>
    var observer: MutationObserver<*, *, *, *>
}

external interface NotifyEventMutationObserverRemoved {
    var type: Type /* 'observerRemoved' */
    var mutation: Mutation<*, *, *, *>
    var observer: MutationObserver<*, *, *, *>
}

external interface NotifyEventMutationObserverOptionsUpdated {
    var type: Type /* 'observerOptionsUpdated' */
    var mutation: Mutation<*, *, *, *>
    var observer: MutationObserver<*, *, *, *>
}

external interface NotifyEventMutationUpdated {
    var type: Type /* 'updated' */
    var mutation: Mutation<*, *, *, *>
    var action: MutationAction<*, *, *, *>
}

typealias MutationCacheNotifyEvent = Union /* NotifyEventMutationAdded | NotifyEventMutationRemoved | NotifyEventMutationObserverAdded | NotifyEventMutationObserverRemoved | NotifyEventMutationObserverOptionsUpdated | NotifyEventMutationUpdated */

typealias MutationCacheListener = (event: MutationCacheNotifyEvent) -> Unit

open external class MutationCache(config: MutationCacheConfig = definedExternally) :
    Subscribable<MutationCacheListener> {
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
    open fun resumePausedMutations(): Promise<Unit>
}
