// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject

@JsPlainObject
external interface MutationConfig<TData, TError, TVariables, TContext> {
    val mutationId: Int
    val mutationCache: MutationCache
    val options: MutationOptions<TData, TError, TVariables, TContext>
    val state: MutationState<TData, TError, TVariables, TContext>?
}
