package js.promise

import kotlinx.coroutines.await

suspend inline fun <T> PromiseLike<T>.await(): T =
    unsafeCast<LegacyPromise<T>>().await()

suspend fun <T> PromiseLike<T>.toResult(): Result<T> =
    then(
        onFulfilled = { Result.success(it) },
        onRejected = { Result.failure(it) },
    ).await()
