// Automatically generated - do not modify!

package tanstack.query.core

external interface QueryCacheConfig {
    var onError: (error: DefaultError, query: Query<*, *, *, *>) -> Unit
    var onSuccess: (data: Any, query: Query<*, *, *, *>) -> Unit
    var onSettled: (data: Any?, error: DefaultError?, query: Query<*, *, *, *>) -> Unit
}
