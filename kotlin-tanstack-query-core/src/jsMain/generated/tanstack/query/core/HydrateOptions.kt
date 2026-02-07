// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface DefaultHydrateOptions {
    val deserializeData: TransformerFn?
    val queries: QueryOptions<*, *, *, *, *>?
    val mutations: MutationOptions<*, DefaultError, *, *>?
}

@JsPlainObject
external interface HydrateOptions {
    val defaultOptions: DefaultHydrateOptions?
}
