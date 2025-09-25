// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject
import js.promise.Promise
import js.promise.PromiseResult

@JsPlainObject
external interface MutationOptions<TData, TError, TVariables, TOnMutateResult> {
    val mutationFn: MutationFunction<TData, TVariables>?
    val mutationKey: MutationKey?
    val onMutate: ((variables: TVariables, context: MutationFunctionContext) -> Promise<TOnMutateResult>?)?
    val onSuccess: ((data: TData, variables: TVariables, onMutateResult: TOnMutateResult, context: MutationFunctionContext) -> PromiseResult<*>?)?
    val onError: ((error: TError, variables: TVariables, onMutateResult: TOnMutateResult?, context: MutationFunctionContext) -> PromiseResult<*>?)?
    val onSettled: ((data: TData?, error: TError?, variables: TVariables, onMutateResult: TOnMutateResult?, context: MutationFunctionContext) -> PromiseResult<*>?)?
    val retry: RetryValue<TError>?
    val retryDelay: RetryDelayValue<TError>?
    val networkMode: NetworkMode?
    val gcTime: JsDuration?
    val _defaulted: Boolean?
    val meta: MutationMeta?
    val scope: MutationScope?
}
