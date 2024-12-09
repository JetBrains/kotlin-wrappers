// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject

@JsPlainObject
external interface MutationFilters {
    val exact: Boolean?
    val predicate: ((mutation: Mutation<*, *, *, *>) -> Boolean)?
    val mutationKey: MutationKey?
    val status: MutationStatus?
}
