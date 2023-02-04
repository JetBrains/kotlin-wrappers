// Automatically generated - do not modify!

@file:JsModule("@actions/cache")

package actions.cache

import actions.http.client.HttpClientResponse
import kotlin.js.Promise

external fun retryHttpClientResponse(
    name: String,
    method: () -> Promise<HttpClientResponse>,
    maxAttempts: Number = definedExternally,
    delay: Number = definedExternally,
): Promise<HttpClientResponse>
