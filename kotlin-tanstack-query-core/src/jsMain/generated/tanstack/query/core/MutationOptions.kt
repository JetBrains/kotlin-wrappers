// Automatically generated - do not modify!

package tanstack.query.core

import js.promise.Promise

external interface MutationOptions<TData, TError, TVariables, TContext> {
    var mutationFn: MutationFunction<TData, TVariables>
    var mutationKey: MutationKey
    var onMutate: (variables: TVariables) -> Promise<TContext?>?
    var onSuccess: (data: TData, variables: TVariables, context: TContext?) -> Promise<*>?
    var onError: (error: TError, variables: TVariables, context: TContext?) -> Promise<*>?
    var onSettled: (data: TData?, error: TError?, variables: TVariables, context: TContext?) -> Promise<*>?
    var retry: RetryValue<TError>
    var retryDelay: RetryDelayValue<TError>
    var networkMode: NetworkMode
    var gcTime: JsDuration
    var _defaulted: Boolean
    var meta: MutationMeta
}
