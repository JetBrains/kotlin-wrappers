package js.promise

import kotlinx.coroutines.await

typealias Promise<T> = kotlin.js.Promise<T>

suspend fun <T> Promise<T>.toResult(): Result<T> =
    then(
        onFulfilled = { Result.success(it) },
        onRejected = { Result.failure(it) },
    ).await()
