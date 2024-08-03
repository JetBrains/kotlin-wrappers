package js.promise.internal

import js.promise.Promise
import js.promise.PromiseLike
import js.promise.PromiseResult
import js.promise.toPromise
import kotlinx.coroutines.suspendCancellableCoroutine

@PublishedApi
internal suspend fun <T> awaitPromiseResult(
    promise: PromiseResult<T>,
): T =
    awaitPromiseLike(promise as? Promise<T> ?: promise.toPromise())

@PublishedApi
internal suspend fun <T> awaitPromiseLike(
    promise: PromiseLike<T>,
): T =
    suspendCancellableCoroutine(promise::thenTo)

internal suspend fun <T> awaitOptionalPromiseLike(
    promise: PromiseLike<T>?,
): T? =
    if (promise != null) {
        awaitPromiseLike(promise)
    } else null
