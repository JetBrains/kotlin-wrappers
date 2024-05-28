package js.promise.internal

import js.promise.*
import kotlinx.coroutines.await

@PublishedApi
internal suspend fun <T> awaitPromiseResult(
    promise: PromiseResult<T>,
): T =
    awaitPromiseLike(promise as? Promise<T> ?: promise.toPromise())

@PublishedApi
internal suspend fun <T> awaitPromiseLike(
    promise: PromiseLike<T>,
): T =
    promise.unsafeCast<LegacyPromise<T>>().await()

internal suspend fun <T> awaitOptionalPromiseLike(
    promise: PromiseLike<T>?,
): T? =
    if (promise != null) {
        awaitPromiseLike(promise)
    } else null
