// Automatically generated - do not modify!

package tanstack.query.core

import kotlinx.js.JsPlainObject

@JsPlainObject
external interface QueryCacheConfig {
    val onError: ((error: DefaultError, query: Query<*, *, *, *>) -> Unit)?
    val onSuccess: ((data: Any, query: Query<*, *, *, *>) -> Unit)?
    val onSettled: ((data: Any?, error: DefaultError?, query: Query<*, *, *, *>) -> Unit)?
}
