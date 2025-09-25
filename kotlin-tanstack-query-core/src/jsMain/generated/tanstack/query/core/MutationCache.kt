// Automatically generated - do not modify!

@file:JsModule("@tanstack/query-core")

package tanstack.query.core

import js.array.ReadonlyArray
import js.promise.Promise

open external class MutationCache(
    config: MutationCacheConfig = definedExternally,
) : Subscribable<MutationCacheListener> {
    open var config: MutationCacheConfig
    open fun <TData, TError, TVariables, TOnMutateResult> build(
        client: QueryClient,
        options: MutationOptions<TData, TError, TVariables, TOnMutateResult>,
        state: MutationState<TData, TError, TVariables, TOnMutateResult> = definedExternally,
    ): Mutation<TData, TError, TVariables, TOnMutateResult>

    open fun add(mutation: Mutation<*, *, *, *>)
    open fun remove(mutation: Mutation<*, *, *, *>)
    open fun canRun(mutation: Mutation<*, *, *, *>): Boolean
    open fun runNext(mutation: Mutation<*, *, *, *>): Promise<*>
    open fun clear()
    open fun getAll(): ReadonlyArray<Mutation<*, *, *, *>>
    open fun <TData, TError, TVariables, TOnMutateResult> find(filters: MutationFilters<*, *, *, *>): Mutation<TData, TError, TVariables, TOnMutateResult>?
    open fun findAll(filters: MutationFilters<*, *, *, *> = definedExternally): ReadonlyArray<Mutation<*, *, *, *>>
    open fun notify(event: MutationCacheNotifyEvent)
    open fun resumePausedMutations(): Promise<*>
}
