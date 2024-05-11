// Automatically generated - do not modify!

@file:JsModule("@actions/tool-cache")

package actions.tool.cache

import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun extractZip(
    file: String,
    dest: String = definedExternally,
): String

@JsName("extractZip")
external fun extractZipAsync(
    file: String,
    dest: String = definedExternally,
): Promise<String>
