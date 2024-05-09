package js.promise

import kotlinx.coroutines.await

@PublishedApi
internal suspend fun <T> awaitInternal(
    p: PromiseLike<T>,
): T =
    p.unsafeCast<LegacyPromise<T>>().await()
