// Automatically generated - do not modify!

@file:JsModule("@actions/tool-cache")

package actions.tool.cache

import kotlin.js.Promise

@JsName("cacheDir")
external fun cacheDirAsync(
    sourceDir: String,
    tool: String,
    version: String,
    arch: String = definedExternally,
): Promise<String>
