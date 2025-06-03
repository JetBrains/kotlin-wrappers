// Automatically generated - do not modify!

package tanstack.query.core

import js.core.Void
import js.objects.JsPlainObject
import js.promise.Promise

@JsPlainObject
external interface MutationCacheConfig {
    val onError: ((error: DefaultError, variables: Any, context: Any, mutation: Mutation<*, *, *, *>) -> Promise<Void>?)?
    val onSuccess: ((data: Any, variables: Any, context: Any, mutation: Mutation<*, *, *, *>) -> Promise<Void>?)?
    val onMutate: ((variables: Any, mutation: Mutation<*, *, *, *>) -> Promise<Void>?)?
    val onSettled: ((data: Any?, error: DefaultError?, variables: Any, context: Any, mutation: Mutation<*, *, *, *>) -> Promise<Void>?)?
}
