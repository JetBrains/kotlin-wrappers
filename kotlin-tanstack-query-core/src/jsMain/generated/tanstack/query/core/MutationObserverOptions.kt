// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject

@JsPlainObject
external interface MutationObserverOptions<TData, TError, TVariables, TOnMutateResult> :
    MutationOptions<TData, TError, TVariables, TOnMutateResult> {
    val throwOnError: ((error: TError) -> Boolean)?
}
