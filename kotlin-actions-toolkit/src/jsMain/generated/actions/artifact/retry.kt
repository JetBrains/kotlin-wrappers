// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import actions.http.client.HttpClientResponse
import js.collections.ReadonlyMap
import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun retry(
    name: String,
    operation: () -> Promise<HttpClientResponse>,
    customErrorMessages: ReadonlyMap<Int, String>,
    maxAttempts: Number,
): HttpClientResponse

@JsName("retry")
external fun retryAsync(
    name: String,
    operation: () -> Promise<HttpClientResponse>,
    customErrorMessages: ReadonlyMap<Int, String>,
    maxAttempts: Number,
): Promise<HttpClientResponse>
