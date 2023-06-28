package js.promise

import kotlinx.coroutines.await

suspend inline fun <T> Promise<T>.await(): T =
    unsafeCast<LegacyPromise<T>>().await()

suspend fun <T> Promise<T>.toResult(): Result<T> =
    then(
        onFulfilled = { Result.success(it) },
        onRejected = { Result.failure(it) },
    ).await()
