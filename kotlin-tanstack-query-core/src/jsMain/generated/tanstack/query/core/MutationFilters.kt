// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface MutationFilters {
    val exact: Boolean?
    val predicate: ((mutation: Mutation<*, *, *, *>) -> Boolean)?
    val mutationKey: MutationKey?
    val status: MutationStatus?
}
