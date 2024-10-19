// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface MutateOptions<TData, TError, TVariables, TContext> {
    val onSuccess: ((data: TData, variables: TVariables, context: TContext) -> Unit)?
    val onError: ((error: TError, variables: TVariables, context: TContext?) -> Unit)?
    val onSettled: ((data: TData?, error: TError?, variables: TVariables, context: TContext?) -> Unit)?
}
