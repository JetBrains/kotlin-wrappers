// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject

@JsPlainObject
external interface MutationFilters<TData, TError, TVariables, TContext> {
    val exact: Boolean?
    val predicate: ((mutation: Mutation<TData, TError, TVariables, TContext>) -> Boolean)?
    val mutationKey: MutationKey?
    val status: MutationStatus?
}
