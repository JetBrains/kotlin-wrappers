// Automatically generated - do not modify!

package actions.tool.cache

import js.promise.await

suspend fun cacheFile(
    sourceFile: String,
    targetFile: String,
    tool: String,
    version: String,
): String =
    cacheFileAsync(
        sourceFile = sourceFile,
        targetFile = targetFile,
        tool = tool,
        version = version,
    ).await()

suspend fun cacheFile(
    sourceFile: String,
    targetFile: String,
    tool: String,
    version: String,
    arch: String,
): String =
    cacheFileAsync(
        sourceFile = sourceFile,
        targetFile = targetFile,
        tool = tool,
        version = version,
        arch = arch,
    ).await()
