// Automatically generated - do not modify!

package tanstack.react.query

import js.objects.JsPlainObject
import tanstack.query.core.MutationObserverResult

@JsPlainObject
external interface UseBaseMutationResult<TData, TError, TVariables, TOnMutateResult> :
    MutationObserverResult<TData, TError, TVariables, TOnMutateResult> {
    // override val mutate: UseMutateFunction<TData, TError, TVariables, TOnMutateResult>
    val mutateAsync: UseMutateAsyncFunction<TData, TError, TVariables, TOnMutateResult>
}
