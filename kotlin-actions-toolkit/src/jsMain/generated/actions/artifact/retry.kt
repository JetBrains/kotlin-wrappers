// Automatically generated - do not modify!

package actions.artifact

import actions.http.client.HttpClientResponse
import js.collections.ReadonlyMap
import js.promise.Promise
import js.promise.await

suspend fun retry(
    name: String,
    operation: () -> Promise<HttpClientResponse>,
    customErrorMessages: ReadonlyMap<Int, String>,
    maxAttempts: Number,
): HttpClientResponse =
    retryAsync(
        name = name,
        operation = operation,
        customErrorMessages = customErrorMessages,
        maxAttempts = maxAttempts,
    ).await()
