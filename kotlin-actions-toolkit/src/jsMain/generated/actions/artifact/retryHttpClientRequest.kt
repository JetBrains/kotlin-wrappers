// Automatically generated - do not modify!

package actions.artifact

import actions.http.client.HttpClientResponse
import js.collections.ReadonlyMap
import js.promise.Promise
import js.promise.await

suspend fun retryHttpClientRequest(
    name: String,
    method: () -> Promise<HttpClientResponse>,
): HttpClientResponse =
    retryHttpClientRequestAsync(
        name = name,
        method = method,
    ).await()

suspend fun retryHttpClientRequest(
    name: String,
    method: () -> Promise<HttpClientResponse>,
    customErrorMessages: ReadonlyMap<Int, String>,
): HttpClientResponse =
    retryHttpClientRequestAsync(
        name = name,
        method = method,
        customErrorMessages = customErrorMessages,
    ).await()

suspend fun retryHttpClientRequest(
    name: String,
    method: () -> Promise<HttpClientResponse>,
    customErrorMessages: ReadonlyMap<Int, String>,
    maxAttempts: Number,
): HttpClientResponse =
    retryHttpClientRequestAsync(
        name = name,
        method = method,
        customErrorMessages = customErrorMessages,
        maxAttempts = maxAttempts,
    ).await()
