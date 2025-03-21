// Automatically generated - do not modify!

package tanstack.react.query

import js.objects.JsPlainObject
import tanstack.query.core.MutationObserverResult

@JsPlainObject
external interface UseBaseMutationResult<TData, TError, TVariables, TContext> :
    MutationObserverResult<TData, TError, TVariables, TContext> {
    // override val mutate: UseMutateFunction<TData, TError, TVariables, TContext>
    val mutateAsync: UseMutateAsyncFunction<TData, TError, TVariables, TContext>
}
