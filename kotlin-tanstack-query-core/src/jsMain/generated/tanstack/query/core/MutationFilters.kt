// Automatically generated - do not modify!

package tanstack.query.core

// @JsPlainObject
// Details - https://youtrack.jetbrains.com/issue/KT-70664
external interface MutationFilters<TData, TError, TVariables, TContext> {
    var exact: Boolean?
    var predicate: ((mutation: Mutation<TData, TError, TVariables, TContext>) -> Boolean)?
    var mutationKey: MutationKey?
    var status: MutationStatus?
}
