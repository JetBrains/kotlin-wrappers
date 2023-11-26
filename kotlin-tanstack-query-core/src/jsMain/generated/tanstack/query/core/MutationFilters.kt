// Automatically generated - do not modify!

package tanstack.query.core

external interface MutationFilters {
    var exact: Boolean
    var predicate: (mutation: Mutation<*, *, *, *>) -> Boolean
    var mutationKey: MutationKey
    var status: MutationStatus
}
