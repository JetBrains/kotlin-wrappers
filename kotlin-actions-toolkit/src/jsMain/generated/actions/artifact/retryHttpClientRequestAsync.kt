// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import actions.http.client.HttpClientResponse
import js.collections.ReadonlyMap
import js.promise.Promise

@JsName("retryHttpClientRequest")
external fun retryHttpClientRequestAsync(
    name: String,
    method: () -> Promise<HttpClientResponse>,
    customErrorMessages: ReadonlyMap<Int, String> = definedExternally,
    maxAttempts: Number = definedExternally,
): Promise<HttpClientResponse>
