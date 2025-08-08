package js.lazy.internal

import js.internal.InternalApi
import js.lazy.LazyFunction
import js.lazy.LazyFunctionSource
import js.promise.PromiseResult
import js.promise.await
import js.reflect.unsafeCast

@InternalApi
@PublishedApi
internal suspend fun <R> invokeLazyFunction(
    function: LazyFunction<R>,
): R =
    unsafeCast<PromiseResult<LazyFunctionSource<R>>>(function)
        .await()()
