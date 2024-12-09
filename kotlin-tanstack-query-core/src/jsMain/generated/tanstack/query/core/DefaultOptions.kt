// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject

@JsPlainObject
external interface DefaultOptions<TError> {
    val queries: QueryObserverOptions<*, TError, *, *, *, *>?
    val mutations: MutationObserverOptions<*, TError, *, *>?
    val hydrate: DefaultHydrateOptions?
    val dehydrate: DehydrateOptions?
}
