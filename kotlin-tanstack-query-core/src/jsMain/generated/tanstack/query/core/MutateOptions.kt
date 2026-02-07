// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface MutateOptions<TData, TError, TVariables, TOnMutateResult> {
    val onSuccess: ((data: TData, variables: TVariables, onMutateResult: TOnMutateResult?, context: MutationFunctionContext) -> Unit)?
    val onError: ((error: TError, variables: TVariables, onMutateResult: TOnMutateResult?, context: MutationFunctionContext) -> Unit)?
    val onSettled: ((data: TData?, error: TError?, variables: TVariables, onMutateResult: TOnMutateResult?, context: MutationFunctionContext) -> Unit)?
}
