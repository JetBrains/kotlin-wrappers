// Automatically generated - do not modify!

package tanstack.query.core

import js.promise.Promise
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface MutationCacheConfig {
    val onError: (error: DefaultError, variables: Any?, context: Any?, mutation: Mutation<*, *, *, *>) -> Promise<*>?
    val onSuccess: (data: Any?, variables: Any?, context: Any?, mutation: Mutation<*, *, *, *>) -> Promise<*>?
    val onMutate: (variables: Any?, mutation: Mutation<*, *, *, *>) -> Promise<*>?
    val onSettled: (data: Any?, error: DefaultError?, variables: Any?, context: Any?, mutation: Mutation<*, *, *, *>) -> Promise<*>?
}
