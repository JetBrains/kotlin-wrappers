package js.promise

import js.promise.internal.awaitPromiseLike

// TODO: remove after Seskar update
@PublishedApi
internal suspend fun <T> awaitInternal(
    p: PromiseLike<T>,
): T =
    awaitPromiseLike(p)
