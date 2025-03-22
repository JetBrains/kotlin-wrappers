// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject

@JsPlainObject
external interface MutationObserverOptions<TData, TError, TVariables, TContext> :
    MutationOptions<TData, TError, TVariables, TContext> {
    val throwOnError: ((error: TError) -> Boolean)?
}
