// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import actions.http.client.HttpClientResponse
import js.promise.Promise

@JsName("retryHttpClientResponse")
external fun retryHttpClientResponseAsync(
    name: String,
    method: () -> Promise<HttpClientResponse>,
    maxAttempts: Number = definedExternally,
    delay: Number = definedExternally,
): Promise<HttpClientResponse>
