// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import actions.http.client.HttpClientResponse
import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun retryHttpClientResponse(
    name: String,
    method: () -> Promise<HttpClientResponse>,
    maxAttempts: Number = definedExternally,
    delay: Number = definedExternally,
): HttpClientResponse

@JsName("retryHttpClientResponse")
external fun retryHttpClientResponseAsync(
    name: String,
    method: () -> Promise<HttpClientResponse>,
    maxAttempts: Number = definedExternally,
    delay: Number = definedExternally,
): Promise<HttpClientResponse>
