// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject
import js.promise.Promise
import js.promise.PromiseResult

@JsPlainObject
external interface MutationOptions<TData, TError, TVariables, TContext> {
    val mutationFn: MutationFunction<TData, TVariables>?
    val mutationKey: MutationKey?
    val onMutate: ((variables: TVariables) -> Promise<TContext?>?)?
    val onSuccess: ((data: TData, variables: TVariables, context: TContext) -> PromiseResult<*>?)?
    val onError: ((error: TError, variables: TVariables, context: TContext?) -> PromiseResult<*>?)?
    val onSettled: ((data: TData?, error: TError?, variables: TVariables, context: TContext?) -> PromiseResult<*>?)?
    val retry: RetryValue<TError>?
    val retryDelay: RetryDelayValue<TError>?
    val networkMode: NetworkMode?
    val gcTime: JsDuration?
    val _defaulted: Boolean?
    val meta: MutationMeta?
    val scope: MutationScope?
}
