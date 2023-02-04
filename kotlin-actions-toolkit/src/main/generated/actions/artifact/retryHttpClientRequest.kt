// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import actions.http.client.HttpClientResponse
import kotlin.js.Promise

external fun retryHttpClientRequest(
    name: String,
    method: () -> Promise<HttpClientResponse>,
    customErrorMessages: Map<Int, String> = definedExternally,
    maxAttempts: Number = definedExternally,
): Promise<HttpClientResponse>
