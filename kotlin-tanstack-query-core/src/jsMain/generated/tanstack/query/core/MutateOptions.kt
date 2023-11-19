// Automatically generated - do not modify!

package tanstack.query.core

external interface MutateOptions<TData, TError, TVariables, TContext> {
    var onSuccess: (data: TData, variables: TVariables, context: TContext) -> Unit
    var onError: (error: TError, variables: TVariables, context: TContext?) -> Unit
    var onSettled: (data: TData?, error: TError?, variables: TVariables, context: TContext?) -> Unit
}
