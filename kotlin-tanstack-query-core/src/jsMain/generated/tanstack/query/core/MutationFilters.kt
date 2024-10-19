// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface MutationFilters {
    var exact: Boolean?
    var predicate: ((mutation: Mutation<*, *, *, *>) -> Boolean)?
    var mutationKey: MutationKey?
    var status: MutationStatus?
}
