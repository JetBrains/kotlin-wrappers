// Automatically generated - do not modify!

@file:JsModule("@actions/tool-cache")

package actions.tool.cache

import js.promise.Promise
import seskar.js.JsAsync

@JsAsync
external suspend fun cacheFile(
    sourceFile: String,
    targetFile: String,
    tool: String,
    version: String,
    arch: String = definedExternally,
): String

@JsName("cacheFile")
external fun cacheFileAsync(
    sourceFile: String,
    targetFile: String,
    tool: String,
    version: String,
    arch: String = definedExternally,
): Promise<String>
