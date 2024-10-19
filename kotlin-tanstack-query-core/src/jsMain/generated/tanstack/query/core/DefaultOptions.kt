// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface DefaultOptions<TError> {
    var queries: QueryObserverOptions<*, TError, *, *, *, *>?
    var mutations: MutationObserverOptions<*, TError, *, *>?
    var hydrate: DefaultHydrateOptions?
    var dehydrate: DehydrateOptions?
}
