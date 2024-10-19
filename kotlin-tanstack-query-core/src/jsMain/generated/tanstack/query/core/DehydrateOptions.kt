// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface DehydrateOptions {
    val serializeData: TransformerFn?
    val shouldDehydrateMutation: ((mutation: Mutation<*, *, *, *>) -> Boolean)?
    val shouldDehydrateQuery: ((query: Query<*, *, *, *>) -> Boolean)?
}
