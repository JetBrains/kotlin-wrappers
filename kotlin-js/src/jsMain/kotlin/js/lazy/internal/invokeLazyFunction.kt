package js.lazy.internal

import js.lazy.LazyFunction
import js.lazy.LazyFunctionSource
import js.promise.PromiseResult

@PublishedApi
internal suspend fun <R> invokeLazyFunction(
    function: LazyFunction<R>,
): R =
    function
        .unsafeCast<PromiseResult<LazyFunctionSource<R>>>()
        .await()()
