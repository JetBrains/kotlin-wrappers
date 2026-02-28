// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun createRawFileUploadStream(filePath: String): WaterMarkedUploadStream

@JsName("createRawFileUploadStream")
external fun createRawFileUploadStreamAsync(filePath: String): Promise<WaterMarkedUploadStream>
