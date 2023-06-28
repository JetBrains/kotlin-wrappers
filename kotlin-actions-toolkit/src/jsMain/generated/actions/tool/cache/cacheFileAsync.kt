// Automatically generated - do not modify!

@file:JsModule("@actions/tool-cache")

package actions.tool.cache

import js.promise.Promise

@JsName("cacheFile")
external fun cacheFileAsync(
    sourceFile: String,
    targetFile: String,
    tool: String,
    version: String,
    arch: String = definedExternally,
): Promise<String>
