// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface MutationFilters<TData, TError, TVariables, TOnMutateResult> {
    val exact: Boolean?
    val predicate: ((mutation: Mutation<TData, TError, TVariables, TOnMutateResult>) -> Boolean)?
    val mutationKey: MutationKey?
    val status: MutationStatus?
}
