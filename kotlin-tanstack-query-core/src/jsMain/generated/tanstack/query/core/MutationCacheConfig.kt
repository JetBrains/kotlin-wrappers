// Automatically generated - do not modify!

package tanstack.query.core

import js.promise.PromiseResult
import kotlinx.js.JsPlainObject

@JsPlainObject
external interface MutationCacheConfig {
    val onError: ((error: DefaultError, variables: Any?, onMutateResult: Any?, mutation: Mutation<*, *, *, *>, context: MutationFunctionContext) -> PromiseResult<*>?)?
    val onSuccess: ((data: Any?, variables: Any?, onMutateResult: Any?, mutation: Mutation<*, *, *, *>, context: MutationFunctionContext) -> PromiseResult<*>?)?
    val onMutate: ((variables: Any?, mutation: Mutation<*, *, *, *>, context: MutationFunctionContext) -> PromiseResult<*>?)?
    val onSettled: ((data: Any?, error: DefaultError?, variables: Any?, onMutateResult: Any?, mutation: Mutation<*, *, *, *>, context: MutationFunctionContext) -> PromiseResult<*>?)?
}
