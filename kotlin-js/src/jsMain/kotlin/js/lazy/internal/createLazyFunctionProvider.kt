package js.lazy.internal

import js.lazy.LazyFunction
import js.lazy.LazyFunctionProvider
import js.promise.Promise

internal fun <R> createLazyFunctionProvider(
    factory: () -> Promise<LazyFunction<R>>,
): LazyFunctionProvider<R> =
    LazyFunctionProvider {
        factory().await()
    }
