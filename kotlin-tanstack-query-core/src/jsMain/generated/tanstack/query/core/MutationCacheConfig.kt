// Automatically generated - do not modify!

package tanstack.query.core

import js.promise.Promise

external interface MutationCacheConfig {
    var onError: (error: DefaultError, variables: Any?, context: Any?, mutation: Mutation<*, *, *, *>) -> Promise<*>?
    var onSuccess: (data: Any?, variables: Any?, context: Any?, mutation: Mutation<*, *, *, *>) -> Promise<*>?
    var onMutate: (variables: Any?, mutation: Mutation<*, *, *, *>) -> Promise<*>?
    var onSettled: (data: Any?, error: DefaultError?, variables: Any?, context: Any?, mutation: Mutation<*, *, *, *>) -> Promise<*>?
}
