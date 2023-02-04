// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import actions.http.client.HttpClientResponse
import kotlin.js.Promise

external fun retry(
    name: String,
    operation: () -> Promise<HttpClientResponse>,
    customErrorMessages: Map<Int, String>,
    maxAttempts: Number,
): Promise<HttpClientResponse>
