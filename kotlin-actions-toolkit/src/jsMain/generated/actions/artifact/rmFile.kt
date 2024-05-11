// Automatically generated - do not modify!

@file:JsModule("@actions/artifact")

package actions.artifact

import js.core.Void
import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun rmFile(filePath: String)

@JsName("rmFile")
external fun rmFileAsync(filePath: String): Promise<Void>
