// Automatically generated - do not modify!

package tanstack.query.core

external interface QueryCacheConfig {
    var onError: (error: Any, query: Query<*, *, *, *>) -> Unit
    var onSuccess: (data: Any, query: Query<*, *, *, *>) -> Unit
    var onSettled: (data: Any?, error: Any?, query: Query<*, *, *, *>) -> Unit
}
