// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun streamExtractExternal(
    url: String,
    directory: String,
): StreamExtractResponse

@JsName("streamExtractExternal")
external fun streamExtractExternalAsync(
    url: String,
    directory: String,
): Promise<StreamExtractResponse>
