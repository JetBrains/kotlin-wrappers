// Automatically generated - do not modify!

@file:JsModule("@actions/tool-cache")

package actions.tool.cache

import kotlin.js.Promise

external fun cacheFile(
    sourceFile: String,
    targetFile: String,
    tool: String,
    version: String,
    arch: String = definedExternally,
): Promise<String>
