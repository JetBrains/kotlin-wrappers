// Automatically generated - do not modify!

@file:JsModule("react-query")
@file:JsNonModule

@file:Suppress(
    "NON_EXTERNAL_DECLARATION_IN_INAPPROPRIATE_FILE",
)

package react.query

import kotlinx.js.ReadonlyArray
import kotlin.js.Promise

external interface MutationCacheConfig {
    var onError: (error: Any, variables: Any, context: Any, mutation: Mutation<Any, Any, Any, Any>) -> Unit
    var onSuccess: (data: Any, variables: Any, context: Any, mutation: Mutation<Any, Any, Any, Any>) -> Unit
    var onMutate: (variables: Any, mutation: Mutation<Any, Any, Any, Any>) -> Unit
}

typealias MutationCacheListener = (mutation: Mutation<*, *, *, *>?) -> Unit

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
    open fun notify(mutation: Mutation<*, *, *, *> = definedExternally)
    open fun onFocus()
    open fun onOnline()
    open fun resumePausedMutations(): Promise<Unit>
}
