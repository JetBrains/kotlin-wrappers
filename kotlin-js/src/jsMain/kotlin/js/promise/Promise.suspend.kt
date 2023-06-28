package js.promise

import kotlinx.coroutines.await

suspend fun <T> Promise<T>.toResult(): Result<T> =
    then(
        onFulfilled = { Result.success(it) },
        onRejected = { Result.failure(it) },
    ).await()
