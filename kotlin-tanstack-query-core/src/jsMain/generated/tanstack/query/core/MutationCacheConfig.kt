// Automatically generated - do not modify!

package tanstack.query.core

import js.objects.JsPlainObject
import js.promise.PromiseResult

@JsPlainObject
external interface MutationCacheConfig {
    val onError: ((error: DefaultError, variables: Any?, context: Any?, mutation: Mutation<*, *, *, *>) -> PromiseResult<*>?)?
    val onSuccess: ((data: Any?, variables: Any?, context: Any?, mutation: Mutation<*, *, *, *>) -> PromiseResult<*>?)?
    val onMutate: ((variables: Any?, mutation: Mutation<*, *, *, *>) -> PromiseResult<*>?)?
    val onSettled: ((data: Any?, error: DefaultError?, variables: Any?, context: Any?, mutation: Mutation<*, *, *, *>) -> PromiseResult<*>?)?
}
