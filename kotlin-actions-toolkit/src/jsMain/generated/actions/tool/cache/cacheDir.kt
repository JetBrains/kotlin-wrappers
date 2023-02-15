// Automatically generated - do not modify!

package actions.tool.cache

import kotlinx.coroutines.await

suspend fun cacheDir(
    sourceDir: String,
    tool: String,
    version: String,
): String =
    cacheDirAsync(
        sourceDir = sourceDir,
        tool = tool,
        version = version,
    ).await()

suspend fun cacheDir(
    sourceDir: String,
    tool: String,
    version: String,
    arch: String,
): String =
    cacheDirAsync(
        sourceDir = sourceDir,
        tool = tool,
        version = version,
        arch = arch,
    ).await()
