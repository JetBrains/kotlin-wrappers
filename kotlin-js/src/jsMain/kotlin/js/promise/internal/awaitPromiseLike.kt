package js.promise.internal

import js.promise.LegacyPromise
import js.promise.PromiseLike
import kotlinx.coroutines.await

@PublishedApi
internal suspend fun <T> awaitPromiseLike(
    p: PromiseLike<T>,
): T =
    p.unsafeCast<LegacyPromise<T>>().await()
