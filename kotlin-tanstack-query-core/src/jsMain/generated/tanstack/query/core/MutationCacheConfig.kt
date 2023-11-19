// Automatically generated - do not modify!

package tanstack.query.core

import js.promise.Promise

external interface MutationCacheConfig {
    var onError: (error: Any?, variables: Any?, context: Any?, mutation: Mutation<*, *, *, *>) -> Promise<*>?
    var onSuccess: (data: Any?, variables: Any?, context: Any?, mutation: Mutation<*, *, *, *>) -> Promise<*>?
    var onMutate: (variables: Any?, mutation: Mutation<*, *, *, *>) -> Promise<*>?
    var onSettled: (data: Any?, error: Any?, variables: Any?, context: Any?, mutation: Mutation<*, *, *, *>) -> Promise<*>?
}
