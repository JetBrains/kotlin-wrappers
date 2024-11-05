package js.lazy.internal

import js.lazy.LazyFunction
import js.lazy.LazyFunctionSource
import js.promise.PromiseResult
import js.reflect.unsafeCast

@PublishedApi
internal suspend fun <R> invokeLazyFunction(
    function: LazyFunction<R>,
): R =
    unsafeCast<PromiseResult<LazyFunctionSource<R>>>(function)
        .await()()
