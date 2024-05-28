// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun getFileSize(filePath: String): Number

@JsName("getFileSize")
external fun getFileSizeAsync(filePath: String): Promise<Number>
