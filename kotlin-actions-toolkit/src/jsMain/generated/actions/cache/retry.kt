// Automatically generated - do not modify!

package actions.cache

import js.promise.Promise
import kotlinx.coroutines.await

suspend fun <T> retry(
    name: String,
    method: () -> Promise<T>,
    getStatusCode: (arg0: T) -> Number?,
): T =
    retryAsync(
        name = name,
        method = method,
        getStatusCode = getStatusCode,
    ).await()

suspend fun <T> retry(
    name: String,
    method: () -> Promise<T>,
    getStatusCode: (arg0: T) -> Number?,
    maxAttempts: Number,
): T =
    retryAsync(
        name = name,
        method = method,
        getStatusCode = getStatusCode,
        maxAttempts = maxAttempts,
    ).await()

suspend fun <T> retry(
    name: String,
    method: () -> Promise<T>,
    getStatusCode: (arg0: T) -> Number?,
    maxAttempts: Number,
    delay: Number,
): T =
    retryAsync(
        name = name,
        method = method,
        getStatusCode = getStatusCode,
        maxAttempts = maxAttempts,
        delay = delay,
    ).await()

suspend fun <T> retry(
    name: String,
    method: () -> Promise<T>,
    getStatusCode: (arg0: T) -> Number?,
    maxAttempts: Number,
    delay: Number,
    onError: ((arg0: Error) -> T?)?,
): T =
    retryAsync(
        name = name,
        method = method,
        getStatusCode = getStatusCode,
        maxAttempts = maxAttempts,
        delay = delay,
        onError = onError,
    ).await()
