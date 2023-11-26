// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

package tanstack.query.core

import js.core.ReadonlyArray
import js.promise.Promise

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
    open fun findAll(filters: MutationFilters = definedExternally): ReadonlyArray<Mutation<*, *, *, *>>
    open fun notify(event: MutationCacheNotifyEvent)
    open fun resumePausedMutations(): Promise<Any?>
}
